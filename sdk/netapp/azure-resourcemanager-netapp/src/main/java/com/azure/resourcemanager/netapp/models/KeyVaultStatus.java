// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Status of the KeyVault connection. */
public final class KeyVaultStatus extends ExpandableStringEnum<KeyVaultStatus> {
    /** Static value Created for KeyVaultStatus. */
    public static final KeyVaultStatus CREATED = fromString("Created");

    /** Static value InUse for KeyVaultStatus. */
    public static final KeyVaultStatus IN_USE = fromString("InUse");

    /** Static value Deleted for KeyVaultStatus. */
    public static final KeyVaultStatus DELETED = fromString("Deleted");

    /** Static value Error for KeyVaultStatus. */
    public static final KeyVaultStatus ERROR = fromString("Error");

    /** Static value Updating for KeyVaultStatus. */
    public static final KeyVaultStatus UPDATING = fromString("Updating");

    /**
     * Creates a new instance of KeyVaultStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyVaultStatus() {
    }

    /**
     * Creates or finds a KeyVaultStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyVaultStatus.
     */
    @JsonCreator
    public static KeyVaultStatus fromString(String name) {
        return fromString(name, KeyVaultStatus.class);
    }

    /**
     * Gets known KeyVaultStatus values.
     *
     * @return known KeyVaultStatus values.
     */
    public static Collection<KeyVaultStatus> values() {
        return values(KeyVaultStatus.class);
    }
}
