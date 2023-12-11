package ma.store.orderservice;

import ma.store.orderservice.models.entities.Ordere;
import ma.store.orderservice.repositories.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);  }
    @Bean
    CommandLineRunner init(OrderRepository orderRepository) {
        return args -> {
            // Create and save the first Order
            Ordere order1 = Ordere.builder()
                    .total(100.00)
                    .id_user(1L)
                    .idproducts(Arrays.asList(1L, 2L, 3L))
                    .build();
            orderRepository.save(order1);

            // Create and save the second Order
            Ordere order2 = Ordere.builder()
                    .total(200.00)
                    .id_user(2L)
                    .idproducts(Arrays.asList(4L, 5L))
                    .build();
            orderRepository.save(order2);
        };

        }


}
