package com.java.sbermarket.controller.dto;

import java.time.LocalDate;

import com.java.sbermarket.entity.Discount;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DiscountRequestDTO {

    private Integer procent;
    
    private LocalDate expirationDate;

    public Discount toEntity() {
        Discount discount = new Discount();
        discount.setProcent(this.getProcent());
        discount.setExpirationDate(this.getExpirationDate());
        return discount;
    }
}
