package com.delta.smallbaazaar.controllers;

import com.delta.smallbaazaar.entities.Supplier;
import com.delta.smallbaazaar.entities.User;
import com.delta.smallbaazaar.services.supplierService;
import com.delta.smallbaazaar.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class loginController {
    @Autowired
    supplierService serviceS;

    @Autowired
    userService serviceU;

    @PostMapping("/login")
    public Object registerSupplier(@RequestParam String userid, @RequestParam String password, @RequestParam String type, Model model, HttpServletResponse res) throws IOException {
        if (userid == null|| password == null || type == null) return "please enter all the details";
        switch (type){
            case "supplier":
                Supplier s = serviceS.getSupplier(userid, password);
                if (s != null)
                    return "product.html";
                else {
                    model.addAttribute("msg", "You are not a registered supplier");
                    return "error.html";
                }

            case "consumer":
                User user = serviceU.getUser(userid, password);
                if (user != null)
                    return user.getUserid();
                else {
                    model.addAttribute("msg", "Error invalid user");
                    return "error.html";
                }
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
