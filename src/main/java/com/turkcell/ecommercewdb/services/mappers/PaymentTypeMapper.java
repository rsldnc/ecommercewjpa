package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.requests.AddPaymentTypeRequest;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface PaymentTypeMapper {

    PaymentTypeMapper INSTANCE = Mappers.getMapper(PaymentTypeMapper.class);

    @Mapping(source = "", target = "")
    PaymentType paymentTypeFromAddRequest (AddPaymentTypeRequest request);

}
