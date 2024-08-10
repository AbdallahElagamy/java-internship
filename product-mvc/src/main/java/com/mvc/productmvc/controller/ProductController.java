package com.mvc.productmvc.controller;

import com.mvc.productmvc.model.Product;
import com.mvc.productmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public String products(Model model,@RequestParam(defaultValue = "1") int page,
                           @RequestParam(defaultValue = "10") int size) {
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute("product") Product product) {
        product.setId(0);
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String updateProduct(@PathVariable Integer id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }

}
