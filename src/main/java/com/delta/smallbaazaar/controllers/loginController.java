package com.delta.smallbaazaar.controllers;

import com.delta.smallbaazaar.entities.Supplier;
import com.delta.smallbaazaar.entities.User;
import com.delta.smallbaazaar.services.supplierService;
import com.delta.smallbaazaar.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Autowired
    supplierService serviceS;
    userService serviceU;

    @PostMapping("/login")
    public String registerSupplier(@RequestParam String userid, String password, String type){
        System.out.println(userid+" : "+password);
        System.out.println("im here");
        if (userid == null|| password == null || type == null) return "please enter all the details";
        switch (type){
            case "supplier":
                Supplier s = serviceS.getSupplier(userid, password);
                if (s != null)
                    return "ok";
                else return "Error invalid user";

            case "consumer":
                User user = (User) serviceU.getUser(userid, password);
                if (user != null)
                    return "ok";
                else return "Error invalid user";

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
