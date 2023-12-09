package ma.store.inventoryservice.mappers;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.config.ConfigMapper;
import ma.store.inventoryservice.models.dto.ProductDto;
import ma.store.inventoryservice.models.entities.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
public class ProductMapper implements Mapper<Product, ProductDto>{
    private ModelMapper mapper;
    @Override
    public Product mapTo(ProductDto productDto) {
        return mapper.map(productDto , Product.class);
    }

    @Override
    public ProductDto mapFrom(Product product) {
        return mapper.map(product , ProductDto.class);
    }
}
