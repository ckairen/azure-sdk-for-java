// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The format in which the generated images are returned. */
public final class ImageGenerationResponseFormat extends ExpandableStringEnum<ImageGenerationResponseFormat> {

    /** Image generation response items should provide a URL from which the image may be retrieved. */
    @Generated public static final ImageGenerationResponseFormat URL = fromString("url");

    /** Image generation response items should provide image data as a base64-encoded string. */
    @Generated public static final ImageGenerationResponseFormat BASE64 = fromString("b64_json");

    /**
     * Creates a new instance of ImageGenerationResponseFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ImageGenerationResponseFormat() {}

    /**
     * Creates or finds a ImageGenerationResponseFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageGenerationResponseFormat.
     */
    @Generated
    @JsonCreator
    public static ImageGenerationResponseFormat fromString(String name) {
        return fromString(name, ImageGenerationResponseFormat.class);
    }

    /**
     * Gets known ImageGenerationResponseFormat values.
     *
     * @return known ImageGenerationResponseFormat values.
     */
    @Generated
    public static Collection<ImageGenerationResponseFormat> values() {
        return values(ImageGenerationResponseFormat.class);
    }
}
