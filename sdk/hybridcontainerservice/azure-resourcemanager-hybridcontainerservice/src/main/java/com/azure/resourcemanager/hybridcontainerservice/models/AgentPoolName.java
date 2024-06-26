// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name of the default Agent Pool.
 */
@Fluent
public class AgentPoolName {
    /*
     * Unique name of the default agent pool in the context of the provisioned cluster. Default value is
     * <clusterName>-nodepool1
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of AgentPoolName class.
     */
    public AgentPoolName() {
    }

    /**
     * Get the name property: Unique name of the default agent pool in the context of the provisioned cluster. Default
     * value is &lt;clusterName&gt;-nodepool1.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique name of the default agent pool in the context of the provisioned cluster. Default
     * value is &lt;clusterName&gt;-nodepool1.
     * 
     * @param name the name value to set.
     * @return the AgentPoolName object itself.
     */
    public AgentPoolName withName(String name) {
        this.name = name;
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
