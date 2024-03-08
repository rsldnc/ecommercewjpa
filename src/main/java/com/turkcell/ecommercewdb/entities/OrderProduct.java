package com.turkcell.ecommercewdb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name= "orders_products")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @ManyToOne()
    @JoinColumn(name = "orderid")
    private Order order;

    @ManyToOne()
    @JoinColumn(name = "productid")
    private Product product;
}
