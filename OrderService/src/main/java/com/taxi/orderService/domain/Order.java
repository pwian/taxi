package com.taxi.orderService.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Aleksandr Ivakin
 **/
public class Order {

    @Id
    private Integer orderId;
}
