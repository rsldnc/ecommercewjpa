package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.repositories.AddressRepository;
import com.turkcell.ecommercewdb.services.abstracts.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public int getCount() {
        return addressRepository.getAddressCount();
    }


}
