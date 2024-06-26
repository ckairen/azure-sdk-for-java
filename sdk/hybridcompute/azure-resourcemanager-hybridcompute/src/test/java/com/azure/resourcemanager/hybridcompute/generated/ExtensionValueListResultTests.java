// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.ExtensionValueListResult;

public final class ExtensionValueListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtensionValueListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"version\":\"waboe\",\"extensionType\":\"v\",\"publisher\":\"lns\"},\"id\":\"bxwyjsflhhcaa\",\"name\":\"n\",\"type\":\"ixisxyawjoy\"},{\"properties\":{\"version\":\"slyjpkiid\",\"extensionType\":\"exznelixhnr\",\"publisher\":\"folhbnxknal\"},\"id\":\"lp\",\"name\":\"ggdtpnapnyiro\",\"type\":\"uhpigvp\"},{\"properties\":{\"version\":\"gqgitxmedjvcsl\",\"extensionType\":\"qwwncw\",\"publisher\":\"hxg\"},\"id\":\"rmgucnap\",\"name\":\"t\",\"type\":\"oellwp\"}]}")
                .toObject(ExtensionValueListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtensionValueListResult model = new ExtensionValueListResult();
        model = BinaryData.fromObject(model).toObject(ExtensionValueListResult.class);
    }
}
