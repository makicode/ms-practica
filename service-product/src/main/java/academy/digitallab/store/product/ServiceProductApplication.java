package academy.digitallab.store.product;

import academy.digitallab.store.product.entity.Category;
import academy.digitallab.store.product.entity.Product;
import academy.digitallab.store.product.repository.CategoryRepository;
import academy.digitallab.store.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

//@EnableJpaRepositories("academy.digitallab.store.product.repository")
@SpringBootApplication
public class ServiceProductApplication {

	public static void main(String[] args) {SpringApplication.run(ServiceProductApplication.class, args);}

//	@Bean
//	CommandLineRunner start(CategoryRepository categoryRepository, ProductRepository productRepository) {
//		return args -> {
//
//			Category category = Category.builder()
//					.id(Long.parseLong("1"))
//					.name("shoes")
//					.build();
//			categoryRepository.save(category);
//			category = Category.builder()
//					.id(Long.parseLong("2"))
//					.name("books")
//					.build();
//			categoryRepository.save(category);
//			category = Category.builder()
//					.id(Long.parseLong("3"))
//					.name("electronics")
//					.build();
//			categoryRepository.save(category);
//
//			Product product01 = Product.builder()
//					.id(Long.parseLong("1"))
//					.name("adidas Cloudfoam Ultimate")
//					.category(Category.builder().id(1L).build())
//					.description("Walk in the air in the black / black CLOUDFOAM ULTIMATE running shoe from ADIDAS")
//					.stock(Double.parseDouble("5"))
//					.price(Double.parseDouble("178.89"))
//					.status("CREATED")
//					.createAt(new Date())
//					.build();
//			productRepository.save(product01);
//			product01 = Product.builder()
//					.id(Long.parseLong("2"))
//					.name("aunder armour Men ''s Micro G Assert – 7")
//					.category(Category.builder().id(1L).build())
//					.description("under armour Men ''Lightweight mesh upper delivers complete breathability . Durable leather overlays for stability")
//					.stock(Double.parseDouble("4"))
//					.price(Double.parseDouble("12.5"))
//					.status("CREATED")
//					.createAt(new Date())
//					.build();
//			productRepository.save(product01);
//			product01 = Product.builder()
//					.id(Long.parseLong("3"))
//					.name("Spring Boot in Action")
//					.category(Category.builder().id(2L).build())
//					.description("under armour Men '' Craig Walls is a software developer at Pivotal and is the author of Spring in Action")
//					.stock(Double.parseDouble("12"))
//					.price(Double.parseDouble("40.06"))
//					.status("CREATED")
//					.createAt(new Date())
//					.build();
//			productRepository.save(product01);
//
//		};
//	}


}
