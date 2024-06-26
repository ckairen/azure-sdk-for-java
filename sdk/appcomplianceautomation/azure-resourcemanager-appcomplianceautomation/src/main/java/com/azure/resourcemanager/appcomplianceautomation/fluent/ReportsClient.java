// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportResourceInner;

/** An instance of this class provides access to all the operations defined in ReportsClient. */
public interface ReportsClient {
    /**
     * Get the AppComplianceAutomation report list for the tenant.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation report list for the tenant as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReportResourceInner> list();

    /**
     * Get the AppComplianceAutomation report list for the tenant.
     *
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     *     ?$select=reportName,id.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation report list for the tenant as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReportResourceInner> list(
        String skipToken, Integer top, String select, String offerGuid, String reportCreatorTenantId, Context context);
}
