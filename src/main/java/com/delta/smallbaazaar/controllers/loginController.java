package com.delta.smallbaazaar.controllers;

import com.delta.smallbaazaar.entities.Supplier;
import com.delta.smallbaazaar.services.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Autowired
    supplierService service;


    @PostMapping("/login")
    public String registerSupplier(@RequestParam String userid, String password, String type){
//        todo check the type and call findMethod on respective service
        return "ok";
    }
}
