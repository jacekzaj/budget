package com.jackhare.budget.services;


import org.assertj.core.api.ListAssert;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


class AssetsServicesTest {
    @Test
    void shouldSaveAssetAndReturnListWithOneElementIfThereWasNoSaveAssetsBefore() {
        //given
        var service = new AssetsServices();
        //when
            var result=service.getAllAssets();
        //then
        var listOffAss= result.getAssets();
       Assertions.assertThat(listOffAss).hasSize(1);

    }
}