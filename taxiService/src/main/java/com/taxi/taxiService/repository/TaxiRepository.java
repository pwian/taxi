package com.taxi.taxiService.repository;

import com.taxi.taxiService.domain.Taxi;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Aleksandr Ivakin
 **/
public interface TaxiRepository extends CrudRepository<Taxi, String> {

    List<Taxi> getTaxiByDriverIdLicense(String driverIdLicense);
}
