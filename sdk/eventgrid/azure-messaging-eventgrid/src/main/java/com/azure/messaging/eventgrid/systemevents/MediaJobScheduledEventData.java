// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import java.util.Map;

/**
 * Job scheduled event data. Schema of the data property of an EventGridEvent for a Microsoft.Media.JobScheduled event.
 */
@Immutable
public final class MediaJobScheduledEventData extends MediaJobStateChangeEventData {
    /** {@inheritDoc} */
    @Override
    public MediaJobScheduledEventData setCorrelationData(Map<String, String> correlationData) {
        super.setCorrelationData(correlationData);
        return this;
    }
}
