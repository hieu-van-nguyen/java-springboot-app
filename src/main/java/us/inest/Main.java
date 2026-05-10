package us.inest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication // Marks this as a Spring Boot app
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}