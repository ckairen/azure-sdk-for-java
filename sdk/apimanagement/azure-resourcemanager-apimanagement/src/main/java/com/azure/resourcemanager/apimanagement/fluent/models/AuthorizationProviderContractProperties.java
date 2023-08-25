// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.AuthorizationProviderOAuth2Settings;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorization Provider details. */
@Fluent
public final class AuthorizationProviderContractProperties {
    /*
     * Authorization Provider name. Must be 1 to 300 characters long.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Identity provider name. Must be 1 to 300 characters long.
     */
    @JsonProperty(value = "identityProvider")
    private String identityProvider;

    /*
     * OAuth2 settings
     */
    @JsonProperty(value = "oauth2")
    private AuthorizationProviderOAuth2Settings oauth2;

    /** Creates an instance of AuthorizationProviderContractProperties class. */
    public AuthorizationProviderContractProperties() {
    }

    /**
     * Get the displayName property: Authorization Provider name. Must be 1 to 300 characters long.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Authorization Provider name. Must be 1 to 300 characters long.
     *
     * @param displayName the displayName value to set.
     * @return the AuthorizationProviderContractProperties object itself.
     */
    public AuthorizationProviderContractProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the identityProvider property: Identity provider name. Must be 1 to 300 characters long.
     *
     * @return the identityProvider value.
     */
    public String identityProvider() {
        return this.identityProvider;
    }

    /**
     * Set the identityProvider property: Identity provider name. Must be 1 to 300 characters long.
     *
     * @param identityProvider the identityProvider value to set.
     * @return the AuthorizationProviderContractProperties object itself.
     */
    public AuthorizationProviderContractProperties withIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    /**
     * Get the oauth2 property: OAuth2 settings.
     *
     * @return the oauth2 value.
     */
    public AuthorizationProviderOAuth2Settings oauth2() {
        return this.oauth2;
    }

    /**
     * Set the oauth2 property: OAuth2 settings.
     *
     * @param oauth2 the oauth2 value to set.
     * @return the AuthorizationProviderContractProperties object itself.
     */
    public AuthorizationProviderContractProperties withOauth2(AuthorizationProviderOAuth2Settings oauth2) {
        this.oauth2 = oauth2;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (oauth2() != null) {
            oauth2().validate();
        }
    }
}
