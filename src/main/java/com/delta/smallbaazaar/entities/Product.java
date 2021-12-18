package com.delta.smallbaazaar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product")
public class Product {
    @Id
    @Column
    String productid;

    @Column
    String supplierid;

    @Column
    int quantity;

    @Column
    String type;

    @Column
    float price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product() {
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(String productid, String supplierid, int quantity, String type, float price) {
        this.productid = productid;
        this.supplierid = supplierid;
        this.quantity = quantity;
        this.type = type;
        this.price = price;
    }
}
