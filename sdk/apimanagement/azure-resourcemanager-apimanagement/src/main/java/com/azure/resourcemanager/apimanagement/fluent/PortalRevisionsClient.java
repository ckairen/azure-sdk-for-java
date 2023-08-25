// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalRevisionContractInner;
import com.azure.resourcemanager.apimanagement.models.PortalRevisionsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.PortalRevisionsGetResponse;

/** An instance of this class provides access to all the operations defined in PortalRevisionsClient. */
public interface PortalRevisionsClient {
    /**
     * Lists developer portal's revisions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of portal revisions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PortalRevisionContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists developer portal's revisions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Supported operators | Supported functions |
     *     |-------------|------------------------|-----------------------------------|
     *     <p>|name | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith| |description | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith| |isCurrent | eq, ne | |.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of portal revisions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PortalRevisionContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the developer portal revision specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal revision specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalRevisionsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String portalRevisionId, Context context);

    /**
     * Gets the developer portal revision specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String portalRevisionId);

    /**
     * Gets the developer portal's revision specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal's revision specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalRevisionsGetResponse getWithResponse(
        String resourceGroupName, String serviceName, String portalRevisionId, Context context);

    /**
     * Gets the developer portal's revision specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the developer portal's revision specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalRevisionContractInner get(String resourceGroupName, String serviceName, String portalRevisionId);

    /**
     * Creates a new developer portal's revision by running the portal's publishing. The `isCurrent` property indicates
     * if the revision is publicly accessible.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param parameters Portal Revision's contract details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PortalRevisionContractInner>, PortalRevisionContractInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, String portalRevisionId, PortalRevisionContractInner parameters);

    /**
     * Creates a new developer portal's revision by running the portal's publishing. The `isCurrent` property indicates
     * if the revision is publicly accessible.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param parameters Portal Revision's contract details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PortalRevisionContractInner>, PortalRevisionContractInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serviceName,
        String portalRevisionId,
        PortalRevisionContractInner parameters,
        Context context);

    /**
     * Creates a new developer portal's revision by running the portal's publishing. The `isCurrent` property indicates
     * if the revision is publicly accessible.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param parameters Portal Revision's contract details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalRevisionContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String portalRevisionId, PortalRevisionContractInner parameters);

    /**
     * Creates a new developer portal's revision by running the portal's publishing. The `isCurrent` property indicates
     * if the revision is publicly accessible.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param parameters Portal Revision's contract details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalRevisionContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String portalRevisionId,
        PortalRevisionContractInner parameters,
        Context context);

    /**
     * Updates the description of specified portal revision or makes it current.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Portal Revision's contract details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PortalRevisionContractInner>, PortalRevisionContractInner> beginUpdate(
        String resourceGroupName,
        String serviceName,
        String portalRevisionId,
        String ifMatch,
        PortalRevisionContractInner parameters);

    /**
     * Updates the description of specified portal revision or makes it current.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Portal Revision's contract details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PortalRevisionContractInner>, PortalRevisionContractInner> beginUpdate(
        String resourceGroupName,
        String serviceName,
        String portalRevisionId,
        String ifMatch,
        PortalRevisionContractInner parameters,
        Context context);

    /**
     * Updates the description of specified portal revision or makes it current.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Portal Revision's contract details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalRevisionContractInner update(
        String resourceGroupName,
        String serviceName,
        String portalRevisionId,
        String ifMatch,
        PortalRevisionContractInner parameters);

    /**
     * Updates the description of specified portal revision or makes it current.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param portalRevisionId Portal revision identifier. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Portal Revision's contract details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return portal Revision's contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalRevisionContractInner update(
        String resourceGroupName,
        String serviceName,
        String portalRevisionId,
        String ifMatch,
        PortalRevisionContractInner parameters,
        Context context);
}
