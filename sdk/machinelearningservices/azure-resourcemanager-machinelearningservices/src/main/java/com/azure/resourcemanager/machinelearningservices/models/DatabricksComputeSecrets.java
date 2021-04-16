// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ComputeSecretsInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Secrets related to a Machine Learning compute based on Databricks. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("Databricks")
@Fluent
public final class DatabricksComputeSecrets extends ComputeSecretsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabricksComputeSecrets.class);

    /*
     * access token for databricks account.
     */
    @JsonProperty(value = "databricksAccessToken")
    private String databricksAccessToken;

    /**
     * Get the databricksAccessToken property: access token for databricks account.
     *
     * @return the databricksAccessToken value.
     */
    public String databricksAccessToken() {
        return this.databricksAccessToken;
    }

    /**
     * Set the databricksAccessToken property: access token for databricks account.
     *
     * @param databricksAccessToken the databricksAccessToken value to set.
     * @return the DatabricksComputeSecrets object itself.
     */
    public DatabricksComputeSecrets withDatabricksAccessToken(String databricksAccessToken) {
        this.databricksAccessToken = databricksAccessToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
