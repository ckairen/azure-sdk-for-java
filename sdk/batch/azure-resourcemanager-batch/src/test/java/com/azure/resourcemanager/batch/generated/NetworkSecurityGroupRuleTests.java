// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRule;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRuleAccess;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NetworkSecurityGroupRuleTests {
    @Test
    public void testDeserialize() {
        NetworkSecurityGroupRule model =
            BinaryData
                .fromString(
                    "{\"priority\":1383619855,\"access\":\"Deny\",\"sourceAddressPrefix\":\"tbobz\",\"sourcePortRanges\":[\"cjwvn\",\"dldwmgxc\"]}")
                .toObject(NetworkSecurityGroupRule.class);
        Assertions.assertEquals(1383619855, model.priority());
        Assertions.assertEquals(NetworkSecurityGroupRuleAccess.DENY, model.access());
        Assertions.assertEquals("tbobz", model.sourceAddressPrefix());
        Assertions.assertEquals("cjwvn", model.sourcePortRanges().get(0));
    }

    @Test
    public void testSerialize() {
        NetworkSecurityGroupRule model =
            new NetworkSecurityGroupRule()
                .withPriority(1383619855)
                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                .withSourceAddressPrefix("tbobz")
                .withSourcePortRanges(Arrays.asList("cjwvn", "dldwmgxc"));
        model = BinaryData.fromObject(model).toObject(NetworkSecurityGroupRule.class);
        Assertions.assertEquals(1383619855, model.priority());
        Assertions.assertEquals(NetworkSecurityGroupRuleAccess.DENY, model.access());
        Assertions.assertEquals("tbobz", model.sourceAddressPrefix());
        Assertions.assertEquals("cjwvn", model.sourcePortRanges().get(0));
    }
}
