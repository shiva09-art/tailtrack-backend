package com.tailtrack.controller;
import com.tailtrack.model.User;
import com.tailtrack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginUser) {
        try {
            User user = userRepository.findByEmail(loginUser.getEmail());
            if (user != null && user.getPassword().equals(loginUser.getPassword())) {
                // IMPORTANT: In a production app, password should be hashed with BCrypt
                // and a JWT token should be returned instead of the raw user entity.
                // We are returning the user without the password for safety.
                user.setPassword(null);
                return ResponseEntity.ok(user);
            }
            return ResponseEntity.status(401).body("{\"message\": \"Invalid email or password\"}");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("{\"message\": \"Internal server error\"}");
        }
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }
}
