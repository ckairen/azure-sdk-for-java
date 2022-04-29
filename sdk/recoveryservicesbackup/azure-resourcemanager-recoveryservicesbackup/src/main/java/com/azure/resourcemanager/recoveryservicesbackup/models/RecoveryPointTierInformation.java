// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Recovery point tier information. */
@Fluent
public class RecoveryPointTierInformation {
    /*
     * Recovery point tier type.
     */
    @JsonProperty(value = "type")
    private RecoveryPointTierType type;

    /*
     * Recovery point tier status.
     */
    @JsonProperty(value = "status")
    private RecoveryPointTierStatus status;

    /*
     * Recovery point tier status.
     */
    @JsonProperty(value = "extendedInfo")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> extendedInfo;

    /**
     * Get the type property: Recovery point tier type.
     *
     * @return the type value.
     */
    public RecoveryPointTierType type() {
        return this.type;
    }

    /**
     * Set the type property: Recovery point tier type.
     *
     * @param type the type value to set.
     * @return the RecoveryPointTierInformation object itself.
     */
    public RecoveryPointTierInformation withType(RecoveryPointTierType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the status property: Recovery point tier status.
     *
     * @return the status value.
     */
    public RecoveryPointTierStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Recovery point tier status.
     *
     * @param status the status value to set.
     * @return the RecoveryPointTierInformation object itself.
     */
    public RecoveryPointTierInformation withStatus(RecoveryPointTierStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the extendedInfo property: Recovery point tier status.
     *
     * @return the extendedInfo value.
     */
    public Map<String, String> extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Recovery point tier status.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the RecoveryPointTierInformation object itself.
     */
    public RecoveryPointTierInformation withExtendedInfo(Map<String, String> extendedInfo) {
        this.extendedInfo = extendedInfo;
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
