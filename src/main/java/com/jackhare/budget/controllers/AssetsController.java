package com.jackhare.budget.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import static java.util.Arrays.asList;

@RestController
@RequestMapping(value = "/assets")
public class AssetsController {

    @GetMapping
    public Dto getAssets() {
        var dto = new Dto();
        dto.setAssets(asList(1,3,5));
        return dto;
    }
    private class Dto {
        private List<Integer> assets;

       // public Dto() {
       // }

        public void setAssets(List<Integer> assets) {
            this.assets = assets;
        }

         public List<Integer> getAssets() {
           return assets;
         }

    }
}
