package com.taxi.taxiService.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Aleksandr Ivakin
 **/
@Entity
@Table(name = "Taxi")
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
