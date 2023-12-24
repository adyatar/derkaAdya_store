package ma.store.inventoryservice.services.product;

import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.mappers.Mapper;
import ma.store.inventoryservice.models.dto.ProductDto;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.repositories.CategoryRepository;
import ma.store.inventoryservice.repositories.ProductRepository;

import ma.store.inventoryservice.services.category.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final Mapper<Product, ProductDto> mapper;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductDto getProductByID(Long id) {
        Product product=  productRepository.findById(id).orElseThrow();
        ProductDto productDto=mapper.mapFrom(product);
        return productDto;
    }

    @Override
    public void addProduct(Product product) {
        product.setCategory(categoryService.getCategoryByID(product.getId_cat()));
      productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        if(!productRepository.existsById(id)) {
            throw new RuntimeException("Product Not Found!!!");
        }
        productRepository.deleteById(id);

    }

    @Override
    public List<Product> getProductsByCategoryId(Long id) {
        return productRepository.findByCategoryIdCat(id);
    }
}
