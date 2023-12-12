package ma.store.cartservice.repositories;

import ma.store.cartservice.models.Entitie.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
}
