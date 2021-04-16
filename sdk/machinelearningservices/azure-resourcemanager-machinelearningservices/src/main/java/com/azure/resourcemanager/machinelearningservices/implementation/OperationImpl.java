// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.resourcemanager.machinelearningservices.fluent.models.OperationInner;
import com.azure.resourcemanager.machinelearningservices.models.Operation;
import com.azure.resourcemanager.machinelearningservices.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    OperationImpl(
        OperationInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
