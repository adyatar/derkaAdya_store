package ma.store.inventoryservice.web;

import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.models.entities.Category;
import ma.store.inventoryservice.services.category.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories()
    {
        return categoryService.getAllCategories();
    }
    @GetMapping("/category/{id}")
    public Category getCetegoryById(@PathVariable Long id)
    {
        return categoryService.getCategoryByID(id);
    }

}
