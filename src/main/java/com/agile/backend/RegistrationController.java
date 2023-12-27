package com.agile.backend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        // Check if the username already exists
        if (userRepository.existsByUsername(user.getUsername())) {
            return "Username already exists. Please choose a different one.";
        }

        // Save the user data to the RDS MySQL database
        userRepository.save(user);

        return "Registration successful!";
    }
}
