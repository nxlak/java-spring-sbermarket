package com.java.sbermarket.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class Discount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long discountId;

    private Integer procent;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate expirationDate;

}
