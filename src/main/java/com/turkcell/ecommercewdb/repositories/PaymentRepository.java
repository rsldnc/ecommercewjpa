package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
