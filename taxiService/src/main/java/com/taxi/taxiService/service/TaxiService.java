package com.taxi.taxiService.service;

import com.taxi.taxiService.domain.Taxi;

public interface TaxiService {

    Taxi findByNumber(String number);
}
