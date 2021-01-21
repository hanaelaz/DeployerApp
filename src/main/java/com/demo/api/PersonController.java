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
                return "Welcome this is home page, Please:"+"<br/><br/><br/>"+"- Add <B>/spring</B> in the path to see definition of Spring like <sup>(https://deployerapplication.herokuapp.com/spring)</sup>."+
                    "<br/><br/>- Add <B>/hello/{yourname}</B> in the path to view your message like <sup>(https://deployerapplication.herokuapp.com/hello/{name})</sup>.";
    }

    @GetMapping("/spring")
    public String test() {
        return "<center><strong>Hello World from <mark>Spring</mark></strong></center>"+"<br/><br/> "+ "<B>Definition: </B>The Spring Framework is an application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE platform. "
            +"<br/><br/><br/><center><small> To return to the home page replace <B>/spring</B> with <B>/</B> in the path</small></center>";
    }
    @GetMapping(path = "/hello/{name}")
    public String message(@PathVariable("name") String name) {
        return "<center>Hello  <B><mark>"+name+"</mark></B> <br/><br/>"+"Congratulations, you have successfully deployed your app! ! ! "+
            "<br/><br/><br/><small> To return to the home page replace <B>/hello/{yourname}</B> with <B>/</B> in the path</small></center>";
    }
    
}

