// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;

/** Samples for Certificate Get. */
public final class CertificateGetSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-10-01/examples/CertificateGetWithDeletionError.json
     */
    /**
     * Sample code: Get Certificate with Deletion Error.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void getCertificateWithDeletionError(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .certificates()
            .getWithResponse(
                "default-azurebatch-japaneast",
                "sampleacct",
                "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-10-01/examples/CertificateGet.json
     */
    /**
     * Sample code: Get Certificate.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void getCertificate(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .certificates()
            .getWithResponse(
                "default-azurebatch-japaneast",
                "sampleacct",
                "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                Context.NONE);
    }
}
