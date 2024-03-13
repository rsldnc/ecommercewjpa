package com.turkcell.ecommercewdb.services.dtos.brand.requests;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddBrandRequest {
    @Size(min = 3, max = 50)
    private String name;
}
