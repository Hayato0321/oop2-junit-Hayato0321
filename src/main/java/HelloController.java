import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;
@Controller
public class HelloController {
    @RequestMapping("/helloController")
    public String hello(Model model) {
        model.addAttribute("time", LocalDateTime.now());
        return "hello";
    }
}

