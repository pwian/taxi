package com.taxi.driverService.service;

import com.taxi.driverService.domain.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aleksandr Ivakin
 **/
@Service
public interface DriverService {

    List<Driver> getAvailableDrivers();

    void saveChanges(String idLicense, Boolean availability);
}
