// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.IotMappingProperties;

public final class IotMappingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotMappingProperties model
            = BinaryData.fromString("{\"content\":\"datajixisxyawjoyaqcs\"}").toObject(IotMappingProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotMappingProperties model = new IotMappingProperties().withContent("datajixisxyawjoyaqcs");
        model = BinaryData.fromObject(model).toObject(IotMappingProperties.class);
    }
}
