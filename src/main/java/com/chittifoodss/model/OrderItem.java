package com.chittifoodss.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String foodName;
    private int quantity;
    private int price;

    public OrderItem() {}

    public OrderItem(String foodName, int quantity, int price) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() { return id; }

    public String getFoodName() { return foodName; }

    public int getQuantity() { return quantity; }

    public int getPrice() { return price; }

    public void setFoodName(String foodName) { this.foodName = foodName; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void setPrice(int price) { this.price = price; }
}