package ma.store.orderservice.repositories;

import ma.store.orderservice.models.Entitie.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
