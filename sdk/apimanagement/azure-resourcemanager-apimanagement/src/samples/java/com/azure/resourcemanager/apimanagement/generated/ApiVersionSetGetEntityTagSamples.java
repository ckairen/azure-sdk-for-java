// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for ApiVersionSet GetEntityTag. */
public final class ApiVersionSetGetEntityTagSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementHeadApiVersionSet.json
     */
    /**
     * Sample code: ApiManagementHeadApiVersionSet.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadApiVersionSet(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiVersionSets()
            .getEntityTagWithResponse("rg1", "apimService1", "vs1", com.azure.core.util.Context.NONE);
    }
}
