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
        return "Hello World from Spring";
    }
    @GetMapping(path = "/bonjour/{name}")
    public String message(@PathVariable("name") String name) {
        return "Bonjour : "+name;
    }
    
}

