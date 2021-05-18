// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.servicebus.queue;

import com.azure.spring.integration.servicebus.ServiceBusClientConfig;
import com.azure.spring.integration.servicebus.converter.ServiceBusMessageConverter;
import com.azure.spring.integration.servicebus.factory.ServiceBusQueueClientFactory;
import com.azure.spring.integration.servicebus.support.ServiceBusProcessorClientWrapper;
import com.azure.spring.integration.test.support.SubscribeOperationTest;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class QueueTemplateSubscribeTest extends SubscribeOperationTest<ServiceBusQueueOperation> {

    @Mock
    private ServiceBusQueueClientFactory mockClientFactory;

    private ServiceBusProcessorClientWrapper processorClientWrapper;

    @Before
    public void setUp() {
        this.processorClientWrapper = new ServiceBusProcessorClientWrapper();
        this.subscribeOperation = new ServiceBusQueueTemplate(mockClientFactory, new ServiceBusMessageConverter());
        when(this.mockClientFactory.getOrCreateProcessor(eq(this.destination), any(), any())).thenReturn(
            processorClientWrapper.getClient());

    }

    @Override
    protected void verifySubscriberCreatorCalled() {
        verify(this.mockClientFactory, atLeastOnce()).getOrCreateProcessor(anyString(),
                                                                           any(ServiceBusClientConfig.class), any());
    }

    @Override
    protected void verifySubscriberCreatorNotCalled() {
        verify(this.mockClientFactory, never()).getOrCreateProcessor(anyString(), any(ServiceBusClientConfig.class),
                                                                     any());
    }

    @Override
    protected void verifySubscriberRegistered(int times) {
        final int initTimes = this.processorClientWrapper.getInitTimes();
        if (initTimes != times) {
            fail("Expect times: " + times + " and actual times: " + initTimes);
        }
    }

    @Override
    protected void verifySubscriberUnregistered(int times) {

    }

}
