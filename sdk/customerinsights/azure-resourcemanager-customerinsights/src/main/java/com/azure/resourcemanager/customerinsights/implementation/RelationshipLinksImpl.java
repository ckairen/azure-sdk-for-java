// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.RelationshipLinksClient;
import com.azure.resourcemanager.customerinsights.fluent.models.RelationshipLinkResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.RelationshipLinkResourceFormat;
import com.azure.resourcemanager.customerinsights.models.RelationshipLinks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RelationshipLinksImpl implements RelationshipLinks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RelationshipLinksImpl.class);

    private final RelationshipLinksClient innerClient;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public RelationshipLinksImpl(
        RelationshipLinksClient innerClient,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RelationshipLinkResourceFormat get(String resourceGroupName, String hubName, String relationshipLinkName) {
        RelationshipLinkResourceFormatInner inner =
            this.serviceClient().get(resourceGroupName, hubName, relationshipLinkName);
        if (inner != null) {
            return new RelationshipLinkResourceFormatImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RelationshipLinkResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String relationshipLinkName, Context context) {
        Response<RelationshipLinkResourceFormatInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, hubName, relationshipLinkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RelationshipLinkResourceFormatImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String hubName, String relationshipLinkName) {
        this.serviceClient().delete(resourceGroupName, hubName, relationshipLinkName);
    }

    public void delete(String resourceGroupName, String hubName, String relationshipLinkName, Context context) {
        this.serviceClient().delete(resourceGroupName, hubName, relationshipLinkName, context);
    }

    public PagedIterable<RelationshipLinkResourceFormat> listByHub(String resourceGroupName, String hubName) {
        PagedIterable<RelationshipLinkResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName);
        return Utils.mapPage(inner, inner1 -> new RelationshipLinkResourceFormatImpl(inner1, this.manager()));
    }

    public PagedIterable<RelationshipLinkResourceFormat> listByHub(
        String resourceGroupName, String hubName, Context context) {
        PagedIterable<RelationshipLinkResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName, context);
        return Utils.mapPage(inner, inner1 -> new RelationshipLinkResourceFormatImpl(inner1, this.manager()));
    }

    public RelationshipLinkResourceFormat getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipLinkName = Utils.getValueFromIdByName(id, "relationshipLinks");
        if (relationshipLinkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'relationshipLinks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, relationshipLinkName, Context.NONE).getValue();
    }

    public Response<RelationshipLinkResourceFormat> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipLinkName = Utils.getValueFromIdByName(id, "relationshipLinks");
        if (relationshipLinkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'relationshipLinks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, relationshipLinkName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipLinkName = Utils.getValueFromIdByName(id, "relationshipLinks");
        if (relationshipLinkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'relationshipLinks'.", id)));
        }
        this.delete(resourceGroupName, hubName, relationshipLinkName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipLinkName = Utils.getValueFromIdByName(id, "relationshipLinks");
        if (relationshipLinkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'relationshipLinks'.", id)));
        }
        this.delete(resourceGroupName, hubName, relationshipLinkName, context);
    }

    private RelationshipLinksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    public RelationshipLinkResourceFormatImpl define(String name) {
        return new RelationshipLinkResourceFormatImpl(name, this.manager());
    }
}
