package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.repositories.PaymentTypeRepository;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.requests.AddPaymentTypeRequest;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.responses.PaymentTypesNameResponse;

import java.util.List;

public interface PaymentTypeService {
    List<PaymentType> getAll();

    List<PaymentTypesNameResponse> getPaymentTypes();

    void add(AddPaymentTypeRequest request);
}
