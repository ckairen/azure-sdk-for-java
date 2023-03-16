// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.CheckNameResourceTypes;
import com.azure.resourcemanager.netapp.models.ResourceNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class ResourceNameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceNameAvailabilityRequest model =
            BinaryData
                .fromString(
                    "{\"name\":\"jjgpb\",\"type\":\"Microsoft.NetApp/netAppAccounts\",\"resourceGroup\":\"qcjm\"}")
                .toObject(ResourceNameAvailabilityRequest.class);
        Assertions.assertEquals("jjgpb", model.name());
        Assertions.assertEquals(CheckNameResourceTypes.MICROSOFT_NET_APP_NET_APP_ACCOUNTS, model.type());
        Assertions.assertEquals("qcjm", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceNameAvailabilityRequest model =
            new ResourceNameAvailabilityRequest()
                .withName("jjgpb")
                .withType(CheckNameResourceTypes.MICROSOFT_NET_APP_NET_APP_ACCOUNTS)
                .withResourceGroup("qcjm");
        model = BinaryData.fromObject(model).toObject(ResourceNameAvailabilityRequest.class);
        Assertions.assertEquals("jjgpb", model.name());
        Assertions.assertEquals(CheckNameResourceTypes.MICROSOFT_NET_APP_NET_APP_ACCOUNTS, model.type());
        Assertions.assertEquals("qcjm", model.resourceGroup());
    }
}
