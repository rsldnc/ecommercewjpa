package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.services.dtos.customer.requests.AddCustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source = "customerTypeId", target = "customerType.id")
    @Mapping(source = "addressId", target = "address.id")
    Customer customerFromAddRequest(AddCustomerRequest request);
}
