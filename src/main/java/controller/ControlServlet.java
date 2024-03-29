package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlServlet {
    @GetMapping("/greeting")
    public String home(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "home";
    }
}
