// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.VolumeGroupsClient;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupDetailsInner;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupInner;
import com.azure.resourcemanager.netapp.models.VolumeGroup;
import com.azure.resourcemanager.netapp.models.VolumeGroupDetails;
import com.azure.resourcemanager.netapp.models.VolumeGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VolumeGroupsImpl implements VolumeGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumeGroupsImpl.class);

    private final VolumeGroupsClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public VolumeGroupsImpl(
        VolumeGroupsClient innerClient, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VolumeGroup> listByNetAppAccount(String resourceGroupName, String accountName) {
        PagedIterable<VolumeGroupInner> inner =
            this.serviceClient().listByNetAppAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new VolumeGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<VolumeGroup> listByNetAppAccount(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<VolumeGroupInner> inner =
            this.serviceClient().listByNetAppAccount(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new VolumeGroupImpl(inner1, this.manager()));
    }

    public VolumeGroupDetails get(String resourceGroupName, String accountName, String volumeGroupName) {
        VolumeGroupDetailsInner inner = this.serviceClient().get(resourceGroupName, accountName, volumeGroupName);
        if (inner != null) {
            return new VolumeGroupDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VolumeGroupDetails> getWithResponse(
        String resourceGroupName, String accountName, String volumeGroupName, Context context) {
        Response<VolumeGroupDetailsInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, volumeGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VolumeGroupDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String volumeGroupName) {
        this.serviceClient().delete(resourceGroupName, accountName, volumeGroupName);
    }

    public void delete(String resourceGroupName, String accountName, String volumeGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, volumeGroupName, context);
    }

    public VolumeGroupDetails getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumeGroups");
        if (volumeGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumeGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, volumeGroupName, Context.NONE).getValue();
    }

    public Response<VolumeGroupDetails> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumeGroups");
        if (volumeGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumeGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, volumeGroupName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumeGroups");
        if (volumeGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumeGroups'.", id)));
        }
        this.delete(resourceGroupName, accountName, volumeGroupName, Context.NONE);
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
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumeGroups");
        if (volumeGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumeGroups'.", id)));
        }
        this.delete(resourceGroupName, accountName, volumeGroupName, context);
    }

    private VolumeGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public VolumeGroupDetailsImpl define(String name) {
        return new VolumeGroupDetailsImpl(name, this.manager());
    }
}
