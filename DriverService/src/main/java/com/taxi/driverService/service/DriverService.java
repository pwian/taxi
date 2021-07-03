package com.taxi.driverService.service;

import com.taxi.driverService.domain.Driver;

import java.util.List;

/**
 * @author Aleksandr Ivakin
 **/
public interface DriverService {

    List<Driver> getAvailableDrivers();

    void saveChanges(Driver update);
}
