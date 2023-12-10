package ma.store.orderservice.web;


import lombok.RequiredArgsConstructor;
import ma.store.orderservice.services.order.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
}
