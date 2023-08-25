// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.PolicyDescriptionContract;

public final class PolicyDescriptionContractTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyDescriptionContract model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"iqcpszpmcvq\",\"scope\":3829090780057392318},\"id\":\"mvxyrxdh\",\"name\":\"vqojbxaotcgbz\",\"type\":\"mbtple\"}")
                .toObject(PolicyDescriptionContract.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyDescriptionContract model = new PolicyDescriptionContract();
        model = BinaryData.fromObject(model).toObject(PolicyDescriptionContract.class);
    }
}
