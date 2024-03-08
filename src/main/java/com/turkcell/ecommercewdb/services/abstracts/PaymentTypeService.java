package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.repositories.PaymentTypeRepository;

import java.util.List;

public interface PaymentTypeService {
    List<PaymentType> getAll();
}
