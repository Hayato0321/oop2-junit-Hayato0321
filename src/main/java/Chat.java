package jp.ac.shibaura_it.infolab1.chat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;
@Controller
public class Chat {
    private List<String> chats = new ArrayList(List.of("Ken: Hello", "Dai: Hello, too!"));

    @RequestMapping(value="/add")
    String addChat(@RequestParam("name") String name,
                   @RequestParam("chat") String chat) {
        chats.add(name +":" +chat);
        return "redirect:/hello";
    }
}

