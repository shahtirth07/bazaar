package com.delta.smallbaazaar.controllers;

// By Hrucha
import com.delta.smallbaazaar.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class orderController {
    @PostMapping("/order")

    public String orderPlaced(@RequestParam String product, Model model){
        model.addAttribute("product",product);
        return "order.html";
    }
}
