package ie.atu.helloworldspringbootapplication2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name;
        //test
    }
    @GetMapping("/details")
    public String details(@RequestParam String name,@RequestParam int age){
        return "Name: " + name + " Age: " + age;
    }
}
