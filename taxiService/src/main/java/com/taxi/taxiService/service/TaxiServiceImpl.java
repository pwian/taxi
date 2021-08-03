package com.taxi.taxiService.service;

import com.taxi.taxiService.domain.Driver;
import com.taxi.taxiService.domain.Taxi;
import com.taxi.taxiService.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Aleksandr Ivakin
 **/
public class TaxiServiceImpl implements TaxiService{

    @Autowired
    RestTemplate template;

    @Autowired
    TaxiRepository taxiRepository;

    @Override
    public Taxi getBestTaxi(){
        List<Driver> drivers = template.getForObject("http://driverService/availableDrivers", new ArrayList<Driver>().getClass());
        Assert.notEmpty(drivers, "Drivers is empty");

        Driver driver = drivers.stream().min(Comparator.comparing(Driver::getPricePerKm)).get();
        Taxi taxi = taxiRepository.getTaxiByDriverIdLicense(driver.getIdLicense()).stream().findFirst().get();
        Assert.notNull(taxi, "Taxi is not found");
        taxi.setIdLicense(driver.getIdLicense());
        
        return taxi;
    }
}
