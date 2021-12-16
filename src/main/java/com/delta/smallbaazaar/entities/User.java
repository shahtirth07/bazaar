package com.delta.smallbaazaar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class User {
    @Id
    @Column
    String userid;

    @Column
    String password;

    @Column
    String mobno;

    public User() {
    }

    public User(String userid, String password, String mobno) {
        this.userid = userid;
        this.password = password;
        this.mobno = mobno;
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

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }
}
