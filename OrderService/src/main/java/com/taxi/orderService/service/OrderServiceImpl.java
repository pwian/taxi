package com.taxi.orderService.service;

import com.taxi.orderService.repository.OrderRepository;
import com.taxi.orderService.domain.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

/**
 * @author Aleksandr Ivakin
 **/
public class OrderServiceImpl implements OrderService {

    @Autowired
    RestTemplate template;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void orderTaxi() {
        Taxi taxi = template.getForObject("http://taxiService/getTaxi", Taxi.class);
        Assert.notNull(taxi, "Taxi is empty");

        template.put(String.format("http://driverService/updateDriver/{id}/true", taxi.getDriverIdLicense()), null);
    }
}
