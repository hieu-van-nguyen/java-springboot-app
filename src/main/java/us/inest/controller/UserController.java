package us.inest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/") // Maps the root URL to this method
    public String hello() {
        return "Hello, World!";
    }
}
