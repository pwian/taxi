package com.taxi.orderService.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Aleksandr Ivakin
 **/
@Entity
public class Order {

    @Id
    private Integer orderId;
}
