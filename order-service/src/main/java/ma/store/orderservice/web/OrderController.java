package ma.store.orderservice.web;

import lombok.RequiredArgsConstructor;

import ma.store.orderservice.models.dto.OrderDto;
import ma.store.orderservice.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> addOrder(@RequestBody OrderDto orderDto){
        try {
            orderService.addOrder(orderDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/order/{id}")
    public void deleteOrderById(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }


    @GetMapping("/user/{userId}")
    public ResponseEntity<List<OrderDto>> getOrdersByUserId(@PathVariable Long userId) {
        List<OrderDto> orders = orderService.getOrdersByUserId(userId);
        return ResponseEntity.ok(orders);
    }



}
