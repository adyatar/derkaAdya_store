package ma.store.inventoryservice;

import ma.store.inventoryservice.config.keysConfig;
import ma.store.inventoryservice.models.entities.Category;
import ma.store.inventoryservice.models.entities.Product;
import ma.store.inventoryservice.repositories.CategoryRepository;
import ma.store.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(keysConfig.class)
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CategoryRepository categoryRepository, ProductRepository productRepository)
	{
		return args -> {
			Category phoneCat = Category.builder()
					.name_cat("Phone")
					.img_name("assets/images/apple.png")
					.build();

			Category watchCat = Category.builder()
					.name_cat("Watch")
					.img_name("assets/images/watch.png")
					.build();
			Category laptop = Category.builder()
					.name_cat("Laptop")
					.img_name("assets/images/watch.png")
					.build();
			Category headPhones = Category.builder()
					.name_cat("HeadPhones")
					.img_name("assets/images/watch.png")
					.build();

			// Save categories
			categoryRepository.save(phoneCat);
			categoryRepository.save(watchCat);
			categoryRepository.save(laptop);
			categoryRepository.save(headPhones);

			// Create products and associate them with categories using Lombok Builder
			Product iphone = Product.builder()
					.name_prod("IPhone 15 Pro Max")
					.desc_prod("IPhone 15 Pro Max with 512 GB")
					.price(1099.00)
					.qte_prod(50)
					.image_prod("apple.png")
					.category(phoneCat)
					.build();

			Product watch = Product.builder()
					.name_prod("Apple Watch Serie 9")
					.desc_prod("Latest Apple Watch model")
					.price(300.00)
					.qte_prod(50)
					.image_prod("huawei.png")
					.category(watchCat)
					.build();

			Product macbook = Product.builder()
					.name_prod("Macbook Pro 2021")
					.desc_prod("Latest Macbook Pro model")
					.price(3000.00)
					.qte_prod(50)
					.image_prod("beats.jpg")
					.category(laptop)
					.build();

			Product airpods = Product.builder()
					.name_prod("Airpods Pro")
					.desc_prod("Latest Airpods model")
					.price(300.00)
					.qte_prod(50)
					.image_prod("power.png")
					.category(headPhones)
					.build();

			Product airpodsMax = Product.builder()
					.name_prod("Airpods Max")
					.desc_prod("Latest Airpods Max model")
					.price(300.00)
					.qte_prod(50)
					.image_prod("power.png")
					.category(headPhones)
					.build();

			// Save products
			productRepository.save(watch);
			productRepository.save(iphone);
            productRepository.save(macbook);
            productRepository.save(airpods);
            productRepository.save(airpodsMax);
		};
	}


}
