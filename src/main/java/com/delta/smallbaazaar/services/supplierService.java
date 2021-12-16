package com.delta.smallbaazaar.services;

import com.delta.smallbaazaar.datastores.supplierRepo;
import com.delta.smallbaazaar.entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class supplierService {

    @Autowired
    supplierRepo repo;


    public void saveSupplier(Supplier sup) {
        repo.save(sup);
    }

}
