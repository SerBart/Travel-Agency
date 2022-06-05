package pl.sda.finalproject.travelagency.module.register;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterMapping {

    @GetMapping("/login")
    public String list() {
        return "/registration/login.html";
    }
    @PostMapping("/login")
    public String some(){
        return "/index.html";
    }

}

