package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAll();

    int getCount();
}
