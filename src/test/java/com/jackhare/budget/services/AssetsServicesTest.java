package com.jackhare.budget.services;


import org.assertj.core.api.ListAssert;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


class AssetsServicesTest {
    @Test
    void shouldSaveAssetAndReturnListWithOneElementIfThereWasNoSaveAssetsBefore() {
        //given
        var asset=1;
        var service = new AssetsServices();
        service.setAssetsDto(asset);
        //when
            var result=service.getAllAssets();
        //then
        var listOffAss= result.getAssets();
       Assertions.assertThat(listOffAss)
               .hasSize(1)
               .containsExactly(asset);

    }
}