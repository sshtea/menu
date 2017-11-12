package edu.csci4300.menu.pojo;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Purchase implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "purchase_item",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "item_id")}
    )
    private List<Item> items;

    @ManyToOne
    @JoinColumn(name  = "customer_id")
    private Customer customer;

    public Purchase() {
    }

    public Purchase(Long id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public Purchase setId(Long id) {
        this.id = id;
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public Purchase setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Purchase setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
}
