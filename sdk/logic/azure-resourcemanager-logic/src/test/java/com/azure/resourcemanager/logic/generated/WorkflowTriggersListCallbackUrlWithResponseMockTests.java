// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkflowTriggersListCallbackUrlWithResponseMockTests {
    @Test
    public void testListCallbackUrlWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":\"detv\",\"method\":\"kxdxuwsaifmcwn\",\"basePath\":\"bzlehgc\",\"relativePath\":\"bcknjolgj\",\"relativePathParameters\":[\"pvelszerqze\",\"xoqeintxwalj\",\"lzoblqwaafr\",\"ulhmzyq\"],\"queries\":{\"api-version\":\"vafjrqpjiyrqj\",\"sp\":\"gaxwmzwdfkbnrzo\",\"sv\":\"dltb\",\"sig\":\"tqjfgxxsaet\",\"se\":\"dgvpyig\"}}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        LogicManager manager =
            LogicManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        WorkflowTriggerCallbackUrl response =
            manager
                .workflowTriggers()
                .listCallbackUrlWithResponse(
                    "lwxlboncqbazq", "cqchygtvxbyjane", "ubdpkxyqvgxi", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("pvelszerqze", response.relativePathParameters().get(0));
        Assertions.assertEquals("vafjrqpjiyrqj", response.queries().apiVersion());
        Assertions.assertEquals("gaxwmzwdfkbnrzo", response.queries().sp());
        Assertions.assertEquals("dltb", response.queries().sv());
        Assertions.assertEquals("tqjfgxxsaet", response.queries().sig());
        Assertions.assertEquals("dgvpyig", response.queries().se());
    }
}
