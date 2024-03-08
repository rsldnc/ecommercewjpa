package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
