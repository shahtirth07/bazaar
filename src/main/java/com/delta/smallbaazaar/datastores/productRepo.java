package com.delta.smallbaazaar.datastores;

//By Hrucha Wankhade

import com.delta.smallbaazaar.entities.Product;
import com.delta.smallbaazaar.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepo extends JpaRepository<Product,String> {
    public Product save(Product product);
    @Query(value = "select * from product", nativeQuery = true)
    public List<Product> findAll();
    public Product findByProductid(String productid);
    public Product findByType(String type);

}
