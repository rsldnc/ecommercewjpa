package com.turkcell.ecommercewdb.services.mappers;

import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.services.dtos.address.requests.AddAddressRequest;
import com.turkcell.ecommercewdb.services.dtos.category.requests.AddCategoryRequest;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "", target = "")
    Category categoryFromAddRequest (AddCategoryRequest request);
}
