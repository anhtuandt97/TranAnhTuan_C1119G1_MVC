package com.codegym.entity;

import java.sql.Date;

public class Contract {
private Long id;
private Date contractDateStart;
private Date contractDateEnd;
private Double deposit;
private Double total;

    public Contract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getContractDateStart() {
        return contractDateStart;
    }

    public void setContractDateStart(Date contractDateStart) {
        this.contractDateStart = contractDateStart;
    }

    public Date getContractDateEnd() {
        return contractDateEnd;
    }

    public void setContractDateEnd(Date contractDateEnd) {
        this.contractDateEnd = contractDateEnd;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
