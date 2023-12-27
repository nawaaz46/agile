package com.agile.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/landing")
    public String landing() {
        return "landing";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/api/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello from the backend!";
    }

    @GetMapping("/api/greet/{name}")
    @ResponseBody
    public String greetUser(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    
}