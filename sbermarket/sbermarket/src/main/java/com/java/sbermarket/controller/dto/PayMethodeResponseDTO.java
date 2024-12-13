package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.PayMethod;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PayMethodeResponseDTO {
    
    private Long payMethodId;

    private String name;

    private String bank_name;

    private String card_num;

    private String expr_date;

    private String cvv;

    public PayMethodeResponseDTO(PayMethod payMethod) {
        this.payMethodId = payMethod.getPayMethodId();
        this.name = payMethod.getName();
        this.bank_name = payMethod.getBank_name();
        this.card_num = payMethod.getCard_num();
        this.expr_date = payMethod.getExpr_date();
        this.cvv = payMethod.getCvv();
    }

}
