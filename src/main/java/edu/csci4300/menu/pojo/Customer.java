package edu.csci4300.menu.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Customer implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "customer")
    private List<Purchase> purchases;

    public Customer(){

    }

    public Customer(Long id, String name, List<Purchase> purchases) {
        this.id = id;
        this.name = name;
        this.purchases = purchases;
    }

    public Long getId() {
        return id;
    }

    public Customer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public Customer setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
        return this;
    }
}
