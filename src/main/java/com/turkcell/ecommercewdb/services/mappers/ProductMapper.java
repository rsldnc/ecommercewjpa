package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.services.dtos.product.requests.AddProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "brandId", target = "brand.id")
    Product productFromAddRequest(AddProductRequest request);
}
