package idv.java_vuejs.java_test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}

