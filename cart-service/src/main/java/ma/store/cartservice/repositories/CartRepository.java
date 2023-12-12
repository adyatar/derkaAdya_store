package ma.store.cartservice.repositories;

import ma.store.cartservice.models.Entitie.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
