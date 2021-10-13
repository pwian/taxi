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
        return repository.findByIsAvailableIsTrue();
    }

    @Override
    public void saveChanges(String idLicense, Boolean availability) {
        Driver driver = repository.getDriverByIdLicense(idLicense);
        Assert.notNull(driver, "Driver not exist with license" + idLicense);

        driver.setIsAvailable(availability);
        repository.save(driver);
    }
}
