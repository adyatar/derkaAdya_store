package ma.store.inventoryservice.services.product;

import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.repositories.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductByID(Long id) {
        return  productRepository.findById(id).orElseThrow();
    }

    @Override
    public void addProduct(Product product) {

      productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        if(!productRepository.existsById(id)) {
            throw new RuntimeException("Product Not Found!!!");
        }
        productRepository.deleteById(id);

    }
}
