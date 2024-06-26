// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IntervalSummary model. */
@Fluent
public final class IntervalSummary {
    /*
     * The first minute to which the summary applies.
     */
    @JsonProperty(value = "startMinute")
    private Integer startMinute;

    /*
     * The last minute to which the summary applies.
     */
    @JsonProperty(value = "endMinute")
    private Integer endMinute;

    /*
     * The number of minutes for which the summary applies.
     */
    @JsonProperty(value = "totalMinutes")
    private Integer totalMinutes;

    /*
     * Short summary phrase. Phrase length is approximately 25 characters.
     */
    @JsonProperty(value = "shortPhrase")
    private String shortDescription;

    /*
     * Brief summary phrase. Phrase length is approximately 60 characters.
     */
    @JsonProperty(value = "briefPhrase")
    private String briefDescription;

    /*
     * Long summary phrase. Phrase length is 60+ characters.
     */
    @JsonProperty(value = "longPhrase")
    private String longPhrase;

    /*
     * Numeric value representing an image that displays the `iconPhrase`. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "iconCode")
    private IconCode iconCode;

    /** Set default IntervalSummary constructor to private */
    private IntervalSummary() {}

    /**
     * Get the startMinute property: The first minute to which the summary applies.
     *
     * @return the startMinute value.
     */
    public Integer getStartMinute() {
        return this.startMinute;
    }

    /**
     * Get the endMinute property: The last minute to which the summary applies.
     *
     * @return the endMinute value.
     */
    public Integer getEndMinute() {
        return this.endMinute;
    }

    /**
     * Get the totalMinutes property: The number of minutes for which the summary applies.
     *
     * @return the totalMinutes value.
     */
    public Integer getTotalMinutes() {
        return this.totalMinutes;
    }

    /**
     * Get the shortDescription property: Short summary phrase. Phrase length is approximately 25 characters.
     *
     * @return the shortDescription value.
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * Get the briefDescription property: Brief summary phrase. Phrase length is approximately 60 characters.
     *
     * @return the briefDescription value.
     */
    public String getBriefDescription() {
        return this.briefDescription;
    }

    /**
     * Get the longPhrase property: Long summary phrase. Phrase length is 60+ characters.
     *
     * @return the longPhrase value.
     */
    public String getLongPhrase() {
        return this.longPhrase;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @return the iconCode value.
     */
    public IconCode getIconCode() {
        return this.iconCode;
    }
}
