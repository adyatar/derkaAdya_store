package ma.store.inventoryservice.services.product;


import ma.store.inventoryservice.models.dto.ProductDto;
import ma.store.inventoryservice.models.entities.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();

    ProductDto getProductByID(Long id);

    void addProduct(Product product);

    void deleteProduct(Long id);



}
