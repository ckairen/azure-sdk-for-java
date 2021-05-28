// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result info class to be used to report result status for actions/operations.
 */
@Fluent
public final class ResultInfo {
    /*
     * Gets or sets the result code For synchronous failures, this maps one-to-one
     * with HTTP responses. For asynchronous failures or messages, it is contextual.
     */
    @JsonProperty(value = "code")
    private Integer code;

    /*
     * Gets or sets the result subcode. The subcode further classifies a failure.
     * For example.
     */
    @JsonProperty(value = "subcode")
    private Integer subcode;

    /*
     * Gets or sets the message The message is a detail explanation of subcode.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: Gets or sets the result code For synchronous failures,
     * this maps one-to-one with HTTP responses. For asynchronous failures or
     * messages, it is contextual.
     *
     * @return the code value.
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * Set the code property: Gets or sets the result code For synchronous failures,
     * this maps one-to-one with HTTP responses. For asynchronous failures or
     * messages, it is contextual.
     *
     * @param code the code value to set.
     * @return the ResultInfo object itself.
     */
    public ResultInfo setCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Get the subcode property: Gets or sets the result subcode. The subcode
     * further classifies a failure. For example.
     *
     * @return the subcode value.
     */
    public Integer getSubcode() {
        return this.subcode;
    }

    /**
     * Set the subcode property: Gets or sets the result subcode. The subcode
     * further classifies a failure. For example.
     *
     * @param subcode the subcode value to set.
     * @return the ResultInfo object itself.
     */
    public ResultInfo setSubcode(Integer subcode) {
        this.subcode = subcode;
        return this;
    }

    /**
     * Get the message property: Gets or sets the message The message is a detail
     * explanation of subcode.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Gets or sets the message The message is a detail
     * explanation of subcode.
     *
     * @param message the message value to set.
     * @return the ResultInfo object itself.
     */
    public ResultInfo setMessage(String message) {
        this.message = message;
        return this;
    }
}
