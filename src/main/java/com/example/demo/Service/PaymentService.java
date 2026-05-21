package com.example.demo.Service;

import java.beans.JavaBean;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.PaymentRequest;
import com.example.demo.Entity.Payments;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PaymentService {
    // create payment bank name, card number, card holder name, expiry date, cvv
    public String CreatePayment(PaymentRequest request) {
        Payments pay = new Payments();
        pay.setBank_name(request.getBank_name());
        pay.setCard_number(request.getCard_number());
        pay.setCard_holder_name(request.getCard_holder_name());
        pay.setExpiry_date(request.getExpiry_date());
        pay.setCvv(request.getCvv());
        return "";
    }

    public String UpdatePayment(PaymentRequest request) {
        Payments pay = new Payments();
        pay.setBank_name(request.getBank_name());
        pay.setCard_number(request.getCard_number());
        pay.setCard_holder_name(request.getCard_holder_name());
        pay.setExpiry_date(request.getExpiry_date());
        pay.setCvv(request.getCvv());
        return "";
    }
}
