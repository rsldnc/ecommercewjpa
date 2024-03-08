package com.turkcell.ecommercewdb.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name= "addresses")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="city")
    private String city;

    @Column(name="district")
    private String district;

    @Column(name="street")
    private String street;

    @Column(name="building")
    private String building;

    @Column(name="postcode")
    private String postCode;

    @Column(name="addressdetails")
    private String addressDetails;

    //Check
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private List<Customer> customers;
}
