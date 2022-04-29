// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Additional information about Azure File Share backup item. */
@Fluent
public final class AzureFileshareProtectedItemExtendedInfo {
    /*
     * The oldest backup copy available for this item in the service.
     */
    @JsonProperty(value = "oldestRecoveryPoint")
    private OffsetDateTime oldestRecoveryPoint;

    /*
     * Number of available backup copies associated with this backup item.
     */
    @JsonProperty(value = "recoveryPointCount")
    private Integer recoveryPointCount;

    /*
     * Indicates consistency of policy object and policy applied to this backup
     * item.
     */
    @JsonProperty(value = "policyState")
    private String policyState;

    /*
     * Indicates the state of this resource. Possible values are from enum
     * ResourceState {Invalid, Active, SoftDeleted, Deleted}
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceState;

    /*
     * The resource state sync time for this backup item.
     */
    @JsonProperty(value = "resourceStateSyncTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime resourceStateSyncTime;

    /**
     * Get the oldestRecoveryPoint property: The oldest backup copy available for this item in the service.
     *
     * @return the oldestRecoveryPoint value.
     */
    public OffsetDateTime oldestRecoveryPoint() {
        return this.oldestRecoveryPoint;
    }

    /**
     * Set the oldestRecoveryPoint property: The oldest backup copy available for this item in the service.
     *
     * @param oldestRecoveryPoint the oldestRecoveryPoint value to set.
     * @return the AzureFileshareProtectedItemExtendedInfo object itself.
     */
    public AzureFileshareProtectedItemExtendedInfo withOldestRecoveryPoint(OffsetDateTime oldestRecoveryPoint) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        return this;
    }

    /**
     * Get the recoveryPointCount property: Number of available backup copies associated with this backup item.
     *
     * @return the recoveryPointCount value.
     */
    public Integer recoveryPointCount() {
        return this.recoveryPointCount;
    }

    /**
     * Set the recoveryPointCount property: Number of available backup copies associated with this backup item.
     *
     * @param recoveryPointCount the recoveryPointCount value to set.
     * @return the AzureFileshareProtectedItemExtendedInfo object itself.
     */
    public AzureFileshareProtectedItemExtendedInfo withRecoveryPointCount(Integer recoveryPointCount) {
        this.recoveryPointCount = recoveryPointCount;
        return this;
    }

    /**
     * Get the policyState property: Indicates consistency of policy object and policy applied to this backup item.
     *
     * @return the policyState value.
     */
    public String policyState() {
        return this.policyState;
    }

    /**
     * Set the policyState property: Indicates consistency of policy object and policy applied to this backup item.
     *
     * @param policyState the policyState value to set.
     * @return the AzureFileshareProtectedItemExtendedInfo object itself.
     */
    public AzureFileshareProtectedItemExtendedInfo withPolicyState(String policyState) {
        this.policyState = policyState;
        return this;
    }

    /**
     * Get the resourceState property: Indicates the state of this resource. Possible values are from enum ResourceState
     * {Invalid, Active, SoftDeleted, Deleted}.
     *
     * @return the resourceState value.
     */
    public String resourceState() {
        return this.resourceState;
    }

    /**
     * Get the resourceStateSyncTime property: The resource state sync time for this backup item.
     *
     * @return the resourceStateSyncTime value.
     */
    public OffsetDateTime resourceStateSyncTime() {
        return this.resourceStateSyncTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
