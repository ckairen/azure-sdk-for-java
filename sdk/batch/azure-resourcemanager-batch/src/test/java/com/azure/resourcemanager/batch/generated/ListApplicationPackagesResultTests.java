// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.ApplicationPackageInner;
import com.azure.resourcemanager.batch.models.ListApplicationPackagesResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ListApplicationPackagesResultTests {
    @Test
    public void testDeserialize() {
        ListApplicationPackagesResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"state\":\"Active\",\"format\":\"whijcoejctbza\",\"storageUrl\":\"qsycbkbfkgu\",\"storageUrlExpiry\":\"2021-02-11T20:09:09Z\",\"lastActivationTime\":\"2021-09-14T22:19:30Z\"},\"etag\":\"ppofmxaxcfjpgdd\",\"id\":\"ocjjxhvpmouexh\",\"name\":\"zxibqeoj\",\"type\":\"xqbzvddntwnd\"},{\"properties\":{\"state\":\"Active\",\"format\":\"w\",\"storageUrl\":\"zao\",\"storageUrlExpiry\":\"2021-06-27T05:29:39Z\",\"lastActivationTime\":\"2021-09-17T10:09:05Z\"},\"etag\":\"cffcyddglmj\",\"id\":\"hjq\",\"name\":\"wpyeicxmqciwqvh\",\"type\":\"hix\"},{\"properties\":{\"state\":\"Pending\",\"format\":\"opbobj\",\"storageUrl\":\"hm\",\"storageUrlExpiry\":\"2021-10-27T21:17:16Z\",\"lastActivationTime\":\"2021-10-29T01:50:02Z\"},\"etag\":\"uhrzayvvt\",\"id\":\"gvdfgiotkftutq\",\"name\":\"ln\",\"type\":\"xlefgugnxkrx\"},{\"properties\":{\"state\":\"Pending\",\"format\":\"tthzrvqd\",\"storageUrl\":\"bhj\",\"storageUrlExpiry\":\"2021-09-14T02:51:19Z\",\"lastActivationTime\":\"2021-06-25T18:07:24Z\"},\"etag\":\"oqfbowskanyk\",\"id\":\"zlcuiywgqywgndrv\",\"name\":\"nhzgpphrcgyn\",\"type\":\"ocpecfvmmco\"}],\"nextLink\":\"sxlzevgbmqj\"}")
                .toObject(ListApplicationPackagesResult.class);
        Assertions.assertEquals("sxlzevgbmqj", model.nextLink());
    }

    @Test
    public void testSerialize() {
        ListApplicationPackagesResult model =
            new ListApplicationPackagesResult()
                .withValue(
                    Arrays
                        .asList(
                            new ApplicationPackageInner(),
                            new ApplicationPackageInner(),
                            new ApplicationPackageInner(),
                            new ApplicationPackageInner()))
                .withNextLink("sxlzevgbmqj");
        model = BinaryData.fromObject(model).toObject(ListApplicationPackagesResult.class);
        Assertions.assertEquals("sxlzevgbmqj", model.nextLink());
    }
}
