package com.taxi.driverService.repository;

import com.taxi.driverService.domain.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aleksandr Ivakin
 **/
@Repository
public interface DriverRepository extends CrudRepository<Driver, String> {

    Driver getDriverByIdLicense(String idLicense);

    List<Driver> findAll();
}
