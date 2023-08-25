// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for OpenIdConnectProvider CreateOrUpdate. */
public final class OpenIdConnectProviderCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementCreateOpenIdConnectProvider.json
     */
    /**
     * Sample code: ApiManagementCreateOpenIdConnectProvider.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateOpenIdConnectProvider(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .openIdConnectProviders()
            .define("templateOpenIdConnect3")
            .withExistingService("rg1", "apimService1")
            .withDisplayName("templateoidprovider3")
            .withMetadataEndpoint("https://oidprovider-template3.net")
            .withClientId("oidprovidertemplate3")
            .withClientSecret("x")
            .withUseInTestConsole(false)
            .withUseInApiDocumentation(true)
            .create();
    }
}
