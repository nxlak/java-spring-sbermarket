package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.PayMethod;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PayMethodRequestDTO {

    private String name;

    private String bank_name;

    private String card_num;

    private String expr_date;

    private String cvv;

    public PayMethod toEntity() {
        PayMethod payMethod = new PayMethod();
        payMethod.setName(this.getName());
        payMethod.setBank_name(this.getBank_name());
        payMethod.setCard_num(this.getCard_num());
        payMethod.setExpr_date(this.getExpr_date());
        payMethod.setCvv(this.getCvv());
        return payMethod;
    }
}
