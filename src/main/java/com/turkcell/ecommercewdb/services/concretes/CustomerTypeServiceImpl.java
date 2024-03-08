package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.CustomerType;
import com.turkcell.ecommercewdb.repositories.CustomerTypeRepository;
import com.turkcell.ecommercewdb.services.abstracts.CustomerTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    private final CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> getAll() {
        return customerTypeRepository.findAll();
    }
}
