package com.taxi.taxiService.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Aleksandr Ivakin
 **/
public class Taxi {

    @Id
    private String number;

    private String driverIdLicense;

    public String getDriverIdLicense() {
        return driverIdLicense;
    }

    public void setDriverIdLicense(String driverIdLicense) {
        this.driverIdLicense = driverIdLicense;
    }
}
