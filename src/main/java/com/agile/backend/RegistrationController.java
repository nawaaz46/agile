package com.agile.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;  // Autowire the repository

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        // Save the user data to the RDS MySQL database
        userRepository.save(user);  // Save the user using the repository

        // Redirect to the welcome page after successful registration
        return "redirect:/welcome";
    }

    @RequestMapping("/welcome")
    public String welcomePage() {
        // Return the name of the welcome HTML file (without the extension)
        return "welcome";
    }
}
