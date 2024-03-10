package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.services.abstracts.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
