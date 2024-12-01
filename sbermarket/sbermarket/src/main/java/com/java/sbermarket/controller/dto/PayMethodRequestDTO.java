package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.PayMethod;

public class PayMethodRequestDTO {

    private String name;

    private String bank_name;

    private String card_num;

    private String expr_date;

    private String cvv;

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
