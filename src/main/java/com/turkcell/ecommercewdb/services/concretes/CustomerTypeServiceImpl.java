package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.core.exception.types.BusinessException;
import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.entities.CustomerType;
import com.turkcell.ecommercewdb.repositories.CustomerTypeRepository;
import com.turkcell.ecommercewdb.services.abstracts.CustomerTypeService;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
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

    @Override
    public void add(AddCustomerTypeRequest request) {
        List<CustomerType> customerTypes = customerTypeRepository.findAll();
        for (CustomerType customerType : customerTypes) {
            if (customerType.getType().toLowerCase().equals(request.getType().toLowerCase()))
                throw new BusinessException("This customer type already exists");
        }

        CustomerType customerType = new CustomerType();

        customerType.setType(request.getType());
        customerTypeRepository.save(customerType);
    }
}
