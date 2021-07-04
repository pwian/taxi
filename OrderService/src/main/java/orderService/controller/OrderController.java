package orderService.controller;

import orderService.service.OrderService;
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

    @GetMapping
    public void orderTaxi(){
        orderService.orderTaxi();
    }
}
