// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.models.Application;

/** Samples for Application Update. */
public final class ApplicationUpdateSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-10-01/examples/ApplicationUpdate.json
     */
    /**
     * Sample code: ApplicationUpdate.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void applicationUpdate(com.azure.resourcemanager.batch.BatchManager manager) {
        Application resource =
            manager
                .applications()
                .getWithResponse("default-azurebatch-japaneast", "sampleacct", "app1", Context.NONE)
                .getValue();
        resource.update().withDisplayName("myAppName").withAllowUpdates(true).withDefaultVersion("2").apply();
    }
}
