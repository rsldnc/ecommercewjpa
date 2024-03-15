package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.entities.Brand;
import com.turkcell.ecommercewdb.services.dtos.address.requests.AddAddressRequest;
import com.turkcell.ecommercewdb.services.dtos.brand.requests.AddBrandRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address addressFromAddRequest (AddAddressRequest request);
}
