package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query("SELECT COUNT(a) FROM Address a")
    int getAddressCount();
}
