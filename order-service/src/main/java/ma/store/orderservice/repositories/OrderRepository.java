package ma.store.orderservice.repositories;

import ma.store.orderservice.models.Entitie.Order;
import ma.store.orderservice.models.dto.OrderDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUserId(Long id);
}
