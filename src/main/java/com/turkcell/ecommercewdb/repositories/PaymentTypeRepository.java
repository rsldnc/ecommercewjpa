package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType,Integer> {
}
