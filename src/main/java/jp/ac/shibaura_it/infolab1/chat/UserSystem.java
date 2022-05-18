package jp.ac.shibaura_it.infolab1.chat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class UserSystem {
    @RequestMapping(value = "/login")
    public String login(){
        return "Login.html";
    }
}
