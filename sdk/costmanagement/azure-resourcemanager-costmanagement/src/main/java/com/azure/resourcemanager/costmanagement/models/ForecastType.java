// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the forecast. */
public final class ForecastType extends ExpandableStringEnum<ForecastType> {
    /** Static value Usage for ForecastType. */
    public static final ForecastType USAGE = fromString("Usage");

    /** Static value ActualCost for ForecastType. */
    public static final ForecastType ACTUAL_COST = fromString("ActualCost");

    /** Static value AmortizedCost for ForecastType. */
    public static final ForecastType AMORTIZED_COST = fromString("AmortizedCost");

    /**
     * Creates a new instance of ForecastType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ForecastType() {
    }

    /**
     * Creates or finds a ForecastType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ForecastType.
     */
    @JsonCreator
    public static ForecastType fromString(String name) {
        return fromString(name, ForecastType.class);
    }

    /**
     * Gets known ForecastType values.
     *
     * @return known ForecastType values.
     */
    public static Collection<ForecastType> values() {
        return values(ForecastType.class);
    }
}
