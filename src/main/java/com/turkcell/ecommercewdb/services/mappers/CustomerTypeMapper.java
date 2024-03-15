package com.turkcell.ecommercewdb.services.mappers;


import com.turkcell.ecommercewdb.entities.CustomerType;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface CustomerTypeMapper {

    CustomerTypeMapper INSTANCE = Mappers.getMapper(CustomerTypeMapper.class);

    CustomerType customerTypeFromAddRequest (AddCustomerTypeRequest request);
}
