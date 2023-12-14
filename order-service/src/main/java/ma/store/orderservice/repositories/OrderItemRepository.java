package ma.store.orderservice.repositories;


import ma.store.orderservice.models.Entitie.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
