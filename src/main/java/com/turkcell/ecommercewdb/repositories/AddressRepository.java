package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
