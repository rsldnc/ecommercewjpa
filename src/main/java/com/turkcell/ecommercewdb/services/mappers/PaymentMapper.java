package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.Payment;
import com.turkcell.ecommercewdb.services.dtos.payment.requests.AddPaymentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentMapper {
    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    @Mapping(source = "paymentTypesId", target = "paymentTypes.id")
    Payment paymentFromAddRequest(AddPaymentRequest request);
}
