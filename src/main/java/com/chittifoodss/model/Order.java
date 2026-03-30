package com.chittifoodss.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "app_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private int totalPrice;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;

    public Order() {}

    public Order(String customerName, int totalPrice, List<OrderItem> items) {
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.items = items;
    }

    public Long getId() { return id; }

    public String getCustomerName() { return customerName; }

    public int getTotalPrice() { return totalPrice; }

    public List<OrderItem> getItems() { return items; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public void setTotalPrice(int totalPrice) { this.totalPrice = totalPrice; }

    public void setItems(List<OrderItem> items) { this.items = items; }
}