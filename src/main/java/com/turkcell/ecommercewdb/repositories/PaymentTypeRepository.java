package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.responses.PaymentTypesNameResponse;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductStockResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentTypeRepository extends JpaRepository<PaymentType,Integer> {

    @Query("SELECT new com.turkcell.ecommercewdb.services.dtos.paymenttypes.responses.PaymentTypesNameResponse(p.type) FROM PaymentType p")
    List<PaymentTypesNameResponse> getPaymentTypeNames();




}
