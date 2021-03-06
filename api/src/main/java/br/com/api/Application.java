package br.com.api;

import br.com.api.model.User;
import br.com.api.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService) {
        return args -> {
            User user = new User("Teste", "teste", new BCryptPasswordEncoder().encode("teste"), "teste@teste.com", "ROLE_TESTE");
            user.setId("1");
            System.out.println("User teste created: " + userService.save(user));
        };
    }

}
