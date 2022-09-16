package com.bbva.cpqr.dto.datos;

public class PersonaOut {

    private String nombreCliente;
    private String numeroCuenta;
    private Boolean cuatroMil;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Boolean getCuatroMil() {
        return cuatroMil;
    }

    public void setCuatroMil(Boolean cuatroMil) {
        this.cuatroMil = cuatroMil;
    }

    @Override
    public String toString() {
        return  nombreCliente + '|' +
                numeroCuenta + '|' +
                cuatroMil +"\n" ;
    }
}
