// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the CheckNameAvailability operation. */
@Fluent
public final class ApiManagementServiceCheckNameAvailabilityParameters {
    /*
     * The name to check for availability.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of ApiManagementServiceCheckNameAvailabilityParameters class. */
    public ApiManagementServiceCheckNameAvailabilityParameters() {
    }

    /**
     * Get the name property: The name to check for availability.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name to check for availability.
     *
     * @param name the name value to set.
     * @return the ApiManagementServiceCheckNameAvailabilityParameters object itself.
     */
    public ApiManagementServiceCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ApiManagementServiceCheckNameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER =
        new ClientLogger(ApiManagementServiceCheckNameAvailabilityParameters.class);
}
