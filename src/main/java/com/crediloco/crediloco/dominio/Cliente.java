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
public class Cliente implements ImprimirDatos {
    
    // Atributos
    private int cuentaBancaria;
    private String domicilio;
    private String dni;
    private byte dniDigitalizado;
    private double ingresos;
    private int prestamos[];
    
    Cliente(int cuentaBancaria, String domicilio, String dni, byte dniDigitalizado, double ingresos, int[] prestamos){
     this.cuentaBancaria = cuentaBancaria;
     this.domicilio = domicilio;
     this.dni = dni;
     this.dniDigitalizado = dniDigitalizado;
     this.ingresos = ingresos;
     this.prestamos = prestamos;
    }
    
    // Implementación de la interfaz
    public void imprimirDatos(Cliente cliente){
        System.out.println("Impresión: " + "número de cuenta bancaria = " + cliente.getCuentaBancaria() + ", DNI = " + cliente.getDNI() + ", ingresos = " + cliente.getIngresos() + ". Color de impresión: " + COLORSECUNDARIO);
    }
    

    // Getters & Setters
    public int getCuentaBancaria(){
        return cuentaBancaria;
    }
    
    public void setCuentaBancaria(int cuentaBancaria){
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public String getDNI(){
        return dni;
    }
    
    public void setDNI(String dni){
        this.dni = dni;
    }
    
    public byte getDNIDigitalizado(){
        return dniDigitalizado;
    }
    
    public void setDNIDigitalizado(byte dniDigitalizado){
        this.dniDigitalizado = dniDigitalizado;
    }
    
    public double getIngresos(){
        return ingresos;
    }
    
    public void setIngresos(double ingresos){
        this.ingresos = ingresos;
    }
    
    public int[] getPrestamos(){
        return prestamos;
    }
    
    public void setPrestamos(int[] prestamos){
        this.prestamos = prestamos;
    }
    
    // Métodos
    // Función para cambiar domicilio
    public void cambiarDomicilio(String nuevoDomicilio){
       this.domicilio = nuevoDomicilio;
    }
    
    // Función para actualizar el monto de ingresos
    public void actualizarIngresos(byte dniDigitalizado , double nuevoMonto){
       this.ingresos = nuevoMonto;
    }
}
