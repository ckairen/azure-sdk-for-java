// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that are associated with a blob data source. */
@Fluent
public class BlobDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobDataSourceProperties.class);

    /*
     * A list of one or more Azure Storage accounts. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "storageAccounts")
    private List<StorageAccount> storageAccounts;

    /*
     * The name of a container within the associated Storage account. This
     * container contains either the blob(s) to be read from or written to.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "container")
    private String container;

    /*
     * The blob path pattern. Not a regular expression. It represents a pattern
     * against which blob names will be matched to determine whether or not
     * they should be included as input or output to the job. See
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input
     * or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output
     * for a more detailed explanation and example.
     */
    @JsonProperty(value = "pathPattern")
    private String pathPattern;

    /*
     * The date format. Wherever {date} appears in pathPattern, the value of
     * this property is used as the date format instead.
     */
    @JsonProperty(value = "dateFormat")
    private String dateFormat;

    /*
     * The time format. Wherever {time} appears in pathPattern, the value of
     * this property is used as the time format instead.
     */
    @JsonProperty(value = "timeFormat")
    private String timeFormat;

    /**
     * Get the storageAccounts property: A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace)
     * requests.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts property: A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace)
     * requests.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the BlobDataSourceProperties object itself.
     */
    public BlobDataSourceProperties withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the container property: The name of a container within the associated Storage account. This container
     * contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     *
     * @return the container value.
     */
    public String container() {
        return this.container;
    }

    /**
     * Set the container property: The name of a container within the associated Storage account. This container
     * contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     *
     * @param container the container value to set.
     * @return the BlobDataSourceProperties object itself.
     */
    public BlobDataSourceProperties withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Get the pathPattern property: The blob path pattern. Not a regular expression. It represents a pattern against
     * which blob names will be matched to determine whether or not they should be included as input or output to the
     * job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation
     * and example.
     *
     * @return the pathPattern value.
     */
    public String pathPattern() {
        return this.pathPattern;
    }

    /**
     * Set the pathPattern property: The blob path pattern. Not a regular expression. It represents a pattern against
     * which blob names will be matched to determine whether or not they should be included as input or output to the
     * job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation
     * and example.
     *
     * @param pathPattern the pathPattern value to set.
     * @return the BlobDataSourceProperties object itself.
     */
    public BlobDataSourceProperties withPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
        return this;
    }

    /**
     * Get the dateFormat property: The date format. Wherever {date} appears in pathPattern, the value of this property
     * is used as the date format instead.
     *
     * @return the dateFormat value.
     */
    public String dateFormat() {
        return this.dateFormat;
    }

    /**
     * Set the dateFormat property: The date format. Wherever {date} appears in pathPattern, the value of this property
     * is used as the date format instead.
     *
     * @param dateFormat the dateFormat value to set.
     * @return the BlobDataSourceProperties object itself.
     */
    public BlobDataSourceProperties withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get the timeFormat property: The time format. Wherever {time} appears in pathPattern, the value of this property
     * is used as the time format instead.
     *
     * @return the timeFormat value.
     */
    public String timeFormat() {
        return this.timeFormat;
    }

    /**
     * Set the timeFormat property: The time format. Wherever {time} appears in pathPattern, the value of this property
     * is used as the time format instead.
     *
     * @param timeFormat the timeFormat value to set.
     * @return the BlobDataSourceProperties object itself.
     */
    public BlobDataSourceProperties withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
    }
}
