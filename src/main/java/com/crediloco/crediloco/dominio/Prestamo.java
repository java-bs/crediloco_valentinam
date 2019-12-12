/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crediloco.crediloco.dominio;

/**
 *
 * @author moscato
 */
public class Prestamo implements ImprimirDatos {

    //Atributos
    private double monto;
    private int plazoEnMeses;
    private int cantidadDeCuotas;
    private double tasa;
    private byte[] documentos;

    // Implementación de la interfaz
    public void imprimirDatos(Prestamo prestamo){
        System.out.println("Impresión: " + "monto del préstamo = " + prestamo.getMonto() + ", plazo = " + prestamo.getPlazoEnMeses() + ", cantidad de cuotas = " + prestamo.getCantidadDeCuotas() + ". Color de impresión: " + COLORDEFAULT);
    }

    Prestamo(double monto, int plazoEnMeses, int cantidadDeCuotas, double tasa, byte[] documentos) {
        this.monto = monto;
        this.plazoEnMeses = plazoEnMeses;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.tasa = tasa;
        this.documentos = documentos;

    }

    // Getters & Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
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
