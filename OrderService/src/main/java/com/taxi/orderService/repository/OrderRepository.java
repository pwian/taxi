package com.taxi.orderService.repository;

import com.taxi.orderService.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aleksandr Ivakin
 **/
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
