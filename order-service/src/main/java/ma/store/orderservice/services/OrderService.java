package ma.store.orderservice.services;


import ma.store.orderservice.models.dto.OrderDto;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderService {
    List<OrderDto> getAllOrders();

    OrderDto getOrderById(Long id);

    void addOrder(OrderDto orderDto);

    void deleteOrder(Long id);

<<<<<<< HEAD
    public List<OrderDto> getOrdersByUserId(Long id);

    Double sumTotalPrice();
=======
    List<OrderDto> getOrdersByUserId(Long id);

    Long getUserIdFromToken(Authentication authentication);

>>>>>>> b17c3d122d5b2a246e53d500edb950bbfc39c82e
}
