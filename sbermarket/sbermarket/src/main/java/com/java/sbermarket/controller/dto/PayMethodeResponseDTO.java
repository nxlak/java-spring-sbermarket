package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.PayMethod;

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

    public PayMethodeResponseDTO(Long payMethodId, String name, String bank_name, String card_num, String expr_date,
            String cvv) {
        this.payMethodId = payMethodId;
        this.name = name;
        this.bank_name = bank_name;
        this.card_num = card_num;
        this.expr_date = expr_date;
        this.cvv = cvv;
    }

    public Long getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(Long payMethodId) {
        this.payMethodId = payMethodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    public String getExpr_date() {
        return expr_date;
    }

    public void setExpr_date(String expr_date) {
        this.expr_date = expr_date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
