// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.Backend;
import com.azure.resourcemanager.frontdoor.models.BackendEnabledState;
import org.junit.jupiter.api.Assertions;

public final class BackendTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Backend model =
            BinaryData
                .fromString(
                    "{\"address\":\"oz\",\"privateLinkAlias\":\"vhelxprglyatdd\",\"privateLinkResourceId\":\"cbcuejrjxgciqi\",\"privateLinkLocation\":\"hos\",\"privateEndpointStatus\":\"Pending\",\"privateLinkApprovalMessage\":\"rhzo\",\"httpPort\":5318116,\"httpsPort\":23875127,\"enabledState\":\"Enabled\",\"priority\":7798465,\"weight\":1370014910,\"backendHostHeader\":\"wfluszdt\"}")
                .toObject(Backend.class);
        Assertions.assertEquals("oz", model.address());
        Assertions.assertEquals("vhelxprglyatdd", model.privateLinkAlias());
        Assertions.assertEquals("cbcuejrjxgciqi", model.privateLinkResourceId());
        Assertions.assertEquals("hos", model.privateLinkLocation());
        Assertions.assertEquals("rhzo", model.privateLinkApprovalMessage());
        Assertions.assertEquals(5318116, model.httpPort());
        Assertions.assertEquals(23875127, model.httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(7798465, model.priority());
        Assertions.assertEquals(1370014910, model.weight());
        Assertions.assertEquals("wfluszdt", model.backendHostHeader());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Backend model =
            new Backend()
                .withAddress("oz")
                .withPrivateLinkAlias("vhelxprglyatdd")
                .withPrivateLinkResourceId("cbcuejrjxgciqi")
                .withPrivateLinkLocation("hos")
                .withPrivateLinkApprovalMessage("rhzo")
                .withHttpPort(5318116)
                .withHttpsPort(23875127)
                .withEnabledState(BackendEnabledState.ENABLED)
                .withPriority(7798465)
                .withWeight(1370014910)
                .withBackendHostHeader("wfluszdt");
        model = BinaryData.fromObject(model).toObject(Backend.class);
        Assertions.assertEquals("oz", model.address());
        Assertions.assertEquals("vhelxprglyatdd", model.privateLinkAlias());
        Assertions.assertEquals("cbcuejrjxgciqi", model.privateLinkResourceId());
        Assertions.assertEquals("hos", model.privateLinkLocation());
        Assertions.assertEquals("rhzo", model.privateLinkApprovalMessage());
        Assertions.assertEquals(5318116, model.httpPort());
        Assertions.assertEquals(23875127, model.httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(7798465, model.priority());
        Assertions.assertEquals(1370014910, model.weight());
        Assertions.assertEquals("wfluszdt", model.backendHostHeader());
    }
}
