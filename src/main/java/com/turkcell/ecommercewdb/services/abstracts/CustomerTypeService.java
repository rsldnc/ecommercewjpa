package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> getAll();
}
