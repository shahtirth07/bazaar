package com.delta.smallbaazaar.services;

import com.delta.smallbaazaar.datastores.productRepo;
import com.delta.smallbaazaar.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//tirth
@Service
public class productService {

    @Autowired
    productRepo repo;

    public void saveProduct(Product prod) {repo.save(prod);}

    public Product getProductId(String prod){
        return repo.findByProductid(prod);
    }
    public Product getProduct(String type){
        return repo.findByProductType(type);
    }
}
