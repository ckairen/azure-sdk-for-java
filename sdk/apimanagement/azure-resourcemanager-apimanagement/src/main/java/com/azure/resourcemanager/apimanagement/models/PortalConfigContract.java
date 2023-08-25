// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalConfigContractInner;

/** An immutable client-side representation of PortalConfigContract. */
public interface PortalConfigContract {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the enableBasicAuth property: Enable or disable Basic authentication method.
     *
     * @return the enableBasicAuth value.
     */
    Boolean enableBasicAuth();

    /**
     * Gets the signin property: The signin property.
     *
     * @return the signin value.
     */
    PortalConfigPropertiesSignin signin();

    /**
     * Gets the signup property: The signup property.
     *
     * @return the signup value.
     */
    PortalConfigPropertiesSignup signup();

    /**
     * Gets the delegation property: The developer portal delegation settings.
     *
     * @return the delegation value.
     */
    PortalConfigDelegationProperties delegation();

    /**
     * Gets the cors property: The developer portal Cross-Origin Resource Sharing (CORS) settings.
     *
     * @return the cors value.
     */
    PortalConfigCorsProperties cors();

    /**
     * Gets the csp property: The developer portal Content Security Policy (CSP) settings.
     *
     * @return the csp value.
     */
    PortalConfigCspProperties csp();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.PortalConfigContractInner object.
     *
     * @return the inner object.
     */
    PortalConfigContractInner innerModel();

    /** The entirety of the PortalConfigContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The PortalConfigContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the PortalConfigContract definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the PortalConfigContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }

        /**
         * The stage of the PortalConfigContract definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithEnableBasicAuth,
                DefinitionStages.WithSignin,
                DefinitionStages.WithSignup,
                DefinitionStages.WithDelegation,
                DefinitionStages.WithCors,
                DefinitionStages.WithCsp,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PortalConfigContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PortalConfigContract create(Context context);
        }

        /** The stage of the PortalConfigContract definition allowing to specify enableBasicAuth. */
        interface WithEnableBasicAuth {
            /**
             * Specifies the enableBasicAuth property: Enable or disable Basic authentication method..
             *
             * @param enableBasicAuth Enable or disable Basic authentication method.
             * @return the next definition stage.
             */
            WithCreate withEnableBasicAuth(Boolean enableBasicAuth);
        }

        /** The stage of the PortalConfigContract definition allowing to specify signin. */
        interface WithSignin {
            /**
             * Specifies the signin property: The signin property..
             *
             * @param signin The signin property.
             * @return the next definition stage.
             */
            WithCreate withSignin(PortalConfigPropertiesSignin signin);
        }

        /** The stage of the PortalConfigContract definition allowing to specify signup. */
        interface WithSignup {
            /**
             * Specifies the signup property: The signup property..
             *
             * @param signup The signup property.
             * @return the next definition stage.
             */
            WithCreate withSignup(PortalConfigPropertiesSignup signup);
        }

        /** The stage of the PortalConfigContract definition allowing to specify delegation. */
        interface WithDelegation {
            /**
             * Specifies the delegation property: The developer portal delegation settings..
             *
             * @param delegation The developer portal delegation settings.
             * @return the next definition stage.
             */
            WithCreate withDelegation(PortalConfigDelegationProperties delegation);
        }

        /** The stage of the PortalConfigContract definition allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: The developer portal Cross-Origin Resource Sharing (CORS) settings..
             *
             * @param cors The developer portal Cross-Origin Resource Sharing (CORS) settings.
             * @return the next definition stage.
             */
            WithCreate withCors(PortalConfigCorsProperties cors);
        }

        /** The stage of the PortalConfigContract definition allowing to specify csp. */
        interface WithCsp {
            /**
             * Specifies the csp property: The developer portal Content Security Policy (CSP) settings..
             *
             * @param csp The developer portal Content Security Policy (CSP) settings.
             * @return the next definition stage.
             */
            WithCreate withCsp(PortalConfigCspProperties csp);
        }

        /** The stage of the PortalConfigContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }

    /**
     * Begins update for the PortalConfigContract resource.
     *
     * @return the stage of resource update.
     */
    PortalConfigContract.Update update();

    /** The template for PortalConfigContract update. */
    interface Update
        extends UpdateStages.WithEnableBasicAuth,
            UpdateStages.WithSignin,
            UpdateStages.WithSignup,
            UpdateStages.WithDelegation,
            UpdateStages.WithCors,
            UpdateStages.WithCsp,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PortalConfigContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PortalConfigContract apply(Context context);
    }

    /** The PortalConfigContract update stages. */
    interface UpdateStages {
        /** The stage of the PortalConfigContract update allowing to specify enableBasicAuth. */
        interface WithEnableBasicAuth {
            /**
             * Specifies the enableBasicAuth property: Enable or disable Basic authentication method..
             *
             * @param enableBasicAuth Enable or disable Basic authentication method.
             * @return the next definition stage.
             */
            Update withEnableBasicAuth(Boolean enableBasicAuth);
        }

        /** The stage of the PortalConfigContract update allowing to specify signin. */
        interface WithSignin {
            /**
             * Specifies the signin property: The signin property..
             *
             * @param signin The signin property.
             * @return the next definition stage.
             */
            Update withSignin(PortalConfigPropertiesSignin signin);
        }

        /** The stage of the PortalConfigContract update allowing to specify signup. */
        interface WithSignup {
            /**
             * Specifies the signup property: The signup property..
             *
             * @param signup The signup property.
             * @return the next definition stage.
             */
            Update withSignup(PortalConfigPropertiesSignup signup);
        }

        /** The stage of the PortalConfigContract update allowing to specify delegation. */
        interface WithDelegation {
            /**
             * Specifies the delegation property: The developer portal delegation settings..
             *
             * @param delegation The developer portal delegation settings.
             * @return the next definition stage.
             */
            Update withDelegation(PortalConfigDelegationProperties delegation);
        }

        /** The stage of the PortalConfigContract update allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: The developer portal Cross-Origin Resource Sharing (CORS) settings..
             *
             * @param cors The developer portal Cross-Origin Resource Sharing (CORS) settings.
             * @return the next definition stage.
             */
            Update withCors(PortalConfigCorsProperties cors);
        }

        /** The stage of the PortalConfigContract update allowing to specify csp. */
        interface WithCsp {
            /**
             * Specifies the csp property: The developer portal Content Security Policy (CSP) settings..
             *
             * @param csp The developer portal Content Security Policy (CSP) settings.
             * @return the next definition stage.
             */
            Update withCsp(PortalConfigCspProperties csp);
        }

        /** The stage of the PortalConfigContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PortalConfigContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PortalConfigContract refresh(Context context);
}
