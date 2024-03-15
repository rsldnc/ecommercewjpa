package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.OrderProduct;
import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.services.dtos.orderProduct.requests.AddOrderProductRequest;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.requests.AddPaymentTypeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderProductMapper {


    OrderProductMapper INSTANCE = Mappers.getMapper(OrderProductMapper.class);

    @Mapping(source = "orderId", target = "order.id")
    @Mapping(source = "productId", target = "product.id")
    OrderProduct orderProductFromAddRequest (AddOrderProductRequest request);

}
