package com.taxi.taxiService.service;

import com.taxi.taxiService.domain.Taxi;

/**
 * @author Aleksandr Ivakin
 **/
public interface TaxiService {

    Taxi findByNumber(String number);
}
