package pl.sda.finalproject.travelagency.module.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;


    @GetMapping("/index")
    public String menu(Model model) {
        model.addAttribute("menu",menuService.getMenu());

        return "index.html";
    }

}
