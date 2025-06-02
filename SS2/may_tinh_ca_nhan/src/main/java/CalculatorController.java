import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class CalculatorController {

    @PostMapping("/calculate")
    public String calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            @RequestParam("operator") String operator,
                            Model model) {
        double result = 0;
        String operation = "";

        switch (operator) {
            case "add":
                result = num1 + num2;
                operation = "Addition";
                break;
            case "sub":
                result = num1 - num2;
                operation = "Subtraction";
                break;
            case "mul":
                result = num1 * num2;
                operation = "Multiplication";
                break;
            case "div":
                if (num2 == 0) {
                    model.addAttribute("message", "Cannot divide by zero!");
                    return "index";
                }
                result = num1 / num2;
                operation = "Division";
                break;
        }

        model.addAttribute("operation", operation);
        model.addAttribute("result", result);
        return "index";
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }
}