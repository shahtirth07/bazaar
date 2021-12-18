package com.delta.smallbaazaar.controllers;

import com.delta.smallbaazaar.datastores.productRepo;
import com.delta.smallbaazaar.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class supplierController {

    @Autowired
    productRepo repo;

    @PostMapping("/supplier/add")
    public String saveProduct(@RequestParam String supplierid,@RequestParam String name, @RequestParam String type, @RequestParam int quantity, @RequestParam float price){
        Product product = new Product();
        product.setSupplierid(supplierid);
        product.setProductid(name);
        product.setType(type);
        product.setQuantity(quantity);
        product.setPrice(price);
        repo.save(product);
        return "product.html";
    }
}
