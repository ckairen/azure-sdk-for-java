// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumePatchProperties;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.VolumeBackupProperties;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumeSnapshotProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatchProperties model =
            BinaryData
                .fromString(
                    "{\"serviceLevel\":\"Standard\",\"usageThreshold\":2795086805451114111,\"exportPolicy\":{\"rules\":[{\"ruleIndex\":1557005906,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":true,\"nfsv41\":true,\"allowedClients\":\"mkfssxqukkfplgm\",\"hasRootAccess\":true,\"chownMode\":\"Restricted\"},{\"ruleIndex\":543946486,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"aiuebbaumnyqu\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"}]},\"throughputMibps\":60.13314,\"dataProtection\":{\"backup\":{\"backupPolicyId\":\"khsmtxpsiebt\",\"policyEnforced\":true,\"backupEnabled\":false},\"snapshot\":{\"snapshotPolicyId\":\"pskrdqmh\"}},\"isDefaultQuotaEnabled\":true,\"defaultUserQuotaInKiBs\":3744961131672427134,\"defaultGroupQuotaInKiBs\":2973722017967146384,\"unixPermissions\":\"zxuutkncwscwsvl\",\"coolAccess\":false,\"coolnessPeriod\":143506612}")
                .toObject(VolumePatchProperties.class);
        Assertions.assertEquals(ServiceLevel.STANDARD, model.serviceLevel());
        Assertions.assertEquals(2795086805451114111L, model.usageThreshold());
        Assertions.assertEquals(1557005906, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("mkfssxqukkfplgm", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals(60.13314F, model.throughputMibps());
        Assertions.assertEquals("khsmtxpsiebt", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals(false, model.dataProtection().backup().backupEnabled());
        Assertions.assertEquals("pskrdqmh", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(3744961131672427134L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(2973722017967146384L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("zxuutkncwscwsvl", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(143506612, model.coolnessPeriod());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatchProperties model =
            new VolumePatchProperties()
                .withServiceLevel(ServiceLevel.STANDARD)
                .withUsageThreshold(2795086805451114111L)
                .withExportPolicy(
                    new VolumePatchPropertiesExportPolicy()
                        .withRules(
                            Arrays
                                .asList(
                                    new ExportPolicyRule()
                                        .withRuleIndex(1557005906)
                                        .withUnixReadOnly(true)
                                        .withUnixReadWrite(false)
                                        .withKerberos5ReadOnly(false)
                                        .withKerberos5ReadWrite(false)
                                        .withKerberos5IReadOnly(true)
                                        .withKerberos5IReadWrite(true)
                                        .withKerberos5PReadOnly(true)
                                        .withKerberos5PReadWrite(false)
                                        .withCifs(false)
                                        .withNfsv3(true)
                                        .withNfsv41(true)
                                        .withAllowedClients("mkfssxqukkfplgm")
                                        .withHasRootAccess(true)
                                        .withChownMode(ChownMode.RESTRICTED),
                                    new ExportPolicyRule()
                                        .withRuleIndex(543946486)
                                        .withUnixReadOnly(false)
                                        .withUnixReadWrite(false)
                                        .withKerberos5ReadOnly(true)
                                        .withKerberos5ReadWrite(false)
                                        .withKerberos5IReadOnly(false)
                                        .withKerberos5IReadWrite(false)
                                        .withKerberos5PReadOnly(false)
                                        .withKerberos5PReadWrite(false)
                                        .withCifs(false)
                                        .withNfsv3(false)
                                        .withNfsv41(false)
                                        .withAllowedClients("aiuebbaumnyqu")
                                        .withHasRootAccess(false)
                                        .withChownMode(ChownMode.UNRESTRICTED))))
                .withThroughputMibps(60.13314F)
                .withDataProtection(
                    new VolumePatchPropertiesDataProtection()
                        .withBackup(
                            new VolumeBackupProperties()
                                .withBackupPolicyId("khsmtxpsiebt")
                                .withPolicyEnforced(true)
                                .withBackupEnabled(false))
                        .withSnapshot(new VolumeSnapshotProperties().withSnapshotPolicyId("pskrdqmh")))
                .withIsDefaultQuotaEnabled(true)
                .withDefaultUserQuotaInKiBs(3744961131672427134L)
                .withDefaultGroupQuotaInKiBs(2973722017967146384L)
                .withUnixPermissions("zxuutkncwscwsvl")
                .withCoolAccess(false)
                .withCoolnessPeriod(143506612);
        model = BinaryData.fromObject(model).toObject(VolumePatchProperties.class);
        Assertions.assertEquals(ServiceLevel.STANDARD, model.serviceLevel());
        Assertions.assertEquals(2795086805451114111L, model.usageThreshold());
        Assertions.assertEquals(1557005906, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("mkfssxqukkfplgm", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals(60.13314F, model.throughputMibps());
        Assertions.assertEquals("khsmtxpsiebt", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals(false, model.dataProtection().backup().backupEnabled());
        Assertions.assertEquals("pskrdqmh", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(3744961131672427134L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(2973722017967146384L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("zxuutkncwscwsvl", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(143506612, model.coolnessPeriod());
    }
}
