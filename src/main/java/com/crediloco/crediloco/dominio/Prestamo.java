
package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

// utilizo 'implements' en lugar de 'extends'
public class Prestamo implements ImprimirDatos {

    //Atributos
    private Banco banco;
    private BigDecimal monto;
    private int plazoEnMeses;
    private int cantidadDeCuotas;
    private double tasa;
    private byte[] documentos;

    // Implementación del método imprimirDatos() declarado en la interfaz ImprimirDatos
    @Override
    public void imprimirDatos(){
        System.out.println("Impresión: " + "monto del préstamo = " + monto + ", plazo = " + plazoEnMeses + ", cantidad de cuotas = " + cantidadDeCuotas + ". Color de impresión: " + COLORDEFAULT );
    };
    
    Prestamo(Banco banco, BigDecimal monto, int cantidadDeCuotas){
        this.banco = banco;
        this.monto = monto;
        this.cantidadDeCuotas = cantidadDeCuotas;
    };
    
    Prestamo(Banco banco, BigDecimal monto, int plazoEnMeses, int cantidadDeCuotas, double tasa, byte[] documentos) {
        this.banco = banco;
        this.monto = monto;
        this.plazoEnMeses = plazoEnMeses;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.tasa = tasa;
        this.documentos = documentos;
    }

    // Getters & Setters
    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public byte[] getDocumentos() {
        return documentos;
    }

    public void setDocumentos(byte[] documentos) {
        this.documentos = documentos;
    }

    // Métodos
    // Función para cancelar cuotas
    public Boolean cancelarCuotas(int cantidadACancelar) {

        int diferenciaDeCuotas = cantidadDeCuotas - cantidadACancelar;

        // Verifico que sea posible cancelar dicha cantidad de cuotas
        if (diferenciaDeCuotas >= 0) {

            // Setteo la cantidadDeCuotas a la cantidad de cuotas restanes
            setCantidadDeCuotas(diferenciaDeCuotas);
            return true;
        } else {
            cancelarCuotas(cantidadACancelar - 1);
        }

        return false;
    }

    // Función para cancelar préstamos
    public void cancelarPrestamo() {
        setCantidadDeCuotas(0);
    }
}
