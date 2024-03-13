package com.turkcell.ecommercewdb.services.concretes;


import com.turkcell.ecommercewdb.entities.Payment;
import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.repositories.OrderRepository;
import com.turkcell.ecommercewdb.repositories.PaymentRepository;
import com.turkcell.ecommercewdb.services.abstracts.PaymentService;
import com.turkcell.ecommercewdb.services.dtos.payment.requests.AddPaymentRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }

    @Override
    public void add(AddPaymentRequest request) {
        PaymentType paymentType = new PaymentType();
        paymentType.setId(request.getPaymentTypesId());

        Payment payment = new Payment();
        payment.setStatus(request.getStatus());
        payment.setDate(request.getDate());
        payment.setPaymentTypes(paymentType);

        paymentRepository.save(payment);
    }
}
