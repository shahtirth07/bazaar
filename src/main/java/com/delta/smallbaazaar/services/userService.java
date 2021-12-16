package com.delta.smallbaazaar.services;

import com.delta.smallbaazaar.datastores.supplierRepo;
import com.delta.smallbaazaar.datastores.userRepo;
import com.delta.smallbaazaar.entities.Supplier;
import com.delta.smallbaazaar.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    userRepo repo;

    public void saveUser(Supplier sup) {
        repo.save(sup);
    }

    public Object getUser(String userid, String password) {
        return repo.findByUseridAndPassword(userid, password);
    }
}
