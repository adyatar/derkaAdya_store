package ma.store.inventoryservice.services.category;


import ma.store.inventoryservice.models.entities.Category;
import ma.store.inventoryservice.models.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getAllCategories();

    Category getCategoryByID(Long id);

    void addCategory(Category category);

    void deleteCategory(Long id);

}
