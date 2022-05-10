package com.jackhare.budget.services;

import com.jackhare.budget.services.dtos.AssetsDto;
import org.springframework.stereotype.Service;

import static java.util.Arrays.asList;

@Service
public class AssetsServices {

    public AssetsDto getAllAssets() {
        var assetsDto = new AssetsDto();
        assetsDto.setAssets(asList(1, 2, 3));
        return assetsDto;
    }

}
