package ma.store.orderservice.services.order;



import ma.store.orderservice.models.entities.Ordere;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    List<Ordere> getAllOrders();

    Ordere getOrderByID(Long id);

    void addOrder(Ordere order);

    void deleteOrder(Long id);



}
