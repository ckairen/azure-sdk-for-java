// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BackupStatus request. */
@Fluent
public final class BackupStatusRequest {
    /*
     * Container Type - VM, SQLPaaS, DPM, AzureFileShare...
     */
    @JsonProperty(value = "resourceType")
    private DataSourceType resourceType;

    /*
     * Entire ARM resource id of the resource
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Protectable Item Logical Name
     */
    @JsonProperty(value = "poLogicalName")
    private String poLogicalName;

    /**
     * Get the resourceType property: Container Type - VM, SQLPaaS, DPM, AzureFileShare...
     *
     * @return the resourceType value.
     */
    public DataSourceType resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Container Type - VM, SQLPaaS, DPM, AzureFileShare...
     *
     * @param resourceType the resourceType value to set.
     * @return the BackupStatusRequest object itself.
     */
    public BackupStatusRequest withResourceType(DataSourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceId property: Entire ARM resource id of the resource.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Entire ARM resource id of the resource.
     *
     * @param resourceId the resourceId value to set.
     * @return the BackupStatusRequest object itself.
     */
    public BackupStatusRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the poLogicalName property: Protectable Item Logical Name.
     *
     * @return the poLogicalName value.
     */
    public String poLogicalName() {
        return this.poLogicalName;
    }

    /**
     * Set the poLogicalName property: Protectable Item Logical Name.
     *
     * @param poLogicalName the poLogicalName value to set.
     * @return the BackupStatusRequest object itself.
     */
    public BackupStatusRequest withPoLogicalName(String poLogicalName) {
        this.poLogicalName = poLogicalName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
