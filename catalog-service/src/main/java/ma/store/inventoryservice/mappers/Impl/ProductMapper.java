package ma.store.inventoryservice.mappers.Impl;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.config.ConfigMapper;
import ma.store.inventoryservice.mappers.Mapper;
import ma.store.inventoryservice.models.dto.ProductDto;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.repositories.CategoryRepository;
import ma.store.inventoryservice.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
public class ProductMapper implements Mapper<Product, ProductDto> {

    private final ModelMapper mapper;

    @Override
    public Product mapTo(ProductDto productDto) {
        return mapper.map(productDto , Product.class);
    }

    @Override
    public ProductDto mapFrom(Product product) {
        return mapper.map(product , ProductDto.class);
    }
}
