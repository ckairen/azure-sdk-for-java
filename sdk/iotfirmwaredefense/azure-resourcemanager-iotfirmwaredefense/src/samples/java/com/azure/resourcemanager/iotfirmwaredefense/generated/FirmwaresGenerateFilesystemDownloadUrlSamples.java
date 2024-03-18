// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

/**
 * Samples for Firmwares GenerateFilesystemDownloadUrl.
 */
public final class FirmwaresGenerateFilesystemDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/stable/2024-01-10/examples/
     * Firmwares_GenerateFilesystemDownloadUrl_MaximumSet_Gen.json
     */
    /**
     * Sample code: Firmwares_GenerateFilesystemDownloadUrl_MaximumSet_Gen.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void firmwaresGenerateFilesystemDownloadUrlMaximumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager.firmwares().generateFilesystemDownloadUrlWithResponse("rgworkspaces-firmwares", "A7", "umrkdttp",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/stable/2024-01-10/examples/
     * Firmwares_GenerateFilesystemDownloadUrl_MinimumSet_Gen.json
     */
    /**
     * Sample code: Firmwares_GenerateFilesystemDownloadUrl_MinimumSet_Gen.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void firmwaresGenerateFilesystemDownloadUrlMinimumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager.firmwares().generateFilesystemDownloadUrlWithResponse("rgworkspaces-firmwares", "A7", "umrkdttp",
            com.azure.core.util.Context.NONE);
    }
}
