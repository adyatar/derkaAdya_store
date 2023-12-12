package ma.store.cartservice.models.dto;

import lombok.Getter;
import lombok.Setter;
import ma.store.cartservice.models.Entitie.CartItem;

import java.util.Set;

@Getter@Setter
public class CartDto {

    private Long id;
    private Set<CartItem> cartItems;
    /*  @Transient
      private User user;*/
    private Long userId;

}
