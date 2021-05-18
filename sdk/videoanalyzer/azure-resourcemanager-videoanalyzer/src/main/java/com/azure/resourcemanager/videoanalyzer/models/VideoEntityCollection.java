// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoEntityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of VideoEntity items. */
@Fluent
public final class VideoEntityCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoEntityCollection.class);

    /*
     * A collection of VideoEntity items.
     */
    @JsonProperty(value = "value")
    private List<VideoEntityInner> value;

    /*
     * A link to the next page of the collection (when the collection contains
     * too many results to return in one response).
     */
    @JsonProperty(value = "@nextLink")
    private String nextLink;

    /**
     * Get the value property: A collection of VideoEntity items.
     *
     * @return the value value.
     */
    public List<VideoEntityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of VideoEntity items.
     *
     * @param value the value value to set.
     * @return the VideoEntityCollection object itself.
     */
    public VideoEntityCollection withValue(List<VideoEntityInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link to the next page of the collection (when the collection contains too many
     * results to return in one response).
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link to the next page of the collection (when the collection contains too many
     * results to return in one response).
     *
     * @param nextLink the nextLink value to set.
     * @return the VideoEntityCollection object itself.
     */
    public VideoEntityCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
