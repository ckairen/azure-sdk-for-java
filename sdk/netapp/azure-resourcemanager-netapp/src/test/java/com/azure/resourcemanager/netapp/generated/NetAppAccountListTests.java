// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.NetAppAccountInner;
import com.azure.resourcemanager.netapp.models.ManagedServiceIdentity;
import com.azure.resourcemanager.netapp.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.netapp.models.NetAppAccountList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetAppAccountListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetAppAccountList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"etag\":\"j\",\"properties\":{\"provisioningState\":\"pmouexhdz\",\"activeDirectories\":[],\"disableShowmount\":true},\"identity\":{\"principalId\":\"0b084344-b24d-43bc-b06e-4d274fc46583\",\"tenantId\":\"c93219c2-0494-49e9-a6a7-c23ab0a5397e\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"zvddntwndeicbtwn\",\"tags\":{\"cffcyddglmj\":\"oqvuhr\",\"wpyeicxmqciwqvh\":\"hjq\"},\"id\":\"hix\",\"name\":\"igdtopbob\",\"type\":\"og\"}],\"nextLink\":\"e\"}")
                .toObject(NetAppAccountList.class);
        Assertions.assertEquals("zvddntwndeicbtwn", model.value().get(0).location());
        Assertions.assertEquals("oqvuhr", model.value().get(0).tags().get("cffcyddglmj"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("e", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetAppAccountList model =
            new NetAppAccountList()
                .withValue(
                    Arrays
                        .asList(
                            new NetAppAccountInner()
                                .withLocation("zvddntwndeicbtwn")
                                .withTags(mapOf("cffcyddglmj", "oqvuhr", "wpyeicxmqciwqvh", "hjq"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withActiveDirectories(Arrays.asList())))
                .withNextLink("e");
        model = BinaryData.fromObject(model).toObject(NetAppAccountList.class);
        Assertions.assertEquals("zvddntwndeicbtwn", model.value().get(0).location());
        Assertions.assertEquals("oqvuhr", model.value().get(0).tags().get("cffcyddglmj"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("e", model.nextLink());
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
