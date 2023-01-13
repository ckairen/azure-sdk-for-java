// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The format of the export being delivered. Currently only 'Csv' is supported. */
public final class FormatType extends ExpandableStringEnum<FormatType> {
    /** Static value Csv for FormatType. */
    public static final FormatType CSV = fromString("Csv");

    /**
     * Creates a new instance of FormatType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FormatType() {
    }

    /**
     * Creates or finds a FormatType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FormatType.
     */
    @JsonCreator
    public static FormatType fromString(String name) {
        return fromString(name, FormatType.class);
    }

    /**
     * Gets known FormatType values.
     *
     * @return known FormatType values.
     */
    public static Collection<FormatType> values() {
        return values(FormatType.class);
    }
}
