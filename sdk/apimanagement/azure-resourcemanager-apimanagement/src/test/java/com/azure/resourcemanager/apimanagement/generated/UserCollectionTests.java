// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.UserContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import com.azure.resourcemanager.apimanagement.models.UserCollection;
import com.azure.resourcemanager.apimanagement.models.UserState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UserCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"firstName\":\"akx\",\"lastName\":\"nfczmnniixyxvq\",\"email\":\"nosjtgirnbgmgmd\",\"registrationDate\":\"2021-05-22T01:48:16Z\",\"groups\":[{\"displayName\":\"y\",\"description\":\"twmp\",\"builtIn\":true,\"type\":\"system\",\"externalId\":\"a\"},{\"displayName\":\"og\",\"description\":\"xwet\",\"builtIn\":true,\"type\":\"custom\",\"externalId\":\"vlkpzwb\"},{\"displayName\":\"nrecchdidrm\",\"description\":\"kahmjedbiucvkhhw\",\"builtIn\":true,\"type\":\"custom\",\"externalId\":\"eunxcqrrihufoi\"},{\"displayName\":\"ppiybxv\",\"description\":\"zuzpbgkzcs\",\"builtIn\":true,\"type\":\"external\",\"externalId\":\"kunhdimjuk\"}],\"state\":\"active\",\"note\":\"kaugpucdocfqplwg\",\"identities\":[{\"provider\":\"xwr\",\"id\":\"vzklkvbgikyjtka\"}]},\"id\":\"vlbishjvpzapt\",\"name\":\"oskaoizji\",\"type\":\"wfgcdiykkcxwn\"}],\"count\":104659426635185987,\"nextLink\":\"nvavitmdm\"}")
                .toObject(UserCollection.class);
        Assertions.assertEquals("akx", model.value().get(0).firstName());
        Assertions.assertEquals("nfczmnniixyxvq", model.value().get(0).lastName());
        Assertions.assertEquals("nosjtgirnbgmgmd", model.value().get(0).email());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-22T01:48:16Z"), model.value().get(0).registrationDate());
        Assertions.assertEquals(UserState.ACTIVE, model.value().get(0).state());
        Assertions.assertEquals("kaugpucdocfqplwg", model.value().get(0).note());
        Assertions.assertEquals("xwr", model.value().get(0).identities().get(0).provider());
        Assertions.assertEquals("vzklkvbgikyjtka", model.value().get(0).identities().get(0).id());
        Assertions.assertEquals(104659426635185987L, model.count());
        Assertions.assertEquals("nvavitmdm", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserCollection model =
            new UserCollection()
                .withValue(
                    Arrays
                        .asList(
                            new UserContractInner()
                                .withFirstName("akx")
                                .withLastName("nfczmnniixyxvq")
                                .withEmail("nosjtgirnbgmgmd")
                                .withRegistrationDate(OffsetDateTime.parse("2021-05-22T01:48:16Z"))
                                .withState(UserState.ACTIVE)
                                .withNote("kaugpucdocfqplwg")
                                .withIdentities(
                                    Arrays
                                        .asList(
                                            new UserIdentityContractInner()
                                                .withProvider("xwr")
                                                .withId("vzklkvbgikyjtka")))))
                .withCount(104659426635185987L)
                .withNextLink("nvavitmdm");
        model = BinaryData.fromObject(model).toObject(UserCollection.class);
        Assertions.assertEquals("akx", model.value().get(0).firstName());
        Assertions.assertEquals("nfczmnniixyxvq", model.value().get(0).lastName());
        Assertions.assertEquals("nosjtgirnbgmgmd", model.value().get(0).email());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-22T01:48:16Z"), model.value().get(0).registrationDate());
        Assertions.assertEquals(UserState.ACTIVE, model.value().get(0).state());
        Assertions.assertEquals("kaugpucdocfqplwg", model.value().get(0).note());
        Assertions.assertEquals("xwr", model.value().get(0).identities().get(0).provider());
        Assertions.assertEquals("vzklkvbgikyjtka", model.value().get(0).identities().get(0).id());
        Assertions.assertEquals(104659426635185987L, model.count());
        Assertions.assertEquals("nvavitmdm", model.nextLink());
    }
}
