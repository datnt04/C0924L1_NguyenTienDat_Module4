package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.IProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("products", productService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("product", new Product());
        return "form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "form";
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable int id, @ModelAttribute Product product) {
        productService.update(id, product);
        return "redirect:/products";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/products";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "detail";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model) {
        model.addAttribute("products", productService.searchByName(name));
        return "list";
    }
}
