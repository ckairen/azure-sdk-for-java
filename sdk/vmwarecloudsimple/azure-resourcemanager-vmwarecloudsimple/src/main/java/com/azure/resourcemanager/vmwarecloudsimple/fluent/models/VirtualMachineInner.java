// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.models.GuestOSCustomization;
import com.azure.resourcemanager.vmwarecloudsimple.models.GuestOSType;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualDisk;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualDiskController;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualMachineStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Virtual machine model. */
@JsonFlatten
@Fluent
public class VirtualMachineInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineInner.class);

    /*
     * The amount of memory
     */
    @JsonProperty(value = "properties.amountOfRam")
    private Integer amountOfRam;

    /*
     * The list of Virtual Disks' Controllers
     */
    @JsonProperty(value = "properties.controllers", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualDiskController> controllers;

    /*
     * Virtual machine properties
     */
    @JsonProperty(value = "properties.customization")
    private GuestOSCustomization customization;

    /*
     * The list of Virtual Disks
     */
    @JsonProperty(value = "properties.disks")
    private List<VirtualDisk> disks;

    /*
     * The DNS name of Virtual Machine in VCenter
     */
    @JsonProperty(value = "properties.dnsname", access = JsonProperty.Access.WRITE_ONLY)
    private String dnsname;

    /*
     * Expose Guest OS or not
     */
    @JsonProperty(value = "properties.exposeToGuestVM")
    private Boolean exposeToGuestVM;

    /*
     * The path to virtual machine folder in VCenter
     */
    @JsonProperty(value = "properties.folder", access = JsonProperty.Access.WRITE_ONLY)
    private String folder;

    /*
     * The name of Guest OS
     */
    @JsonProperty(value = "properties.guestOS", access = JsonProperty.Access.WRITE_ONLY)
    private String guestOS;

    /*
     * The Guest OS type
     */
    @JsonProperty(value = "properties.guestOSType", access = JsonProperty.Access.WRITE_ONLY)
    private GuestOSType guestOSType;

    /*
     * The list of Virtual NICs
     */
    @JsonProperty(value = "properties.nics")
    private List<VirtualNicInner> nics;

    /*
     * The number of CPU cores
     */
    @JsonProperty(value = "properties.numberOfCores")
    private Integer numberOfCores;

    /*
     * Password for login. Deprecated - use customization property
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /*
     * Private Cloud Id
     */
    @JsonProperty(value = "properties.privateCloudId")
    private String privateCloudId;

    /*
     * The provisioning status of the resource
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The public ip of Virtual Machine
     */
    @JsonProperty(value = "properties.publicIP", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIp;

    /*
     * Virtual Machines Resource Pool
     */
    @JsonProperty(value = "properties.resourcePool")
    private ResourcePoolInner resourcePool;

    /*
     * The status of Virtual machine
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineStatus status;

    /*
     * Virtual Machine Template Id
     */
    @JsonProperty(value = "properties.templateId")
    private String templateId;

    /*
     * Username for login. Deprecated - use customization property
     */
    @JsonProperty(value = "properties.username")
    private String username;

    /*
     * The list of Virtual VSphere Networks
     */
    @JsonProperty(value = "properties.vSphereNetworks")
    private List<String> vSphereNetworks;

    /*
     * The internal id of Virtual Machine in VCenter
     */
    @JsonProperty(value = "properties.vmId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmId;

    /*
     * VMware tools version
     */
    @JsonProperty(value = "properties.vmwaretools", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwaretools;

    /**
     * Get the amountOfRam property: The amount of memory.
     *
     * @return the amountOfRam value.
     */
    public Integer amountOfRam() {
        return this.amountOfRam;
    }

    /**
     * Set the amountOfRam property: The amount of memory.
     *
     * @param amountOfRam the amountOfRam value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withAmountOfRam(Integer amountOfRam) {
        this.amountOfRam = amountOfRam;
        return this;
    }

    /**
     * Get the controllers property: The list of Virtual Disks' Controllers.
     *
     * @return the controllers value.
     */
    public List<VirtualDiskController> controllers() {
        return this.controllers;
    }

    /**
     * Get the customization property: Virtual machine properties.
     *
     * @return the customization value.
     */
    public GuestOSCustomization customization() {
        return this.customization;
    }

    /**
     * Set the customization property: Virtual machine properties.
     *
     * @param customization the customization value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withCustomization(GuestOSCustomization customization) {
        this.customization = customization;
        return this;
    }

    /**
     * Get the disks property: The list of Virtual Disks.
     *
     * @return the disks value.
     */
    public List<VirtualDisk> disks() {
        return this.disks;
    }

    /**
     * Set the disks property: The list of Virtual Disks.
     *
     * @param disks the disks value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withDisks(List<VirtualDisk> disks) {
        this.disks = disks;
        return this;
    }

    /**
     * Get the dnsname property: The DNS name of Virtual Machine in VCenter.
     *
     * @return the dnsname value.
     */
    public String dnsname() {
        return this.dnsname;
    }

    /**
     * Get the exposeToGuestVM property: Expose Guest OS or not.
     *
     * @return the exposeToGuestVM value.
     */
    public Boolean exposeToGuestVM() {
        return this.exposeToGuestVM;
    }

    /**
     * Set the exposeToGuestVM property: Expose Guest OS or not.
     *
     * @param exposeToGuestVM the exposeToGuestVM value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withExposeToGuestVM(Boolean exposeToGuestVM) {
        this.exposeToGuestVM = exposeToGuestVM;
        return this;
    }

    /**
     * Get the folder property: The path to virtual machine folder in VCenter.
     *
     * @return the folder value.
     */
    public String folder() {
        return this.folder;
    }

    /**
     * Get the guestOS property: The name of Guest OS.
     *
     * @return the guestOS value.
     */
    public String guestOS() {
        return this.guestOS;
    }

    /**
     * Get the guestOSType property: The Guest OS type.
     *
     * @return the guestOSType value.
     */
    public GuestOSType guestOSType() {
        return this.guestOSType;
    }

    /**
     * Get the nics property: The list of Virtual NICs.
     *
     * @return the nics value.
     */
    public List<VirtualNicInner> nics() {
        return this.nics;
    }

    /**
     * Set the nics property: The list of Virtual NICs.
     *
     * @param nics the nics value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withNics(List<VirtualNicInner> nics) {
        this.nics = nics;
        return this;
    }

    /**
     * Get the numberOfCores property: The number of CPU cores.
     *
     * @return the numberOfCores value.
     */
    public Integer numberOfCores() {
        return this.numberOfCores;
    }

    /**
     * Set the numberOfCores property: The number of CPU cores.
     *
     * @param numberOfCores the numberOfCores value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    /**
     * Get the password property: Password for login. Deprecated - use customization property.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password for login. Deprecated - use customization property.
     *
     * @param password the password value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the privateCloudId property: Private Cloud Id.
     *
     * @return the privateCloudId value.
     */
    public String privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Set the privateCloudId property: Private Cloud Id.
     *
     * @param privateCloudId the privateCloudId value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withPrivateCloudId(String privateCloudId) {
        this.privateCloudId = privateCloudId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicIp property: The public ip of Virtual Machine.
     *
     * @return the publicIp value.
     */
    public String publicIp() {
        return this.publicIp;
    }

    /**
     * Get the resourcePool property: Virtual Machines Resource Pool.
     *
     * @return the resourcePool value.
     */
    public ResourcePoolInner resourcePool() {
        return this.resourcePool;
    }

    /**
     * Set the resourcePool property: Virtual Machines Resource Pool.
     *
     * @param resourcePool the resourcePool value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withResourcePool(ResourcePoolInner resourcePool) {
        this.resourcePool = resourcePool;
        return this;
    }

    /**
     * Get the status property: The status of Virtual machine.
     *
     * @return the status value.
     */
    public VirtualMachineStatus status() {
        return this.status;
    }

    /**
     * Get the templateId property: Virtual Machine Template Id.
     *
     * @return the templateId value.
     */
    public String templateId() {
        return this.templateId;
    }

    /**
     * Set the templateId property: Virtual Machine Template Id.
     *
     * @param templateId the templateId value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Get the username property: Username for login. Deprecated - use customization property.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username for login. Deprecated - use customization property.
     *
     * @param username the username value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the vSphereNetworks property: The list of Virtual VSphere Networks.
     *
     * @return the vSphereNetworks value.
     */
    public List<String> vSphereNetworks() {
        return this.vSphereNetworks;
    }

    /**
     * Set the vSphereNetworks property: The list of Virtual VSphere Networks.
     *
     * @param vSphereNetworks the vSphereNetworks value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withVSphereNetworks(List<String> vSphereNetworks) {
        this.vSphereNetworks = vSphereNetworks;
        return this;
    }

    /**
     * Get the vmId property: The internal id of Virtual Machine in VCenter.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Get the vmwaretools property: VMware tools version.
     *
     * @return the vmwaretools value.
     */
    public String vmwaretools() {
        return this.vmwaretools;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controllers() != null) {
            controllers().forEach(e -> e.validate());
        }
        if (customization() != null) {
            customization().validate();
        }
        if (disks() != null) {
            disks().forEach(e -> e.validate());
        }
        if (nics() != null) {
            nics().forEach(e -> e.validate());
        }
        if (resourcePool() != null) {
            resourcePool().validate();
        }
    }
}
