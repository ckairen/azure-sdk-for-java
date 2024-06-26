// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input to problem classification Classification API.
 */
@Fluent
public final class ServiceClassificationRequest {
    /*
     * Natural language description of the customer’s issue.
     */
    @JsonProperty(value = "issueSummary")
    private String issueSummary;

    /*
     * ARM resource Id of the resource that is having the issue.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Additional information in the form of a string.
     */
    @JsonProperty(value = "additionalContext")
    private String additionalContext;

    /**
     * Creates an instance of ServiceClassificationRequest class.
     */
    public ServiceClassificationRequest() {
    }

    /**
     * Get the issueSummary property: Natural language description of the customer’s issue.
     * 
     * @return the issueSummary value.
     */
    public String issueSummary() {
        return this.issueSummary;
    }

    /**
     * Set the issueSummary property: Natural language description of the customer’s issue.
     * 
     * @param issueSummary the issueSummary value to set.
     * @return the ServiceClassificationRequest object itself.
     */
    public ServiceClassificationRequest withIssueSummary(String issueSummary) {
        this.issueSummary = issueSummary;
        return this;
    }

    /**
     * Get the resourceId property: ARM resource Id of the resource that is having the issue.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ARM resource Id of the resource that is having the issue.
     * 
     * @param resourceId the resourceId value to set.
     * @return the ServiceClassificationRequest object itself.
     */
    public ServiceClassificationRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the additionalContext property: Additional information in the form of a string.
     * 
     * @return the additionalContext value.
     */
    public String additionalContext() {
        return this.additionalContext;
    }

    /**
     * Set the additionalContext property: Additional information in the form of a string.
     * 
     * @param additionalContext the additionalContext value to set.
     * @return the ServiceClassificationRequest object itself.
     */
    public ServiceClassificationRequest withAdditionalContext(String additionalContext) {
        this.additionalContext = additionalContext;
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
