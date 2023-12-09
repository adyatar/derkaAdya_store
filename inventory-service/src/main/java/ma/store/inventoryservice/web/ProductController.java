package ma.store.inventoryservice.web;


import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.mappers.Mapper;
import ma.store.inventoryservice.models.dto.CategoryDto;
import ma.store.inventoryservice.models.dto.ProductDto;
import ma.store.inventoryservice.models.entities.Category;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.services.product.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private ProductService productService;
    private final Mapper<Product, ProductDto> mapper;


    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Long id)
    {
        return productService.getProductByID(id);
    }

    @PostMapping("/product")
    public ResponseEntity addProduct(@RequestBody ProductDto productDto){
        Product product = mapper.mapTo(productDto);
        productService.addProduct(product);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }

}
