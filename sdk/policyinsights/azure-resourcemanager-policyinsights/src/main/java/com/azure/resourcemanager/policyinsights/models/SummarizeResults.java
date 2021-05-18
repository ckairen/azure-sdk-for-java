// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.resourcemanager.policyinsights.fluent.models.SummarizeResultsInner;
import java.util.List;

/** An immutable client-side representation of SummarizeResults. */
public interface SummarizeResults {
    /**
     * Gets the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     *
     * @return the odataContext value.
     */
    String odataContext();

    /**
     * Gets the odataCount property: OData entity count; represents the number of summaries returned; always set to 1.
     *
     * @return the odataCount value.
     */
    Integer odataCount();

    /**
     * Gets the value property: Summarize action results.
     *
     * @return the value value.
     */
    List<Summary> value();

    /**
     * Gets the inner com.azure.resourcemanager.policyinsights.fluent.models.SummarizeResultsInner object.
     *
     * @return the inner object.
     */
    SummarizeResultsInner innerModel();
}
