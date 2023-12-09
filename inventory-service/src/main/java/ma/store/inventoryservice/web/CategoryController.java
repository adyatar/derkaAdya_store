package ma.store.inventoryservice.web;

import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.mappers.Mapper;
import ma.store.inventoryservice.models.dto.CategoryDto;
import ma.store.inventoryservice.models.dto.ProductDto;
import ma.store.inventoryservice.models.entities.Category;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.services.category.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryService categoryService;
    private final Mapper<Category,CategoryDto> mapper;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getAllCategories()
    {
        List<Category> categoryList = categoryService.getAllCategories();
        return new ResponseEntity(categoryList, HttpStatus.OK);
    }
    @GetMapping("/category/{id}")
    public Category getCetegoryById(@PathVariable Long id)
    {
        return categoryService.getCategoryByID(id);
    }

    @PostMapping("/category")
    public ResponseEntity addProduct(@RequestBody CategoryDto categoryDto){
        Category category = mapper.mapTo(categoryDto);
        categoryService.addCategory(category);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable("id") Long id){
        categoryService.deleteCategory(id);
    }

}
