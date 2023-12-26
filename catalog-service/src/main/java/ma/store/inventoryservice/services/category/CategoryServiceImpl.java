package ma.store.inventoryservice.services.category;

import lombok.RequiredArgsConstructor;
import ma.store.inventoryservice.models.entities.Category;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.repositories.CategoryRepository;
import ma.store.inventoryservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
       return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryByID(Long id) {
        return categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Category Not Found!!!"));
    }

    @Override
    public void addCategory(Category category) {
       categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        if(!categoryRepository.existsById(id)) {
            throw new RuntimeException("Category Not Found!!!");
        }
            categoryRepository.deleteById(id);

    }
}