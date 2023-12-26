package ma.store.cartservice.repositories;

import ma.store.cartservice.models.Entitie.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Long> {
    List<Cart> getCartsByUserId(Long id);
    Boolean existsByUserId(Long id);
}
