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

/** Sftp write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SftpWriteSettings")
@Fluent
public final class SftpWriteSettings extends StoreWriteSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SftpWriteSettings.class);

    /*
     * Specifies the timeout for writing each chunk to SFTP server. Default
     * value: 01:00:00 (one hour). Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "operationTimeout")
    private Object operationTimeout;

    /*
     * Upload to temporary file(s) and rename. Disable this option if your SFTP
     * server doesn't support rename operation. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "useTempFileRename")
    private Object useTempFileRename;

    /**
     * Get the operationTimeout property: Specifies the timeout for writing each chunk to SFTP server. Default value:
     * 01:00:00 (one hour). Type: string (or Expression with resultType string).
     *
     * @return the operationTimeout value.
     */
    public Object operationTimeout() {
        return this.operationTimeout;
    }

    /**
     * Set the operationTimeout property: Specifies the timeout for writing each chunk to SFTP server. Default value:
     * 01:00:00 (one hour). Type: string (or Expression with resultType string).
     *
     * @param operationTimeout the operationTimeout value to set.
     * @return the SftpWriteSettings object itself.
     */
    public SftpWriteSettings withOperationTimeout(Object operationTimeout) {
        this.operationTimeout = operationTimeout;
        return this;
    }

    /**
     * Get the useTempFileRename property: Upload to temporary file(s) and rename. Disable this option if your SFTP
     * server doesn't support rename operation. Type: boolean (or Expression with resultType boolean).
     *
     * @return the useTempFileRename value.
     */
    public Object useTempFileRename() {
        return this.useTempFileRename;
    }

    /**
     * Set the useTempFileRename property: Upload to temporary file(s) and rename. Disable this option if your SFTP
     * server doesn't support rename operation. Type: boolean (or Expression with resultType boolean).
     *
     * @param useTempFileRename the useTempFileRename value to set.
     * @return the SftpWriteSettings object itself.
     */
    public SftpWriteSettings withUseTempFileRename(Object useTempFileRename) {
        this.useTempFileRename = useTempFileRename;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SftpWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SftpWriteSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SftpWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
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
