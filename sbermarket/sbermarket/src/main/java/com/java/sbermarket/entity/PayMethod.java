package com.java.sbermarket.entity;

import jakarta.persistence.*;

@Entity
public class PayMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long payMethodId;

    private String name;

    private String bank_name;

    private String card_num;

    private String expr_date;

    private String cvv;

    public PayMethod(String name, String bank_name, String card_num, String expr_date, String cvv) {
        this.name = name;
        this.bank_name = bank_name;
        this.card_num = card_num;
        this.expr_date = expr_date;
        this.cvv = cvv;
    }

    public PayMethod() {

    }

    public Long getPayMethodId() {
        return payMethodId;
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

    @Override
    public String toString() {
        return "PayMethod [payMethodId=" + payMethodId + ", name=" + name + ", bank_name=" + bank_name + ", card_num="
                + card_num + ", expr_date=" + expr_date + ", cvv=" + cvv + "]";
    }

    

}
