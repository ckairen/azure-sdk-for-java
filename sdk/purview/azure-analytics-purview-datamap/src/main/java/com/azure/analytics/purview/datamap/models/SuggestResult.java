// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result item of the search suggest.
 */
@Immutable
public final class SuggestResult {
    /*
     * The result value
     */
    @Generated
    @JsonProperty(value = "value")
    private List<SuggestResultValue> value;

    /**
     * Creates an instance of SuggestResult class.
     */
    @Generated
    private SuggestResult() {
    }

    /**
     * Get the value property: The result value.
     * 
     * @return the value value.
     */
    @Generated
    public List<SuggestResultValue> getValue() {
        return this.value;
    }
}
