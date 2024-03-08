package com.turkcell.ecommercewdb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name= "paymenttypes")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentType {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="type")
    private String type;

    @OneToMany(mappedBy = "paymentTypes")
    @JsonIgnore
    private List<Payment> payments;
}
