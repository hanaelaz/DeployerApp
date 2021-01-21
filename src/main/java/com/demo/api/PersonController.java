package com.demo.api;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController

public class PersonController {
    @GetMapping()
    public String home() {
                return "this is home page";
    }

    @GetMapping("/spring")
    public String test() {
        return "Hello World from Spring"+" "+ "The Spring Framework is an application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE platform. ";
    }
    @GetMapping(path = "/bonjour/{name}")
    public String message(@PathVariable("name") String name) {
        return "Bonjour : "+name;
    }
    
}

