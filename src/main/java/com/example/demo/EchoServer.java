package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EchoServer {
    
    // Display the registration form
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registration"; // This will look for registration.html in the templates folder
    }

    // Handle form submission
    @PostMapping("/register")
    public String handleRegistration(@RequestParam("name") String name, 
                                      @RequestParam("email") String email,
                                      @RequestParam("password") String password, 
                                      Model model) {
        // Here you can process or save the data (for now, we just display it)
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        
        // Show confirmation page
        return "registrationSuccess"; // This will display a success page
    }

    // Existing echo endpoint
    @GetMapping("/echo/{name}")
    public String echo(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
