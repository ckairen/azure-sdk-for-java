// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataMasking model. */
@Fluent
public final class DataMasking {
    /*
     * Masking settings for Url query parameters
     */
    @JsonProperty(value = "queryParams")
    private List<DataMaskingEntity> queryParams;

    /*
     * Masking settings for headers
     */
    @JsonProperty(value = "headers")
    private List<DataMaskingEntity> headers;

    /** Creates an instance of DataMasking class. */
    public DataMasking() {
    }

    /**
     * Get the queryParams property: Masking settings for Url query parameters.
     *
     * @return the queryParams value.
     */
    public List<DataMaskingEntity> queryParams() {
        return this.queryParams;
    }

    /**
     * Set the queryParams property: Masking settings for Url query parameters.
     *
     * @param queryParams the queryParams value to set.
     * @return the DataMasking object itself.
     */
    public DataMasking withQueryParams(List<DataMaskingEntity> queryParams) {
        this.queryParams = queryParams;
        return this;
    }

    /**
     * Get the headers property: Masking settings for headers.
     *
     * @return the headers value.
     */
    public List<DataMaskingEntity> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Masking settings for headers.
     *
     * @param headers the headers value to set.
     * @return the DataMasking object itself.
     */
    public DataMasking withHeaders(List<DataMaskingEntity> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryParams() != null) {
            queryParams().forEach(e -> e.validate());
        }
        if (headers() != null) {
            headers().forEach(e -> e.validate());
        }
    }
}
