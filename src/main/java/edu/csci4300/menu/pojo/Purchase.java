package edu.csci4300.menu.pojo;


import javax.persistence.*;
import java.io.Serializable;
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
            inverseJoinColumns = {@JoinColumn(name = "itemid")}
    )
    private Set<Item> items;

    public Purchase() {
    }

    public Purchase(Long id, Set<Item> items) {
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

    public Set<Item> getItems() {
        return items;
    }

    public Purchase setItems(Set<Item> items) {
        this.items = items;
        return this;
    }
}
