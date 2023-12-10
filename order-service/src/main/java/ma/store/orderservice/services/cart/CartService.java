package ma.store.orderservice.services.cart;


import ma.store.orderservice.models.entities.Cart;
import ma.store.orderservice.models.entities.MyCompositId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    List<Cart> getAllCart();

    Cart getCartByID(MyCompositId id);

    void addCart(Cart category);

    void deleteCart(MyCompositId id);

}
