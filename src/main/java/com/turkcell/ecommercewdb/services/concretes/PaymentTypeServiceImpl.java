package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.core.exception.types.BusinessException;
import com.turkcell.ecommercewdb.entities.CustomerType;
import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.repositories.PaymentTypeRepository;
import com.turkcell.ecommercewdb.services.abstracts.PaymentTypeService;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.requests.AddPaymentTypeRequest;
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

    @Override
    public void add(AddPaymentTypeRequest request) {
        List<PaymentType> paymentTypes = paymentTypeRepository.findAll();
        for (PaymentType paymentType : paymentTypes) {
            if (paymentType.getType().toLowerCase().equals(request.getType().toLowerCase()))
                throw new BusinessException("This payment type already exists");
        }

        PaymentType paymentType = new PaymentType();

        paymentType.setType(request.getType());
        paymentTypeRepository.save(paymentType);
    }
}
