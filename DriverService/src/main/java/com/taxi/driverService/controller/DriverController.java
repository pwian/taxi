package com.taxi.driverService.controller;

import com.taxi.driverService.domain.Driver;
import com.taxi.driverService.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Aleksandr Ivakin
 **/
@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping(path = "/availableDrivers")
    public List<Driver> getAvailableDrivers(){
        return driverService.getAvailableDrivers();
    }

    @PutMapping(path = "/updateDriver")
    public void setDriverAvailability(String idLicense, @NotNull @Valid Boolean availability){
        driverService.saveChanges(idLicense, availability);
    }
}
