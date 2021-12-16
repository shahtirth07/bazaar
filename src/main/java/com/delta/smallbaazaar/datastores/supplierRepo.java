package com.delta.smallbaazaar.datastores;

import com.delta.smallbaazaar.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface supplierRepo extends JpaRepository<Supplier, Integer> {
    public Supplier save(Supplier supplier);
    public Supplier findByUserid(String userid);
    public Supplier findByUseridAndPassword(String userid, String password);
}
