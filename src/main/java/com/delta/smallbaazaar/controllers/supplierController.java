package com.delta.smallbaazaar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class supplierController {
    @PostMapping("/supplier/add")
    public String saveCSV(@RequestParam String name, @RequestParam String type, @RequestParam int quantity, @RequestParam float price){
        System.out.println(name);

        return "product.html";
    }
}
