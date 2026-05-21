package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String bank_name;
    private String card_number;
    private String card_holder_name;
    private String expiry_date;
    private String cvv;

}
