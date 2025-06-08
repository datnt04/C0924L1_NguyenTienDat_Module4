package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import model.EmailSettings;

@Controller
public class SettingsController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/settings")
    public String showSettingsForm(Model model) {
        model.addAttribute("settings", new EmailSettings());
        return "settings";
    }

    @PostMapping("/settings")
    public String saveSettings(@ModelAttribute EmailSettings settings) {
        return "redirect:/settings";
    }
}