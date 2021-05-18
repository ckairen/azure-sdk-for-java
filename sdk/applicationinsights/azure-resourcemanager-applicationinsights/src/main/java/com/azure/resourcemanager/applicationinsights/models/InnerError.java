// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Inner error. */
@Fluent
public final class InnerError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InnerError.class);

    /*
     * Provides correlation for request
     */
    @JsonProperty(value = "diagnosticcontext")
    private String diagnosticcontext;

    /*
     * Request time
     */
    @JsonProperty(value = "time")
    private OffsetDateTime time;

    /**
     * Get the diagnosticcontext property: Provides correlation for request.
     *
     * @return the diagnosticcontext value.
     */
    public String diagnosticcontext() {
        return this.diagnosticcontext;
    }

    /**
     * Set the diagnosticcontext property: Provides correlation for request.
     *
     * @param diagnosticcontext the diagnosticcontext value to set.
     * @return the InnerError object itself.
     */
    public InnerError withDiagnosticcontext(String diagnosticcontext) {
        this.diagnosticcontext = diagnosticcontext;
        return this;
    }

    /**
     * Get the time property: Request time.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Set the time property: Request time.
     *
     * @param time the time value to set.
     * @return the InnerError object itself.
     */
    public InnerError withTime(OffsetDateTime time) {
        this.time = time;
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
