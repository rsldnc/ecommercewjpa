package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.services.dtos.address.requests.AddAddressRequest;

import java.util.List;

public interface AddressService {
    List<Address> getAll();

    int getCount();

    void add(AddAddressRequest request);
}
