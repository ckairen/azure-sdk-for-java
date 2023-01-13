// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.costmanagement.models.QueryColumn;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The QueryProperties model. */
@Fluent
public final class QueryProperties {
    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Array of columns
     */
    @JsonProperty(value = "columns")
    private List<QueryColumn> columns;

    /*
     * Array of rows
     */
    @JsonProperty(value = "rows")
    private List<List<Object>> rows;

    /** Creates an instance of QueryProperties class. */
    public QueryProperties() {
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link (url) to the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the QueryProperties object itself.
     */
    public QueryProperties withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the columns property: Array of columns.
     *
     * @return the columns value.
     */
    public List<QueryColumn> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: Array of columns.
     *
     * @param columns the columns value to set.
     * @return the QueryProperties object itself.
     */
    public QueryProperties withColumns(List<QueryColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the rows property: Array of rows.
     *
     * @return the rows value.
     */
    public List<List<Object>> rows() {
        return this.rows;
    }

    /**
     * Set the rows property: Array of rows.
     *
     * @param rows the rows value to set.
     * @return the QueryProperties object itself.
     */
    public QueryProperties withRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
    }
}
