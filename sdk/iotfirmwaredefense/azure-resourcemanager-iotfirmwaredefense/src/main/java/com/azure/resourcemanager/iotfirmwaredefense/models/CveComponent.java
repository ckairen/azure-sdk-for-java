// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the SBOM component for a CVE.
 */
@Fluent
public final class CveComponent {
    /*
     * ID of the SBOM component
     */
    @JsonProperty(value = "componentId")
    private String componentId;

    /*
     * Name of the SBOM component
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Version of the SBOM component.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Creates an instance of CveComponent class.
     */
    public CveComponent() {
    }

    /**
     * Get the componentId property: ID of the SBOM component.
     * 
     * @return the componentId value.
     */
    public String componentId() {
        return this.componentId;
    }

    /**
     * Set the componentId property: ID of the SBOM component.
     * 
     * @param componentId the componentId value to set.
     * @return the CveComponent object itself.
     */
    public CveComponent withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * Get the name property: Name of the SBOM component.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SBOM component.
     * 
     * @param name the name value to set.
     * @return the CveComponent object itself.
     */
    public CveComponent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: Version of the SBOM component.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the SBOM component.
     * 
     * @param version the version value to set.
     * @return the CveComponent object itself.
     */
    public CveComponent withVersion(String version) {
        this.version = version;
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
