// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.models.CognitiveServicesResourceAndSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of cognitive services accounts operation response. */
@Immutable
public final class CognitiveServicesAccountEnumerateSkusResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CognitiveServicesAccountEnumerateSkusResultInner.class);

    /*
     * Gets the list of Cognitive Services accounts and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<CognitiveServicesResourceAndSku> value;

    /**
     * Get the value property: Gets the list of Cognitive Services accounts and their properties.
     *
     * @return the value value.
     */
    public List<CognitiveServicesResourceAndSku> value() {
        return this.value;
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
