package ma.store.orderservice.web;

import lombok.RequiredArgsConstructor;

import ma.store.orderservice.services.order.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final OrderService orderService;


}
