package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.services.dtos.order.requests.AddOrderRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "paymentId", target = "payment.id")
    @Mapping(source = "customerId", target = "customer.id")
    Order orderFromAddRequest(AddOrderRequest request);
}
