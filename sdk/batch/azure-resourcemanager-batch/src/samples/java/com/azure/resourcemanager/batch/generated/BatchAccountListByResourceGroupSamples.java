// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;

/** Samples for BatchAccount ListByResourceGroup. */
public final class BatchAccountListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-10-01/examples/BatchAccountListByResourceGroup.json
     */
    /**
     * Sample code: BatchAccountListByResourceGroup.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void batchAccountListByResourceGroup(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.batchAccounts().listByResourceGroup("default-azurebatch-japaneast", Context.NONE);
    }
}
