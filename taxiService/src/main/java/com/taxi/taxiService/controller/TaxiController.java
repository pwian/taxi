package com.taxi.taxiService.controller;

import com.taxi.taxiService.domain.Taxi;
import com.taxi.taxiService.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Aleksandr Ivakin
 **/
@RestController
public class TaxiController {

    @Autowired
    private TaxiService taxiService;

    @GetMapping
    public Taxi getBestTaxi(){
        return taxiService.getBestTaxi();
    }
}
