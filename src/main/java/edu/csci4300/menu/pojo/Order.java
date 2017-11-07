package edu.csci4300.menu.pojo;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Order {
    private long id;
    private String name;
    private List<Item> items;

    public Order() {

    }

    public Order(long id, String name, List<Item> items) {
        super();
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public Order setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public Order setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString(){
        String string = "{";
        string += "\"id\":" + id + ",";
        string += "\"name\":" + "\"" + name + "\",";
        string += "\"items\":" + items.toString() + ",";
        string += "}";
        return string;
    }
}
