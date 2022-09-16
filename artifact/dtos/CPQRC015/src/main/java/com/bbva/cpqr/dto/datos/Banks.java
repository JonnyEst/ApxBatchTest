package com.bbva.cpqr.dto.datos;

import java.util.List;

public class Banks {

    private String userName;
    private String state;
    private List<BanksDatos> banksDatos;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<BanksDatos> getBanksDatos() {
        return banksDatos;
    }

    public void setBanksDatos(List<BanksDatos> banksDatos) {
        this.banksDatos = banksDatos;
    }

    @Override
    public String toString() {
        return "Banks{" +
                "userName='" + userName + '\'' +
                ", state='" + state + '\'' +
                ", banksDatos=" + banksDatos +
                '}';
    }
}
