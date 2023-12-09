package ma.store.inventoryservice.mappers.Impl;

import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.mappers.Mapper;
import ma.store.inventoryservice.models.dto.CategoryDto;
import ma.store.inventoryservice.models.entities.Category;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryMapper implements Mapper<Category, CategoryDto> {

    private ModelMapper mapper;
    @Override
    public Category mapTo(CategoryDto categoryDto) {
        return mapper.map(categoryDto,Category.class);
    }

    @Override
    public CategoryDto mapFrom(Category category) {
        return mapper.map(category, CategoryDto.class);
    }
}
