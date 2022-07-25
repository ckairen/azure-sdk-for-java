// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2022-06-01/examples/PrivateEndpointConnectionsGet.json
     */
    /**
     * Sample code: Get Private Endpoint Connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .getWithResponse("rg1", "clustername1", "privateendpointconnection1", Context.NONE);
    }
}
