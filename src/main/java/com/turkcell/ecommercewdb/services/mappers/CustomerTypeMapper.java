package com.turkcell.ecommercewdb.services.mappers;


import com.turkcell.ecommercewdb.entities.CustomerType;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface CustomerTypeMapper {

    CustomerTypeMapper INSTANCE = Mappers.getMapper(CustomerTypeMapper.class);

    @Mapping(source = "", target = "")
    CustomerType customerTypeFromAddRequest (AddCustomerTypeRequest request);
}
