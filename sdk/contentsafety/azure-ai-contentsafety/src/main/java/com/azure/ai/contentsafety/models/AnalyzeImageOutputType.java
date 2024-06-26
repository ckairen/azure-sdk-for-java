// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of image analysis output.
 */
public final class AnalyzeImageOutputType extends ExpandableStringEnum<AnalyzeImageOutputType> {

    /**
     * Output severities in four levels, the value could be 0,2,4,6.
     */
    @Generated
    public static final AnalyzeImageOutputType FOUR_SEVERITY_LEVELS = fromString("FourSeverityLevels");

    /**
     * Creates a new instance of AnalyzeImageOutputType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AnalyzeImageOutputType() {
    }

    /**
     * Creates or finds a AnalyzeImageOutputType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnalyzeImageOutputType.
     */
    @Generated
    @JsonCreator
    public static AnalyzeImageOutputType fromString(String name) {
        return fromString(name, AnalyzeImageOutputType.class);
    }

    /**
     * Gets known AnalyzeImageOutputType values.
     *
     * @return known AnalyzeImageOutputType values.
     */
    @Generated
    public static Collection<AnalyzeImageOutputType> values() {
        return values(AnalyzeImageOutputType.class);
    }
}
