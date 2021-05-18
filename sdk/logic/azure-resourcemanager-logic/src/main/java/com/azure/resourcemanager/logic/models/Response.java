// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A response. */
@Fluent
public final class Response {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Response.class);

    /*
     * A list of all the headers attached to the response.
     */
    @JsonProperty(value = "headers")
    private Object headers;

    /*
     * The status code of the response.
     */
    @JsonProperty(value = "statusCode")
    private Integer statusCode;

    /*
     * Details on the location of the body content.
     */
    @JsonProperty(value = "bodyLink")
    private ContentLink bodyLink;

    /**
     * Get the headers property: A list of all the headers attached to the response.
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set the headers property: A list of all the headers attached to the response.
     *
     * @param headers the headers value to set.
     * @return the Response object itself.
     */
    public Response withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the statusCode property: The status code of the response.
     *
     * @return the statusCode value.
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: The status code of the response.
     *
     * @param statusCode the statusCode value to set.
     * @return the Response object itself.
     */
    public Response withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the bodyLink property: Details on the location of the body content.
     *
     * @return the bodyLink value.
     */
    public ContentLink bodyLink() {
        return this.bodyLink;
    }

    /**
     * Set the bodyLink property: Details on the location of the body content.
     *
     * @param bodyLink the bodyLink value to set.
     * @return the Response object itself.
     */
    public Response withBodyLink(ContentLink bodyLink) {
        this.bodyLink = bodyLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bodyLink() != null) {
            bodyLink().validate();
        }
    }
}
