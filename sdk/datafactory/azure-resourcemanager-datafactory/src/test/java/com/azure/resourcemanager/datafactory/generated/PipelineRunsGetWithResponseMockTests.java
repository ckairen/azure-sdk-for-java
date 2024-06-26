// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.PipelineRun;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PipelineRunsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"runId\":\"qoetckm\",\"runGroupId\":\"nsi\",\"isLatest\":false,\"pipelineName\":\"xhwvzdvujmukadz\",\"parameters\":{\"aecdcvhxwegdsmn\":\"xfqddadezn\"},\"runDimensions\":{\"ps\":\"vxel\",\"myftvejxmy\":\"bqpddypw\"},\"invokedBy\":{\"name\":\"ahhpnbvzdfyxjb\",\"id\":\"vnxwduu\",\"invokedByType\":\"vb\",\"pipelineName\":\"yedrkgrtda\",\"pipelineRunId\":\"itoimtar\"},\"lastUpdated\":\"2021-06-05T12:01:29Z\",\"runStart\":\"2021-11-06T10:40:45Z\",\"runEnd\":\"2021-08-24T21:24:23Z\",\"durationInMs\":1463714124,\"status\":\"pcduyhhz\",\"message\":\"z\",\"\":{\"jci\":\"datawkclloejshfcuzz\"}}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DataFactoryManager manager = DataFactoryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PipelineRun response = manager.pipelineRuns()
            .getWithResponse("hczqjoovypsgugh", "okbwzpxlxbv", "hkabeo", com.azure.core.util.Context.NONE).getValue();

    }
}
