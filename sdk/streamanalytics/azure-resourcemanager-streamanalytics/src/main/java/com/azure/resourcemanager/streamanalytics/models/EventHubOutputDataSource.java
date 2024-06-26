// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.EventHubOutputDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes an Event Hub output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.ServiceBus/EventHub")
@Fluent
public final class EventHubOutputDataSource extends OutputDataSource {
    /*
     * The properties that are associated with an Event Hub output. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private EventHubOutputDataSourceProperties innerProperties;

    /**
     * Creates an instance of EventHubOutputDataSource class.
     */
    public EventHubOutputDataSource() {
    }

    /**
     * Get the innerProperties property: The properties that are associated with an Event Hub output. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    private EventHubOutputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the partitionKey property: The key/column that is used to determine to which partition to send event data.
     * 
     * @return the partitionKey value.
     */
    public String partitionKey() {
        return this.innerProperties() == null ? null : this.innerProperties().partitionKey();
    }

    /**
     * Set the partitionKey property: The key/column that is used to determine to which partition to send event data.
     * 
     * @param partitionKey the partitionKey value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withPartitionKey(String partitionKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withPartitionKey(partitionKey);
        return this;
    }

    /**
     * Get the propertyColumns property: The properties associated with this Event Hub output.
     * 
     * @return the propertyColumns value.
     */
    public List<String> propertyColumns() {
        return this.innerProperties() == null ? null : this.innerProperties().propertyColumns();
    }

    /**
     * Set the propertyColumns property: The properties associated with this Event Hub output.
     * 
     * @param propertyColumns the propertyColumns value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withPropertyColumns(List<String> propertyColumns) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withPropertyColumns(propertyColumns);
        return this;
    }

    /**
     * Get the eventHubName property: The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.innerProperties() == null ? null : this.innerProperties().eventHubName();
    }

    /**
     * Set the eventHubName property: The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     * @param eventHubName the eventHubName value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withEventHubName(String eventHubName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withEventHubName(eventHubName);
        return this;
    }

    /**
     * Get the partitionCount property: The partition count of the event hub data source. Range 1 - 256.
     * 
     * @return the partitionCount value.
     */
    public Integer partitionCount() {
        return this.innerProperties() == null ? null : this.innerProperties().partitionCount();
    }

    /**
     * Set the partitionCount property: The partition count of the event hub data source. Range 1 - 256.
     * 
     * @param partitionCount the partitionCount value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withPartitionCount(Integer partitionCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withPartitionCount(partitionCount);
        return this;
    }

    /**
     * Get the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the serviceBusNamespace value.
     */
    public String serviceBusNamespace() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusNamespace();
    }

    /**
     * Set the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @param serviceBusNamespace the serviceBusNamespace value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withServiceBusNamespace(String serviceBusNamespace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withServiceBusNamespace(serviceBusNamespace);
        return this;
    }

    /**
     * Get the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the sharedAccessPolicyName value.
     */
    public String sharedAccessPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedAccessPolicyName();
    }

    /**
     * Set the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withSharedAccessPolicyName(String sharedAccessPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withSharedAccessPolicyName(sharedAccessPolicyName);
        return this;
    }

    /**
     * Get the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @return the sharedAccessPolicyKey value.
     */
    public String sharedAccessPolicyKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedAccessPolicyKey();
    }

    /**
     * Set the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @param sharedAccessPolicyKey the sharedAccessPolicyKey value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withSharedAccessPolicyKey(sharedAccessPolicyKey);
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     * 
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationMode();
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     * 
     * @param authenticationMode the authenticationMode value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubOutputDataSourceProperties();
        }
        this.innerProperties().withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
