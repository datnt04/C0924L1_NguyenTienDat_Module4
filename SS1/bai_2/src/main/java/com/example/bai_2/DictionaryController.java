package com.example.bai_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    private static final Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("computer", "máy tính");
        dictionary.put("apple", "quả táo");
        dictionary.put("i luv u", "tôi yêu bạn");
        dictionary.put("trash", "rác");
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word.toLowerCase());
        if (result != null) {
            model.addAttribute("word", word);
            model.addAttribute("result", result);
        } else {
            model.addAttribute("message", "Không tìm thấy từ.");
        }
        return "result";
    }
}
