// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** Samples for ApiPolicy Delete. */
public final class ApiPolicyDeleteSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementDeleteApiPolicy.json
     */
    /**
     * Sample code: ApiManagementDeleteApiPolicy.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteApiPolicy(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiPolicies()
            .deleteWithResponse(
                "rg1", "apimService1", "loggerId", PolicyIdName.POLICY, "*", com.azure.core.util.Context.NONE);
    }
}
