// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.fluent.IotHubResourcesClient;
import com.azure.resourcemanager.iothub.fluent.models.EndpointHealthDataInner;
import com.azure.resourcemanager.iothub.fluent.models.EventHubConsumerGroupInfoInner;
import com.azure.resourcemanager.iothub.fluent.models.IotHubDescriptionInner;
import com.azure.resourcemanager.iothub.fluent.models.IotHubNameAvailabilityInfoInner;
import com.azure.resourcemanager.iothub.fluent.models.IotHubQuotaMetricInfoInner;
import com.azure.resourcemanager.iothub.fluent.models.IotHubSkuDescriptionInner;
import com.azure.resourcemanager.iothub.fluent.models.JobResponseInner;
import com.azure.resourcemanager.iothub.fluent.models.RegistryStatisticsInner;
import com.azure.resourcemanager.iothub.fluent.models.SharedAccessSignatureAuthorizationRuleInner;
import com.azure.resourcemanager.iothub.fluent.models.TestAllRoutesResultInner;
import com.azure.resourcemanager.iothub.fluent.models.TestRouteResultInner;
import com.azure.resourcemanager.iothub.models.EndpointHealthData;
import com.azure.resourcemanager.iothub.models.EventHubConsumerGroupInfo;
import com.azure.resourcemanager.iothub.models.ExportDevicesRequest;
import com.azure.resourcemanager.iothub.models.ImportDevicesRequest;
import com.azure.resourcemanager.iothub.models.IotHubDescription;
import com.azure.resourcemanager.iothub.models.IotHubNameAvailabilityInfo;
import com.azure.resourcemanager.iothub.models.IotHubQuotaMetricInfo;
import com.azure.resourcemanager.iothub.models.IotHubResources;
import com.azure.resourcemanager.iothub.models.IotHubSkuDescription;
import com.azure.resourcemanager.iothub.models.JobResponse;
import com.azure.resourcemanager.iothub.models.OperationInputs;
import com.azure.resourcemanager.iothub.models.RegistryStatistics;
import com.azure.resourcemanager.iothub.models.SharedAccessSignatureAuthorizationRule;
import com.azure.resourcemanager.iothub.models.TestAllRoutesInput;
import com.azure.resourcemanager.iothub.models.TestAllRoutesResult;
import com.azure.resourcemanager.iothub.models.TestRouteInput;
import com.azure.resourcemanager.iothub.models.TestRouteResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotHubResourcesImpl implements IotHubResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubResourcesImpl.class);

    private final IotHubResourcesClient innerClient;

    private final com.azure.resourcemanager.iothub.IotHubManager serviceManager;

    public IotHubResourcesImpl(
        IotHubResourcesClient innerClient, com.azure.resourcemanager.iothub.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IotHubDescription getByResourceGroup(String resourceGroupName, String resourceName) {
        IotHubDescriptionInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new IotHubDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotHubDescription> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<IotHubDescriptionInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotHubDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IotHubDescription deleteByResourceGroup(String resourceGroupName, String resourceName) {
        IotHubDescriptionInner inner = this.serviceClient().delete(resourceGroupName, resourceName);
        if (inner != null) {
            return new IotHubDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public IotHubDescription delete(String resourceGroupName, String resourceName, Context context) {
        IotHubDescriptionInner inner = this.serviceClient().delete(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new IotHubDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<IotHubDescription> list() {
        PagedIterable<IotHubDescriptionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new IotHubDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<IotHubDescription> list(Context context) {
        PagedIterable<IotHubDescriptionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new IotHubDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<IotHubDescription> listByResourceGroup(String resourceGroupName) {
        PagedIterable<IotHubDescriptionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new IotHubDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<IotHubDescription> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<IotHubDescriptionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new IotHubDescriptionImpl(inner1, this.manager()));
    }

    public RegistryStatistics getStats(String resourceGroupName, String resourceName) {
        RegistryStatisticsInner inner = this.serviceClient().getStats(resourceGroupName, resourceName);
        if (inner != null) {
            return new RegistryStatisticsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegistryStatistics> getStatsWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<RegistryStatisticsInner> inner =
            this.serviceClient().getStatsWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistryStatisticsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<IotHubSkuDescription> getValidSkus(String resourceGroupName, String resourceName) {
        PagedIterable<IotHubSkuDescriptionInner> inner =
            this.serviceClient().getValidSkus(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new IotHubSkuDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<IotHubSkuDescription> getValidSkus(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<IotHubSkuDescriptionInner> inner =
            this.serviceClient().getValidSkus(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new IotHubSkuDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventHubConsumerGroupInfo> listEventHubConsumerGroups(
        String resourceGroupName, String resourceName, String eventHubEndpointName) {
        PagedIterable<EventHubConsumerGroupInfoInner> inner =
            this.serviceClient().listEventHubConsumerGroups(resourceGroupName, resourceName, eventHubEndpointName);
        return Utils.mapPage(inner, inner1 -> new EventHubConsumerGroupInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<EventHubConsumerGroupInfo> listEventHubConsumerGroups(
        String resourceGroupName, String resourceName, String eventHubEndpointName, Context context) {
        PagedIterable<EventHubConsumerGroupInfoInner> inner =
            this
                .serviceClient()
                .listEventHubConsumerGroups(resourceGroupName, resourceName, eventHubEndpointName, context);
        return Utils.mapPage(inner, inner1 -> new EventHubConsumerGroupInfoImpl(inner1, this.manager()));
    }

    public EventHubConsumerGroupInfo getEventHubConsumerGroup(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name) {
        EventHubConsumerGroupInfoInner inner =
            this.serviceClient().getEventHubConsumerGroup(resourceGroupName, resourceName, eventHubEndpointName, name);
        if (inner != null) {
            return new EventHubConsumerGroupInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventHubConsumerGroupInfo> getEventHubConsumerGroupWithResponse(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name, Context context) {
        Response<EventHubConsumerGroupInfoInner> inner =
            this
                .serviceClient()
                .getEventHubConsumerGroupWithResponse(
                    resourceGroupName, resourceName, eventHubEndpointName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventHubConsumerGroupInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteEventHubConsumerGroup(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name) {
        this.serviceClient().deleteEventHubConsumerGroup(resourceGroupName, resourceName, eventHubEndpointName, name);
    }

    public Response<Void> deleteEventHubConsumerGroupWithResponse(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name, Context context) {
        return this
            .serviceClient()
            .deleteEventHubConsumerGroupWithResponse(
                resourceGroupName, resourceName, eventHubEndpointName, name, context);
    }

    public PagedIterable<JobResponse> listJobs(String resourceGroupName, String resourceName) {
        PagedIterable<JobResponseInner> inner = this.serviceClient().listJobs(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new JobResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<JobResponse> listJobs(String resourceGroupName, String resourceName, Context context) {
        PagedIterable<JobResponseInner> inner = this.serviceClient().listJobs(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new JobResponseImpl(inner1, this.manager()));
    }

    public JobResponse getJob(String resourceGroupName, String resourceName, String jobId) {
        JobResponseInner inner = this.serviceClient().getJob(resourceGroupName, resourceName, jobId);
        if (inner != null) {
            return new JobResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobResponse> getJobWithResponse(
        String resourceGroupName, String resourceName, String jobId, Context context) {
        Response<JobResponseInner> inner =
            this.serviceClient().getJobWithResponse(resourceGroupName, resourceName, jobId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<IotHubQuotaMetricInfo> getQuotaMetrics(String resourceGroupName, String resourceName) {
        PagedIterable<IotHubQuotaMetricInfoInner> inner =
            this.serviceClient().getQuotaMetrics(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new IotHubQuotaMetricInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<IotHubQuotaMetricInfo> getQuotaMetrics(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<IotHubQuotaMetricInfoInner> inner =
            this.serviceClient().getQuotaMetrics(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new IotHubQuotaMetricInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<EndpointHealthData> getEndpointHealth(String resourceGroupName, String iotHubName) {
        PagedIterable<EndpointHealthDataInner> inner =
            this.serviceClient().getEndpointHealth(resourceGroupName, iotHubName);
        return Utils.mapPage(inner, inner1 -> new EndpointHealthDataImpl(inner1, this.manager()));
    }

    public PagedIterable<EndpointHealthData> getEndpointHealth(
        String resourceGroupName, String iotHubName, Context context) {
        PagedIterable<EndpointHealthDataInner> inner =
            this.serviceClient().getEndpointHealth(resourceGroupName, iotHubName, context);
        return Utils.mapPage(inner, inner1 -> new EndpointHealthDataImpl(inner1, this.manager()));
    }

    public IotHubNameAvailabilityInfo checkNameAvailability(OperationInputs operationInputs) {
        IotHubNameAvailabilityInfoInner inner = this.serviceClient().checkNameAvailability(operationInputs);
        if (inner != null) {
            return new IotHubNameAvailabilityInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotHubNameAvailabilityInfo> checkNameAvailabilityWithResponse(
        OperationInputs operationInputs, Context context) {
        Response<IotHubNameAvailabilityInfoInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(operationInputs, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotHubNameAvailabilityInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TestAllRoutesResult testAllRoutes(String iotHubName, String resourceGroupName, TestAllRoutesInput input) {
        TestAllRoutesResultInner inner = this.serviceClient().testAllRoutes(iotHubName, resourceGroupName, input);
        if (inner != null) {
            return new TestAllRoutesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TestAllRoutesResult> testAllRoutesWithResponse(
        String iotHubName, String resourceGroupName, TestAllRoutesInput input, Context context) {
        Response<TestAllRoutesResultInner> inner =
            this.serviceClient().testAllRoutesWithResponse(iotHubName, resourceGroupName, input, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TestAllRoutesResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TestRouteResult testRoute(String iotHubName, String resourceGroupName, TestRouteInput input) {
        TestRouteResultInner inner = this.serviceClient().testRoute(iotHubName, resourceGroupName, input);
        if (inner != null) {
            return new TestRouteResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TestRouteResult> testRouteWithResponse(
        String iotHubName, String resourceGroupName, TestRouteInput input, Context context) {
        Response<TestRouteResultInner> inner =
            this.serviceClient().testRouteWithResponse(iotHubName, resourceGroupName, input, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TestRouteResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(
        String resourceGroupName, String resourceName) {
        PagedIterable<SharedAccessSignatureAuthorizationRuleInner> inner =
            this.serviceClient().listKeys(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new SharedAccessSignatureAuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<SharedAccessSignatureAuthorizationRuleInner> inner =
            this.serviceClient().listKeys(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new SharedAccessSignatureAuthorizationRuleImpl(inner1, this.manager()));
    }

    public SharedAccessSignatureAuthorizationRule getKeysForKeyName(
        String resourceGroupName, String resourceName, String keyName) {
        SharedAccessSignatureAuthorizationRuleInner inner =
            this.serviceClient().getKeysForKeyName(resourceGroupName, resourceName, keyName);
        if (inner != null) {
            return new SharedAccessSignatureAuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SharedAccessSignatureAuthorizationRule> getKeysForKeyNameWithResponse(
        String resourceGroupName, String resourceName, String keyName, Context context) {
        Response<SharedAccessSignatureAuthorizationRuleInner> inner =
            this.serviceClient().getKeysForKeyNameWithResponse(resourceGroupName, resourceName, keyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SharedAccessSignatureAuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobResponse exportDevices(
        String resourceGroupName, String resourceName, ExportDevicesRequest exportDevicesParameters) {
        JobResponseInner inner =
            this.serviceClient().exportDevices(resourceGroupName, resourceName, exportDevicesParameters);
        if (inner != null) {
            return new JobResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobResponse> exportDevicesWithResponse(
        String resourceGroupName, String resourceName, ExportDevicesRequest exportDevicesParameters, Context context) {
        Response<JobResponseInner> inner =
            this
                .serviceClient()
                .exportDevicesWithResponse(resourceGroupName, resourceName, exportDevicesParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobResponse importDevices(
        String resourceGroupName, String resourceName, ImportDevicesRequest importDevicesParameters) {
        JobResponseInner inner =
            this.serviceClient().importDevices(resourceGroupName, resourceName, importDevicesParameters);
        if (inner != null) {
            return new JobResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobResponse> importDevicesWithResponse(
        String resourceGroupName, String resourceName, ImportDevicesRequest importDevicesParameters, Context context) {
        Response<JobResponseInner> inner =
            this
                .serviceClient()
                .importDevicesWithResponse(resourceGroupName, resourceName, importDevicesParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IotHubDescription getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<IotHubDescription> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
    }

    public EventHubConsumerGroupInfo getEventHubConsumerGroupById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String eventHubEndpointName = Utils.getValueFromIdByName(id, "eventHubEndpoints");
        if (eventHubEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventHubEndpoints'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "ConsumerGroups");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ConsumerGroups'.", id)));
        }
        return this
            .getEventHubConsumerGroupWithResponse(
                resourceGroupName, resourceName, eventHubEndpointName, name, Context.NONE)
            .getValue();
    }

    public Response<EventHubConsumerGroupInfo> getEventHubConsumerGroupByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String eventHubEndpointName = Utils.getValueFromIdByName(id, "eventHubEndpoints");
        if (eventHubEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventHubEndpoints'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "ConsumerGroups");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ConsumerGroups'.", id)));
        }
        return this
            .getEventHubConsumerGroupWithResponse(resourceGroupName, resourceName, eventHubEndpointName, name, context);
    }

    public IotHubDescription deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        return this.delete(resourceGroupName, resourceName, Context.NONE);
    }

    public IotHubDescription deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        return this.delete(resourceGroupName, resourceName, context);
    }

    public void deleteEventHubConsumerGroupById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String eventHubEndpointName = Utils.getValueFromIdByName(id, "eventHubEndpoints");
        if (eventHubEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventHubEndpoints'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "ConsumerGroups");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ConsumerGroups'.", id)));
        }
        this
            .deleteEventHubConsumerGroupWithResponse(
                resourceGroupName, resourceName, eventHubEndpointName, name, Context.NONE)
            .getValue();
    }

    public Response<Void> deleteEventHubConsumerGroupByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String eventHubEndpointName = Utils.getValueFromIdByName(id, "eventHubEndpoints");
        if (eventHubEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventHubEndpoints'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "ConsumerGroups");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'ConsumerGroups'.", id)));
        }
        return this
            .deleteEventHubConsumerGroupWithResponse(
                resourceGroupName, resourceName, eventHubEndpointName, name, context);
    }

    private IotHubResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iothub.IotHubManager manager() {
        return this.serviceManager;
    }

    public IotHubDescriptionImpl define(String name) {
        return new IotHubDescriptionImpl(name, this.manager());
    }

    public EventHubConsumerGroupInfoImpl defineEventHubConsumerGroup(String name) {
        return new EventHubConsumerGroupInfoImpl(name, this.manager());
    }
}
