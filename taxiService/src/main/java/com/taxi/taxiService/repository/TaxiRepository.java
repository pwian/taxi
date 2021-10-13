package com.taxi.taxiService.repository;

import com.taxi.taxiService.domain.Taxi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aleksandr Ivakin
 **/
@Repository
public interface TaxiRepository extends CrudRepository<Taxi, String> {

    List<Taxi> findByDriverIdLicenseEquals(String driverIdLicense);
}
