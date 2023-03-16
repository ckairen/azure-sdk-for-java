// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SubvolumeModelPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumeModelProperties model =
            BinaryData
                .fromString(
                    "{\"path\":\"oowvrv\",\"parentPath\":\"gjqppy\",\"size\":3299325825870738139,\"bytesUsed\":2863905998828514603,\"permissions\":\"yhgfipnsx\",\"creationTimeStamp\":\"2021-11-02T02:58:50Z\",\"accessedTimeStamp\":\"2021-10-27T14:15:12Z\",\"modifiedTimeStamp\":\"2020-12-24T09:43:24Z\",\"changedTimeStamp\":\"2021-04-17T18:50:11Z\",\"provisioningState\":\"reafxtsgumhjg\"}")
                .toObject(SubvolumeModelProperties.class);
        Assertions.assertEquals("oowvrv", model.path());
        Assertions.assertEquals("gjqppy", model.parentPath());
        Assertions.assertEquals(3299325825870738139L, model.size());
        Assertions.assertEquals(2863905998828514603L, model.bytesUsed());
        Assertions.assertEquals("yhgfipnsx", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-02T02:58:50Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-27T14:15:12Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-24T09:43:24Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T18:50:11Z"), model.changedTimestamp());
        Assertions.assertEquals("reafxtsgumhjg", model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumeModelProperties model =
            new SubvolumeModelProperties()
                .withPath("oowvrv")
                .withParentPath("gjqppy")
                .withSize(3299325825870738139L)
                .withBytesUsed(2863905998828514603L)
                .withPermissions("yhgfipnsx")
                .withCreationTimestamp(OffsetDateTime.parse("2021-11-02T02:58:50Z"))
                .withAccessedTimestamp(OffsetDateTime.parse("2021-10-27T14:15:12Z"))
                .withModifiedTimestamp(OffsetDateTime.parse("2020-12-24T09:43:24Z"))
                .withChangedTimestamp(OffsetDateTime.parse("2021-04-17T18:50:11Z"))
                .withProvisioningState("reafxtsgumhjg");
        model = BinaryData.fromObject(model).toObject(SubvolumeModelProperties.class);
        Assertions.assertEquals("oowvrv", model.path());
        Assertions.assertEquals("gjqppy", model.parentPath());
        Assertions.assertEquals(3299325825870738139L, model.size());
        Assertions.assertEquals(2863905998828514603L, model.bytesUsed());
        Assertions.assertEquals("yhgfipnsx", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-02T02:58:50Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-27T14:15:12Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-24T09:43:24Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T18:50:11Z"), model.changedTimestamp());
        Assertions.assertEquals("reafxtsgumhjg", model.provisioningState());
    }
}
