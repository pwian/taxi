package com.taxi.taxiService.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

/**
 * @author Aleksandr Ivakin
 **/
public class Taxi {

    @Id
    private String number;

    private String driverIdLicense;

    @Transient
    private String idLicense;

    public String getDriverIdLicense() {
        return driverIdLicense;
    }

    public void setDriverIdLicense(String driverIdLicense) {
        this.driverIdLicense = driverIdLicense;
    }

    public String getIdLicense() {
        return idLicense;
    }

    public void setIdLicense(String idLicense) {
        this.idLicense = idLicense;
    }
}
