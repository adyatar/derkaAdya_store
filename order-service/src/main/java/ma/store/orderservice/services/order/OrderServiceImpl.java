package ma.store.orderservice.services.order;

import lombok.RequiredArgsConstructor;
import ma.store.orderservice.models.entities.Ordere;
import ma.store.orderservice.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    @Override
    public List<Ordere> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Ordere getOrderByID(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @Override
    public void addOrder(Ordere order) {
     orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
      orderRepository.deleteById(id);
    }
}
