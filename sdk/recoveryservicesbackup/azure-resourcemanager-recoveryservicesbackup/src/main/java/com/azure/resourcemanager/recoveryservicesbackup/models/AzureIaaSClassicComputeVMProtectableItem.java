// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** IaaS VM workload-specific backup item representing the Classic Compute VM. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("Microsoft.ClassicCompute/virtualMachines")
@Fluent
public final class AzureIaaSClassicComputeVMProtectableItem extends IaaSvmProtectableItem {
    /** {@inheritDoc} */
    @Override
    public AzureIaaSClassicComputeVMProtectableItem withVirtualMachineId(String virtualMachineId) {
        super.withVirtualMachineId(virtualMachineId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSClassicComputeVMProtectableItem withVirtualMachineVersion(String virtualMachineVersion) {
        super.withVirtualMachineVersion(virtualMachineVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSClassicComputeVMProtectableItem withResourceGroup(String resourceGroup) {
        super.withResourceGroup(resourceGroup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSClassicComputeVMProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSClassicComputeVMProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSClassicComputeVMProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSClassicComputeVMProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
    }
}
