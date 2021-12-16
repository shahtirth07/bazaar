package com.delta.smallbaazaar.entities;

import javax.persistence.*;

@Entity(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String userid;

    @Column
    String password;

    @Column
    String name;

    @Column
    String gst;

    @Column
    String area;
    public Supplier(int id, String userid, String password, String name, String gst, String area) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.gst = gst;
        this.area = area;
    }

    public Supplier() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
