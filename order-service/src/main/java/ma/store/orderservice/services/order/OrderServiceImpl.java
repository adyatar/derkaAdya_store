package ma.store.orderservice.services.order;

import lombok.RequiredArgsConstructor;
import ma.store.orderservice.models.entities.Order;
import ma.store.orderservice.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderByID(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @Override
    public void addOrder(Order order) {
     orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
      orderRepository.deleteById(id);
    }
}
