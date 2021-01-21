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
                return "Welcome this is home page"+"\n\n"+"please add /hello/{yourname} in the path \n\n or add /spring to see definition of Spring";
    }

    @GetMapping("/spring")
    public String test() {
        return "Hello World from Spring"+"\n\n "+ "The Spring Framework is an application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE platform. ";
    }
    @GetMapping(path = "/hello/{name}")
    public String message(@PathVariable("name") String name) {
        return "Hello : "+name+" \n\n"+"Well you have successfully deployed your app";
    }
    
}

