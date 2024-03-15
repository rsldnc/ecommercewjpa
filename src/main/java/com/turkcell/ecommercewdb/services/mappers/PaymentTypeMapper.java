package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.requests.AddPaymentTypeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PaymentTypeMapper {

    PaymentTypeMapper INSTANCE = Mappers.getMapper(PaymentTypeMapper.class);

    @Mapping(target = "payments", ignore = true) // @OneToMany ilişkisini ignore et
    PaymentType paymentTypeFromAddRequest(AddPaymentTypeRequest request);
}