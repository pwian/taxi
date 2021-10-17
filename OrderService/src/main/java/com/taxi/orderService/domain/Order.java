package com.taxi.orderService.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Aleksandr Ivakin
 **/
@Entity
@Table(name = "Order")
public class Order {

    @Id
    private Integer orderId;
}
