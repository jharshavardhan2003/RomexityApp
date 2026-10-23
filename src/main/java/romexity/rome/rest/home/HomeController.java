package romexity.rome.rest.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anonymous/")
public class HomeController {

    @GetMapping("/home")
    public String greet(){
        return "Hello Harsha vardhan welcome to the romexity";
    }
}
