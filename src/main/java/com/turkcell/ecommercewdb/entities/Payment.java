package com.turkcell.ecommercewdb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Table(name= "payments")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="status")
    private String status;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne()
    @JoinColumn(name = "paymenttypeid")
    private PaymentType paymentTypes;

    @OneToMany(mappedBy = "payment")
    @JsonIgnore
    private List<Order> orders;
}
