package com.taxi.taxiService.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Aleksandr Ivakin
 **/
public class Driver {

    private String idLicense;

    private String name;

    private Double pricePerKm;

    private Boolean isAvailable;

    public Boolean getAvailable() {
        return isAvailable;
    }

    public String getIdLicense() {
        return idLicense;
    }

    public void setIdLicense(String idLicense) {
        this.idLicense = idLicense;
    }

    public Double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(Double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean available) {
        isAvailable = available;
    }
}
