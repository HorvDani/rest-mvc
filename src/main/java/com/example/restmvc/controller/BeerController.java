package com.example.restmvc.controller;

import com.example.restmvc.model.Beer;
import com.example.restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id){

        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(id);
    }
}
