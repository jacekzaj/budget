package com.jackhare.budget.controllers;

import com.jackhare.budget.services.AssetsServices;
import com.jackhare.budget.services.dtos.AssetsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/assets")
public class AssetsController {

    @Autowired
    private final AssetsServices assetsServices;

    public AssetsController(AssetsServices assetsServices) {
        this.assetsServices = assetsServices;
    }

    @GetMapping
    public AssetsDto getAssets() {
          return assetsServices.getAllAssets();
    }

}
