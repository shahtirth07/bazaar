package com.delta.smallbaazaar.controllers;

import com.delta.smallbaazaar.datastores.productRepo;
import com.delta.smallbaazaar.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class homeController {

    @Autowired
    productRepo repo;


    @GetMapping("/")
    public String displayProducts(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        System.out.println(products.get(0).getProductid());
        return "index.html";
    }
}
