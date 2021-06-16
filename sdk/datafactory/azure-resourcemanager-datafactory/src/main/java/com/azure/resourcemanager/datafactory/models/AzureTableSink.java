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

/** A copy activity Azure Table sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureTableSink")
@Fluent
public final class AzureTableSink extends CopySink {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureTableSink.class);

    /*
     * Azure Table default partition key value. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "azureTableDefaultPartitionKeyValue")
    private Object azureTableDefaultPartitionKeyValue;

    /*
     * Azure Table partition key name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "azureTablePartitionKeyName")
    private Object azureTablePartitionKeyName;

    /*
     * Azure Table row key name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "azureTableRowKeyName")
    private Object azureTableRowKeyName;

    /*
     * Azure Table insert type. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "azureTableInsertType")
    private Object azureTableInsertType;

    /**
     * Get the azureTableDefaultPartitionKeyValue property: Azure Table default partition key value. Type: string (or
     * Expression with resultType string).
     *
     * @return the azureTableDefaultPartitionKeyValue value.
     */
    public Object azureTableDefaultPartitionKeyValue() {
        return this.azureTableDefaultPartitionKeyValue;
    }

    /**
     * Set the azureTableDefaultPartitionKeyValue property: Azure Table default partition key value. Type: string (or
     * Expression with resultType string).
     *
     * @param azureTableDefaultPartitionKeyValue the azureTableDefaultPartitionKeyValue value to set.
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTableDefaultPartitionKeyValue(Object azureTableDefaultPartitionKeyValue) {
        this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
        return this;
    }

    /**
     * Get the azureTablePartitionKeyName property: Azure Table partition key name. Type: string (or Expression with
     * resultType string).
     *
     * @return the azureTablePartitionKeyName value.
     */
    public Object azureTablePartitionKeyName() {
        return this.azureTablePartitionKeyName;
    }

    /**
     * Set the azureTablePartitionKeyName property: Azure Table partition key name. Type: string (or Expression with
     * resultType string).
     *
     * @param azureTablePartitionKeyName the azureTablePartitionKeyName value to set.
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTablePartitionKeyName(Object azureTablePartitionKeyName) {
        this.azureTablePartitionKeyName = azureTablePartitionKeyName;
        return this;
    }

    /**
     * Get the azureTableRowKeyName property: Azure Table row key name. Type: string (or Expression with resultType
     * string).
     *
     * @return the azureTableRowKeyName value.
     */
    public Object azureTableRowKeyName() {
        return this.azureTableRowKeyName;
    }

    /**
     * Set the azureTableRowKeyName property: Azure Table row key name. Type: string (or Expression with resultType
     * string).
     *
     * @param azureTableRowKeyName the azureTableRowKeyName value to set.
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTableRowKeyName(Object azureTableRowKeyName) {
        this.azureTableRowKeyName = azureTableRowKeyName;
        return this;
    }

    /**
     * Get the azureTableInsertType property: Azure Table insert type. Type: string (or Expression with resultType
     * string).
     *
     * @return the azureTableInsertType value.
     */
    public Object azureTableInsertType() {
        return this.azureTableInsertType;
    }

    /**
     * Set the azureTableInsertType property: Azure Table insert type. Type: string (or Expression with resultType
     * string).
     *
     * @param azureTableInsertType the azureTableInsertType value to set.
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTableInsertType(Object azureTableInsertType) {
        this.azureTableInsertType = azureTableInsertType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableSink withDisableMetricsCollection(Object disableMetricsCollection) {
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
    }
}
