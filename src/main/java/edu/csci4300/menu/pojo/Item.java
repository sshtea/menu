package edu.csci4300.menu.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;
    private String description;

    public Item(){

    }

    public Item(Long id, String name, int price, String description) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Item setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString(){
        String string = "";
        string += "{";
        string += "\"itemId\":" + id + ", ";
        string += "\"name\":" + "\"" + name + "\", ";
        string += "\"price\":" + price + ", ";
        string += "\"description\":" + "\"" + description +"\"";
        string += "}";
        return string;
    }
}
