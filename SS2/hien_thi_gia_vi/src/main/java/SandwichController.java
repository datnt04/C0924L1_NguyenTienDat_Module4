package java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class SandwichController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiments, Model model) {
        model.addAttribute("selectedCondiments", condiments);
        return "result";
    }
}

