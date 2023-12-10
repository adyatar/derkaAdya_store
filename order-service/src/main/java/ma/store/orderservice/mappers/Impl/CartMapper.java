package ma.store.orderservice.mappers.Impl;

import lombok.RequiredArgsConstructor;

import ma.store.orderservice.mappers.Mapper;
import ma.store.orderservice.models.dto.CartDto;
import ma.store.orderservice.models.entities.Cart;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CartMapper implements Mapper<Cart, CartDto> {

    private final ModelMapper mapper;
    @Override
    public Cart mapTo(CartDto cartDto) {
        return mapper.map(cartDto,Cart.class);
    }

    @Override
    public CartDto mapFrom(Cart cart) {
        return mapper.map(cart, CartDto.class);
    }
}
