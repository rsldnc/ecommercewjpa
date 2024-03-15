package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.Brand;
import com.turkcell.ecommercewdb.services.dtos.brand.requests.AddBrandRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    Brand brandFromAddRequest(AddBrandRequest request);
}
