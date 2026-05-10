package us.inest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}") // Maps the root URL to this method
    public ResponseEntity<String> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(String.valueOf(id));
    }
}
