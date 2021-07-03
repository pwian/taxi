package com.taxi.driverService.service;

import com.taxi.driverService.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taxi.driverService.domain.Driver;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aleksandr Ivakin
 **/
@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository repository;

    @Override
    public List<Driver> getAvailableDrivers() {
        return repository.getDrivers()
                .stream()
                .filter(driver -> driver.getIsAvailable())
                .collect(Collectors.toList());
    }

    @Override
    public void saveChanges(Driver update) {
        Driver driver = repository.getDriverByIdLicense(update.getIdLicense());
        Assert.notNull(driver, "Driver not exist with license" + update.getIdLicense());

        driver.setIsAvailable(update.getIsAvailable());
        driver.setName(update.getName());
        driver.setPricePerKm(update.getPricePerKm());
        repository.save(driver);
    }
}