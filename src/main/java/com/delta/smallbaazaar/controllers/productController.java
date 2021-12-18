package com.delta.smallbaazaar.controllers;

import com.delta.smallbaazaar.datastores.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class productController {

    @Autowired
    productRepo repo;

    @GetMapping("/product/{type}/{id}")
    public String displayProductForm(@PathVariable String type, @PathVariable String id, Model model) throws Exception {
        model.addAttribute("product",repo.findByProductid(id));
        return "cart.html";
    }
}
