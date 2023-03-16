// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CapacityPoolInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapacityPoolInner model =
            BinaryData
                .fromString(
                    "{\"etag\":\"vdfwatkpn\",\"properties\":{\"poolId\":\"lexxbczwtru\",\"size\":4653794584543146117,\"serviceLevel\":\"Standard\",\"provisioningState\":\"qjvsovmyokacs\",\"totalThroughputMibps\":2.3299038,\"utilizedThroughputMibps\":94.998985,\"qosType\":\"Manual\",\"coolAccess\":false,\"encryptionType\":\"Single\"},\"location\":\"mflbv\",\"tags\":{\"ciwwzjuqkhr\":\"hrk\",\"oskg\":\"ajiwkuo\",\"vxieduugidyj\":\"sauuimj\",\"pclhocohslk\":\"rfbyaosvexcso\"},\"id\":\"vleggzfbuhfmvfax\",\"name\":\"ffeii\",\"type\":\"hl\"}")
                .toObject(CapacityPoolInner.class);
        Assertions.assertEquals("mflbv", model.location());
        Assertions.assertEquals("hrk", model.tags().get("ciwwzjuqkhr"));
        Assertions.assertEquals(4653794584543146117L, model.size());
        Assertions.assertEquals(ServiceLevel.STANDARD, model.serviceLevel());
        Assertions.assertEquals(QosType.MANUAL, model.qosType());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, model.encryptionType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapacityPoolInner model =
            new CapacityPoolInner()
                .withLocation("mflbv")
                .withTags(
                    mapOf(
                        "ciwwzjuqkhr",
                        "hrk",
                        "oskg",
                        "ajiwkuo",
                        "vxieduugidyj",
                        "sauuimj",
                        "pclhocohslk",
                        "rfbyaosvexcso"))
                .withSize(4653794584543146117L)
                .withServiceLevel(ServiceLevel.STANDARD)
                .withQosType(QosType.MANUAL)
                .withCoolAccess(false)
                .withEncryptionType(EncryptionType.SINGLE);
        model = BinaryData.fromObject(model).toObject(CapacityPoolInner.class);
        Assertions.assertEquals("mflbv", model.location());
        Assertions.assertEquals("hrk", model.tags().get("ciwwzjuqkhr"));
        Assertions.assertEquals(4653794584543146117L, model.size());
        Assertions.assertEquals(ServiceLevel.STANDARD, model.serviceLevel());
        Assertions.assertEquals(QosType.MANUAL, model.qosType());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, model.encryptionType());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
