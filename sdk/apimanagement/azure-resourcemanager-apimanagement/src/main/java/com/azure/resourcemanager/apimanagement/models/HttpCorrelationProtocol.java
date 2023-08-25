// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Sets correlation protocol to use for Application Insights diagnostics. */
public final class HttpCorrelationProtocol extends ExpandableStringEnum<HttpCorrelationProtocol> {
    /** Static value None for HttpCorrelationProtocol. */
    public static final HttpCorrelationProtocol NONE = fromString("None");

    /** Static value Legacy for HttpCorrelationProtocol. */
    public static final HttpCorrelationProtocol LEGACY = fromString("Legacy");

    /** Static value W3C for HttpCorrelationProtocol. */
    public static final HttpCorrelationProtocol W3C = fromString("W3C");

    /**
     * Creates a new instance of HttpCorrelationProtocol value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HttpCorrelationProtocol() {
    }

    /**
     * Creates or finds a HttpCorrelationProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HttpCorrelationProtocol.
     */
    @JsonCreator
    public static HttpCorrelationProtocol fromString(String name) {
        return fromString(name, HttpCorrelationProtocol.class);
    }

    /**
     * Gets known HttpCorrelationProtocol values.
     *
     * @return known HttpCorrelationProtocol values.
     */
    public static Collection<HttpCorrelationProtocol> values() {
        return values(HttpCorrelationProtocol.class);
    }
}
