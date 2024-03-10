package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.services.abstracts.AddressService;
import com.turkcell.ecommercewdb.services.dtos.address.requests.AddAddressRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
@AllArgsConstructor
public class AddressesController {
    private final AddressService addressService;

    @GetMapping
    public List<Address> getAll()
    {
        return addressService.getAll();
    }

    @GetMapping("addressCount")
    public int addressCount()
    {
        return addressService.getCount();
    }

    @PostMapping
    public void add(@RequestBody @Valid AddAddressRequest request)
    {
        addressService.add(request);
    }
}
