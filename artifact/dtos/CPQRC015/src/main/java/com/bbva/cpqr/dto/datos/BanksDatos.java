package com.bbva.cpqr.dto.datos;

public class BanksDatos {

    private String name;
    private String number;
    private Boolean cuatroXMil;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getCuatroXMil() {
        return cuatroXMil;
    }

    public void setCuatroXMil(Boolean cuatroXMil) {
        this.cuatroXMil = cuatroXMil;
    }

    @Override
    public String toString() {
        return "BanksDatos{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", cuatroXMil=" + cuatroXMil +
                '}';
    }
}
