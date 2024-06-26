/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContainerType.
 */
public final class ContainerType extends ExpandableStringEnum<ContainerType> {
    /** Static value dockerCompatible for ContainerType. */
    public static final ContainerType DOCKER_COMPATIBLE = fromString("dockerCompatible");

    /** Static value criCompatible for ContainerType. */
    public static final ContainerType CRI_COMPATIBLE = fromString("criCompatible");

    /**
     * Creates or finds a ContainerType from its string representation.
     * @param name a name to look for
     * @return the corresponding ContainerType
     */
    @JsonCreator
    public static ContainerType fromString(String name) {
        return fromString(name, ContainerType.class);
    }

    /**
     * @return known ContainerType values
     */
    public static Collection<ContainerType> values() {
        return values(ContainerType.class);
    }
}
