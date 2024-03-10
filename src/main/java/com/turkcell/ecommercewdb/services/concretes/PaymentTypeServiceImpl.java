package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.repositories.PaymentTypeRepository;
import com.turkcell.ecommercewdb.services.abstracts.PaymentTypeService;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.responses.PaymentTypesNameResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PaymentTypeServiceImpl implements PaymentTypeService {

    private final PaymentTypeRepository paymentTypeRepository;

    @Override
    public List<PaymentType> getAll() {
        return paymentTypeRepository.findAll();
    }

    @Override
    public List<PaymentTypesNameResponse> getPaymentTypes() {
        return paymentTypeRepository.getPaymentTypeNames();
    }
}
