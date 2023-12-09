package ma.store.userservice;

import ma.store.userservice.models.entities.User;
import ma.store.userservice.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository){
        return args -> {
          User user = User.builder()
                  .name_user("Adyataaaaar")
                  .email("adyatar@gmail.com")
                  .password("pass")
                  .img_name("hhhhhhhhhhhh")
                  .role("Prime Minister")
                  .build();
          userRepository.save(user);
        };
    }

}
