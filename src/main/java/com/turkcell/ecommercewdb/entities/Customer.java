package com.turkcell.ecommercewdb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;

import java.util.List;

@Table(name = "customers")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String password;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @ManyToOne()
    @JoinColumn(name = "customertypeid")
    private CustomerType customerType;

    //Check
    @ManyToOne()
    @JoinColumn(name="addressid")
    private Address address;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Order> orders;
}
