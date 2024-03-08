package com.turkcell.ecommercewdb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name= "orders")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "status")
    private String status;

    @Column(name = "amount")
    private double amount;

    @ManyToOne()
    @JoinColumn(name="paymentid")
    private Payment payment;

    @ManyToOne()
    @JoinColumn(name="customerid")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    @JsonIgnore
    private List<OrderProduct> orderProductList;
}
