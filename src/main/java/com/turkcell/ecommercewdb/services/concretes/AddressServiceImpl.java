package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.core.exception.types.BusinessException;
import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.repositories.AddressRepository;
import com.turkcell.ecommercewdb.services.abstracts.AddressService;
import com.turkcell.ecommercewdb.services.dtos.address.requests.AddAddressRequest;
import com.turkcell.ecommercewdb.services.mappers.AddressMapper;
import com.turkcell.ecommercewdb.services.mappers.ProductMapper;
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

    @Override
    public void add(AddAddressRequest request) {
        Address address = AddressMapper.INSTANCE.addressFromAddRequest(request);
        addressRepository.save(address);
    }

    private boolean isSameAddress(AddAddressRequest newAddress, Address existingAddress) {
        return newAddress.getCity().equals(existingAddress.getCity()) &&
                newAddress.getDistrict().equals(existingAddress.getDistrict()) &&
                newAddress.getStreet().equals(existingAddress.getStreet()) &&
                newAddress.getBuilding().equals(existingAddress.getBuilding()) &&
                newAddress.getPostCode().equals(existingAddress.getPostCode()) &&
                newAddress.getAddressDetails().equals(existingAddress.getAddressDetails());
    }
}
