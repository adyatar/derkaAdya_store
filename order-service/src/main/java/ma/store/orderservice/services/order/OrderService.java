package ma.store.orderservice.services.order;



import ma.store.orderservice.models.entities.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderByID(Long id);

    void addOrder(Order order);

    void deleteOrder(Long id);



}
