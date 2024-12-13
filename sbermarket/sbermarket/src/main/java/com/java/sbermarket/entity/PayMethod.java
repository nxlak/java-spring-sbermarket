package com.java.sbermarket.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class PayMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long payMethodId;

    private String name;

    private String bank_name;

    private String card_num;

    private String expr_date;

    private String cvv;

}
