package ma.store.inventoryservice;

import lombok.Builder;
import ma.store.inventoryservice.models.entities.Category;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.repositories.CategoryRepository;
import ma.store.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CategoryRepository categoryRepository, ProductRepository productRepository)
	{
		return args -> {
			Category category1 = Category.builder()
					.name_cat("TV")
					.img_name("tv_image.jpg")
					.build();

			Category category2 = Category.builder()
					.name_cat("Phone")
					.img_name("phone_image.jpg")
					.build();

			// Save categories
			categoryRepository.save(category1);
			categoryRepository.save(category2);

			// Create products and associate them with categories using Lombok Builder
			Product product1 = Product.builder()
					.name_prod("Smart TV")
					.desc_prod("4K Ultra HD Smart TV")
					.price(1200.00)
					.qte_prod(50)
					.category(category1)
					.build();

			Product product2 = Product.builder()
					.name_prod("Smartphone")
					.desc_prod("Latest model smartphone")
					.price(800.00)
					.qte_prod(100)
					.category(category2)
					.build();

			// Save products
			productRepository.save(product1);
			productRepository.save(product2);
		};
	}


}
