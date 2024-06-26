// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterUpgradeProfileProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of available kubernetes version upgrades for the provisioned cluster.
 */
@Fluent
public final class ProvisionedClusterUpgradeProfileInner extends ProxyResource {
    /*
     * The properties of the upgrade profile.
     */
    @JsonProperty(value = "properties", required = true)
    private ProvisionedClusterUpgradeProfileProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ProvisionedClusterUpgradeProfileInner class.
     */
    public ProvisionedClusterUpgradeProfileInner() {
    }

    /**
     * Get the properties property: The properties of the upgrade profile.
     * 
     * @return the properties value.
     */
    public ProvisionedClusterUpgradeProfileProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the upgrade profile.
     * 
     * @param properties the properties value to set.
     * @return the ProvisionedClusterUpgradeProfileInner object itself.
     */
    public ProvisionedClusterUpgradeProfileInner withProperties(ProvisionedClusterUpgradeProfileProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property properties in model ProvisionedClusterUpgradeProfileInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProvisionedClusterUpgradeProfileInner.class);
}
