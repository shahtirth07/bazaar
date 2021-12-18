package com.delta.smallbaazaar.datastores;

import com.delta.smallbaazaar.entities.Product;
import com.delta.smallbaazaar.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,String> {
    public Product save(Product product);
    public Product findByProductidAndSupplierid(String productid,String supplierid);
    public Product findByType(String type);

}
