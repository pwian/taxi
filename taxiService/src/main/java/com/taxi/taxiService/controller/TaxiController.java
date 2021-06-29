package com.taxi.taxiService.controller;

import com.taxi.taxiService.domain.Taxi;
import com.taxi.taxiService.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaxiController {

    @Autowired
    private TaxiService taxiService;

    @RequestMapping(path = "/{number}", method = RequestMethod.GET)
    public Taxi getTaxiByNumber(@PathVariable String number){
        return taxiService.findByNumber(number);
    }
}
