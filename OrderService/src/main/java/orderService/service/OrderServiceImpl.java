package orderService.service;

import orderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Aleksandr Ivakin
 **/
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void orderTaxi() {

    }
}
