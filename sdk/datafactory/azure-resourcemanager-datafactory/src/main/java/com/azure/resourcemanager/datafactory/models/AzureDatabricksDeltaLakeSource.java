// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Databricks Delta Lake source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeSource")
@Fluent
public final class AzureDatabricksDeltaLakeSource extends CopySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureDatabricksDeltaLakeSource.class);

    /*
     * Azure Databricks Delta Lake Sql query. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * Azure Databricks Delta Lake export settings.
     */
    @JsonProperty(value = "exportSettings")
    private AzureDatabricksDeltaLakeExportCommand exportSettings;

    /**
     * Get the query property: Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType
     * string).
     *
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType
     * string).
     *
     * @param query the query value to set.
     * @return the AzureDatabricksDeltaLakeSource object itself.
     */
    public AzureDatabricksDeltaLakeSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the exportSettings property: Azure Databricks Delta Lake export settings.
     *
     * @return the exportSettings value.
     */
    public AzureDatabricksDeltaLakeExportCommand exportSettings() {
        return this.exportSettings;
    }

    /**
     * Set the exportSettings property: Azure Databricks Delta Lake export settings.
     *
     * @param exportSettings the exportSettings value to set.
     * @return the AzureDatabricksDeltaLakeSource object itself.
     */
    public AzureDatabricksDeltaLakeSource withExportSettings(AzureDatabricksDeltaLakeExportCommand exportSettings) {
        this.exportSettings = exportSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (exportSettings() != null) {
            exportSettings().validate();
        }
    }
}
