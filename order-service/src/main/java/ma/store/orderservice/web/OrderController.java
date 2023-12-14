package ma.store.orderservice.web;

import lombok.RequiredArgsConstructor;

import ma.store.orderservice.models.dto.OrderDto;
import ma.store.orderservice.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@ControllerAdvice
public class OrderController {

    private final OrderService orderService;


    @GetMapping("/orders")
    public List<OrderDto> getAllCarts()
    {
        List<OrderDto> orders = orderService.getAllOrders();
        return orders;
    }

    @GetMapping("/order/{id}")
    public OrderDto getOrderById(@PathVariable Long id)
    {
        OrderDto orderDto = orderService.getOrderById(id);
        return orderDto;
    }


    @PostMapping("/order")
    public void addOrder(@RequestBody OrderDto orderDto){
        orderService.addOrder(orderDto);
    }

    @DeleteMapping("/order/{id}")
    public void deleteOrderById(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }


}
