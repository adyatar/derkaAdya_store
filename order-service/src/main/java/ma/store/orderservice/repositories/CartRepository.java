package ma.store.orderservice.repositories;


import ma.store.orderservice.models.entities.Cart;
import ma.store.orderservice.models.entities.MyCompositId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, MyCompositId> {
}
