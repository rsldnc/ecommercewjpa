package com.turkcell.ecommercewdb.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name= "customertypes")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerType {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="type")
    private String type;

    @OneToMany(mappedBy = "customerType")
    @JsonIgnore
    private List<Customer> customers;
}
