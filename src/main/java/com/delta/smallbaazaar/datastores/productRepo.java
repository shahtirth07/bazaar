package com.delta.smallbaazaar.datastores;

import com.delta.smallbaazaar.entities.Product;
import com.delta.smallbaazaar.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<Product,String> {
    public Product save(Product product);
    public Product findByProductid(String productid);
    public Product findByProductType(String type);

}
