package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.CustomerType;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> getAll();

    void add(AddCustomerTypeRequest request);
}
