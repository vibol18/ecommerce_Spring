package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    private long id;
    private String bank_name;
    private String card_number;
    private String card_holder_name;
    private String expiry_date;
    private String cvv;
}
