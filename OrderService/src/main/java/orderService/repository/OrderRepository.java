package orderService.repository;

import orderService.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Aleksandr Ivakin
 **/
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
