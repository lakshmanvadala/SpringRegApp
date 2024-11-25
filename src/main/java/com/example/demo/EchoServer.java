package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EchoServer {
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
public String showRegistrationForm() {
    return "registration";
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

   
}
