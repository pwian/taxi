package com.taxi.orderService.controller;

import com.taxi.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aleksandr Ivakin
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/order")
    public void orderTaxi(){
        orderService.orderTaxi();
    }
}
