package com.java.sbermarket.controller.dto;

import java.time.LocalDate;

import com.java.sbermarket.entity.Discount;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DiscountResponseDTO {
    
    private Long discountId;

    private Integer procent;
    
    private LocalDate expirationDate;


    public DiscountResponseDTO(Discount discount) {
        this.discountId = discount.getDiscountId();
        this.procent = discount.getProcent();
        this.expirationDate = discount.getExpirationDate();
    }

}
