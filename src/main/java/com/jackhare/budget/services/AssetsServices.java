package com.jackhare.budget.services;

import com.jackhare.budget.services.dtos.AssetsDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static java.util.Arrays.asList;

@Service
public class AssetsServices {
    private AssetsDto assetsDto = new AssetsDto();

    public AssetsDto getAllAssets() {

        //assetsDto.setAssets(asList(1, 2, 3));
        return assetsDto;
    }

    public void setAssetsDto(int asset) {
        var allAssets = assetsDto.getAssets();
        if (allAssets == null) {
            allAssets = new ArrayList<>();
        }
        allAssets.add(asset);
        assetsDto.setAssets(allAssets);
    }
}
