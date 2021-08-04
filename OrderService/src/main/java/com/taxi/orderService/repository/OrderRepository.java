package com.taxi.orderService.repository;

import com.taxi.orderService.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Aleksandr Ivakin
 **/
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
