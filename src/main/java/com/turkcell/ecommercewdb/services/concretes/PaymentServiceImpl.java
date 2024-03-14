package com.turkcell.ecommercewdb.services.concretes;


import com.turkcell.ecommercewdb.entities.Payment;
import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.repositories.OrderRepository;
import com.turkcell.ecommercewdb.repositories.PaymentRepository;
import com.turkcell.ecommercewdb.services.abstracts.PaymentService;
import com.turkcell.ecommercewdb.services.dtos.payment.requests.AddPaymentRequest;
import com.turkcell.ecommercewdb.services.mappers.PaymentMapper;
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
        Payment payment = PaymentMapper.INSTANCE.paymentFromAddRequest(request);

        paymentRepository.save(payment);
    }
}
