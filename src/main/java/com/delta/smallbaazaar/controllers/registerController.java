package com.delta.smallbaazaar.controllers;

import com.delta.smallbaazaar.entities.Supplier;
import com.delta.smallbaazaar.services.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class registerController {

    @Autowired
    supplierService service;

    @PostMapping("/register/supplier")
    public String registerSupplier(@ModelAttribute Supplier sup){
        service.saveSupplier(sup);
        return "ok";
    }
}
