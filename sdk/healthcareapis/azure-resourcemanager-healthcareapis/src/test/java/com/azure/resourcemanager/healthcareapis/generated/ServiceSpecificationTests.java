// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.LogSpecification;
import com.azure.resourcemanager.healthcareapis.models.MetricDimension;
import com.azure.resourcemanager.healthcareapis.models.MetricSpecification;
import com.azure.resourcemanager.healthcareapis.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceSpecification model = BinaryData.fromString(
            "{\"logSpecifications\":[{\"name\":\"wib\",\"displayName\":\"cdl\",\"blobDuration\":\"shfwpracstwity\"},{\"name\":\"evxccedcp\",\"displayName\":\"dyodnwzxltj\",\"blobDuration\":\"nhltiugcxn\"}],\"metricSpecifications\":[{\"name\":\"xqi\",\"displayName\":\"qunyowxwlmdjr\",\"displayDescription\":\"fgbvfvpdbo\",\"unit\":\"cizsjqlhkrribdei\",\"category\":\"ipqkghvxndzwm\",\"aggregationType\":\"efajpj\",\"supportedAggregationTypes\":[\"kqnyh\",\"b\"],\"supportedTimeGrainTypes\":[\"jivfxzsjabib\",\"ystawfsdjpvkvp\",\"jxbkzbzkdvn\",\"jabudurgkakmo\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"jk\",\"dimensions\":[{\"name\":\"mouwqlgzrfzeey\",\"displayName\":\"izikayuhq\",\"toBeExportedForShoebox\":false},{\"name\":\"sybbqwr\",\"displayName\":\"ldgmfpgvmpip\",\"toBeExportedForShoebox\":false}],\"isInternal\":false,\"sourceMdmAccount\":\"qfxssmwutw\",\"sourceMdmNamespace\":\"srezp\",\"enableRegionalMdmAccount\":true,\"resourceIdDimensionNameOverride\":\"euyowqkd\"},{\"name\":\"t\",\"displayName\":\"ib\",\"displayDescription\":\"cgpik\",\"unit\":\"imejzanl\",\"category\":\"xi\",\"aggregationType\":\"rmbzo\",\"supportedAggregationTypes\":[\"i\",\"rjqc\"],\"supportedTimeGrainTypes\":[\"zpfrla\",\"szrnwo\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"fpwpjylwbt\",\"dimensions\":[{\"name\":\"sj\",\"displayName\":\"hszfjvfb\",\"toBeExportedForShoebox\":true},{\"name\":\"ljagrqmqhl\",\"displayName\":\"riiiojnalghfkv\",\"toBeExportedForShoebox\":false}],\"isInternal\":false,\"sourceMdmAccount\":\"owueluqh\",\"sourceMdmNamespace\":\"hhxvrhmzkwpj\",\"enableRegionalMdmAccount\":true,\"resourceIdDimensionNameOverride\":\"pughftqsxh\"},{\"name\":\"ujxukndxd\",\"displayName\":\"rjguufzdmsyqtf\",\"displayDescription\":\"whbotzingamv\",\"unit\":\"ho\",\"category\":\"qzudphq\",\"aggregationType\":\"vdkfwynwcvtbvk\",\"supportedAggregationTypes\":[\"mtnvyq\",\"atkzwpcnpw\"],\"supportedTimeGrainTypes\":[\"a\",\"sgvvsccyajguq\",\"hwyg\"],\"fillGapWithZero\":true,\"metricFilterPattern\":\"nk\",\"dimensions\":[{\"name\":\"emdwzrmuhapfc\",\"displayName\":\"psqxq\",\"toBeExportedForShoebox\":false},{\"name\":\"uoymgccelvezry\",\"displayName\":\"lmfeokerq\",\"toBeExportedForShoebox\":false},{\"name\":\"kobopgxed\",\"displayName\":\"wep\",\"toBeExportedForShoebox\":false},{\"name\":\"rfkbwccsnjvcdwxl\",\"displayName\":\"ekftnkhtj\",\"toBeExportedForShoebox\":false}],\"isInternal\":false,\"sourceMdmAccount\":\"fq\",\"sourceMdmNamespace\":\"mtdh\",\"enableRegionalMdmAccount\":true,\"resourceIdDimensionNameOverride\":\"ypgik\"}]}")
            .toObject(ServiceSpecification.class);
        Assertions.assertEquals("wib", model.logSpecifications().get(0).name());
        Assertions.assertEquals("cdl", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("shfwpracstwity", model.logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("xqi", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("qunyowxwlmdjr", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("fgbvfvpdbo", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("cizsjqlhkrribdei", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("ipqkghvxndzwm", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("efajpj", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("kqnyh", model.metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("jivfxzsjabib", model.metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false, model.metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("jk", model.metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals("mouwqlgzrfzeey", model.metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("izikayuhq", model.metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals(false,
            model.metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals(false, model.metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("qfxssmwutw", model.metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("srezp", model.metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(true, model.metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("euyowqkd", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceSpecification model
            = new ServiceSpecification()
                .withLogSpecifications(Arrays.asList(
                    new LogSpecification().withName("wib").withDisplayName("cdl").withBlobDuration("shfwpracstwity"),
                    new LogSpecification().withName("evxccedcp").withDisplayName("dyodnwzxltj")
                        .withBlobDuration("nhltiugcxn")))
                .withMetricSpecifications(Arrays.asList(
                    new MetricSpecification().withName("xqi").withDisplayName("qunyowxwlmdjr")
                        .withDisplayDescription("fgbvfvpdbo").withUnit("cizsjqlhkrribdei").withCategory("ipqkghvxndzwm")
                        .withAggregationType("efajpj").withSupportedAggregationTypes(Arrays.asList("kqnyh", "b"))
                        .withSupportedTimeGrainTypes(
                            Arrays.asList("jivfxzsjabib", "ystawfsdjpvkvp", "jxbkzbzkdvn", "jabudurgkakmo"))
                        .withFillGapWithZero(false).withMetricFilterPattern("jk")
                        .withDimensions(Arrays.asList(
                            new MetricDimension().withName("mouwqlgzrfzeey").withDisplayName("izikayuhq")
                                .withToBeExportedForShoebox(false),
                            new MetricDimension().withName("sybbqwr").withDisplayName("ldgmfpgvmpip")
                                .withToBeExportedForShoebox(false)))
                        .withIsInternal(false).withSourceMdmAccount("qfxssmwutw").withSourceMdmNamespace("srezp")
                        .withEnableRegionalMdmAccount(true).withResourceIdDimensionNameOverride("euyowqkd"),
                    new MetricSpecification().withName("t").withDisplayName("ib").withDisplayDescription("cgpik")
                        .withUnit("imejzanl").withCategory("xi").withAggregationType("rmbzo")
                        .withSupportedAggregationTypes(Arrays.asList("i", "rjqc"))
                        .withSupportedTimeGrainTypes(Arrays.asList("zpfrla", "szrnwo")).withFillGapWithZero(false)
                        .withMetricFilterPattern("fpwpjylwbt")
                        .withDimensions(Arrays.asList(
                            new MetricDimension().withName("sj").withDisplayName("hszfjvfb")
                                .withToBeExportedForShoebox(true),
                            new MetricDimension().withName("ljagrqmqhl").withDisplayName("riiiojnalghfkv")
                                .withToBeExportedForShoebox(false)))
                        .withIsInternal(false).withSourceMdmAccount("owueluqh").withSourceMdmNamespace("hhxvrhmzkwpj")
                        .withEnableRegionalMdmAccount(true).withResourceIdDimensionNameOverride("pughftqsxh"),
                    new MetricSpecification().withName("ujxukndxd").withDisplayName("rjguufzdmsyqtf")
                        .withDisplayDescription("whbotzingamv").withUnit("ho").withCategory("qzudphq")
                        .withAggregationType("vdkfwynwcvtbvk")
                        .withSupportedAggregationTypes(Arrays.asList("mtnvyq", "atkzwpcnpw"))
                        .withSupportedTimeGrainTypes(Arrays.asList("a", "sgvvsccyajguq", "hwyg"))
                        .withFillGapWithZero(true).withMetricFilterPattern("nk")
                        .withDimensions(Arrays.asList(
                            new MetricDimension().withName("emdwzrmuhapfc").withDisplayName("psqxq")
                                .withToBeExportedForShoebox(false),
                            new MetricDimension().withName("uoymgccelvezry").withDisplayName("lmfeokerq")
                                .withToBeExportedForShoebox(false),
                            new MetricDimension().withName("kobopgxed").withDisplayName("wep")
                                .withToBeExportedForShoebox(false),
                            new MetricDimension().withName("rfkbwccsnjvcdwxl").withDisplayName("ekftnkhtj")
                                .withToBeExportedForShoebox(false)))
                        .withIsInternal(false).withSourceMdmAccount("fq").withSourceMdmNamespace("mtdh")
                        .withEnableRegionalMdmAccount(true).withResourceIdDimensionNameOverride("ypgik")));
        model = BinaryData.fromObject(model).toObject(ServiceSpecification.class);
        Assertions.assertEquals("wib", model.logSpecifications().get(0).name());
        Assertions.assertEquals("cdl", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("shfwpracstwity", model.logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("xqi", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("qunyowxwlmdjr", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("fgbvfvpdbo", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("cizsjqlhkrribdei", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("ipqkghvxndzwm", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("efajpj", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("kqnyh", model.metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("jivfxzsjabib", model.metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false, model.metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("jk", model.metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals("mouwqlgzrfzeey", model.metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("izikayuhq", model.metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals(false,
            model.metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals(false, model.metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("qfxssmwutw", model.metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("srezp", model.metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(true, model.metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("euyowqkd", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }
}
