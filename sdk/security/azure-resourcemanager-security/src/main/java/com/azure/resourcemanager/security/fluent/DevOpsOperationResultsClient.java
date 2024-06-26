// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.OperationStatusResultInner;

/**
 * An instance of this class provides access to all the operations defined in DevOpsOperationResultsClient.
 */
public interface DevOpsOperationResultsClient {
    /**
     * Get devops long running operation result.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param operationResultId The operation result Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return devops long running operation result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationStatusResultInner> getWithResponse(String resourceGroupName, String securityConnectorName,
        String operationResultId, Context context);

    /**
     * Get devops long running operation result.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param operationResultId The operation result Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return devops long running operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner get(String resourceGroupName, String securityConnectorName, String operationResultId);
}
