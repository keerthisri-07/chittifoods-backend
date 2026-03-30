package com.chittifoodss.model;

import jakarta.persistence.*;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
    private String category;

    public Food() {}

    public Food(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public int getPrice() { return price; }

    public String getCategory() { return category; }

    public void setName(String name) { this.name = name; }

    public void setPrice(int price) { this.price = price; }

    public void setCategory(String category) { this.category = category; }
}
