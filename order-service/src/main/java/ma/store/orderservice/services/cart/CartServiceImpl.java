package ma.store.orderservice.services.cart;

import lombok.RequiredArgsConstructor;

import ma.store.orderservice.models.entities.Cart;
import ma.store.orderservice.models.entities.MyCompositId;
import ma.store.orderservice.repositories.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public List<Cart> getAllCart() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getCartByID(MyCompositId id) {
        return cartRepository.findById(id).orElseThrow();
    }

    @Override
    public void addCart(Cart category) {
      cartRepository.save(category);
    }

    @Override
    public void deleteCart(MyCompositId id) {
      cartRepository.deleteById(id);
    }
}
