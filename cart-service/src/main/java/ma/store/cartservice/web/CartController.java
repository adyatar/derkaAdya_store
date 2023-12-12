package ma.store.cartservice.web;

import lombok.RequiredArgsConstructor;
import ma.store.cartservice.models.dto.CartDto;
import ma.store.cartservice.services.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;


    @GetMapping("/carts")
    public List<CartDto> getAllCarts()
    {
        List<CartDto> cartList = cartService.getAllCarts();
        return cartList;
    }

    @GetMapping("/cart/{id}")
    public CartDto getCartById(@PathVariable Long id)
    {
        CartDto cartDto = cartService.getCartById(id);
        return cartDto;
    }

    @PostMapping("/cart")
    public void addCart(@RequestBody CartDto cartDto){
        cartService.addCart(cartDto);
    }

    @DeleteMapping("/cart/{id}")
    public void deleteCartById(@PathVariable("id") Long id){
        cartService.deleteCart(id);
    }


}
