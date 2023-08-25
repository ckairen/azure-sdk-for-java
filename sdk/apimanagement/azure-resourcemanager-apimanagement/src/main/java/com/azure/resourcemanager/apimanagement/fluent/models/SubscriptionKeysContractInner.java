// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Subscription keys. */
@Fluent
public final class SubscriptionKeysContractInner {
    /*
     * Subscription primary key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /*
     * Subscription secondary key.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /** Creates an instance of SubscriptionKeysContractInner class. */
    public SubscriptionKeysContractInner() {
    }

    /**
     * Get the primaryKey property: Subscription primary key.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: Subscription primary key.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the SubscriptionKeysContractInner object itself.
     */
    public SubscriptionKeysContractInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: Subscription secondary key.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: Subscription secondary key.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the SubscriptionKeysContractInner object itself.
     */
    public SubscriptionKeysContractInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
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
