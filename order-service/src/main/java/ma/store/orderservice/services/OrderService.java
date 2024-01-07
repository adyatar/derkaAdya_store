package ma.store.orderservice.services;


import ma.store.orderservice.models.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderService {
    List<OrderDto> getAllOrders();

    OrderDto getOrderById(Long id);

    void addOrder(OrderDto orderDto);

    void deleteOrder(Long id);

    public List<OrderDto> getOrdersByUserId(Long id);

    Double sumTotalPrice();
}
