
package com.crediloco.crediloco.dominio;

public class Domicilio {
    private String calle;
    private int numero;
    private int piso;
    private String provincia;
    
    Domicilio(String calle, int numero, int piso, String provincia){
      this.calle = calle;
      this.numero = numero;
      this.piso = piso;
      this.provincia = provincia;
    }
    
    // Getters & Setters
    public String getCalle(){
        return calle;
    }
    
    public void setCalle(String calle){
        this.calle = calle;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
     public int getPiso(){
        return piso;
    }
    
    public void setPiso(int piso){
        this.piso = piso;
    }
    
    public String getProvincia(){
        return provincia;
    }
    
    public void setProvincia(String provincia){
        this.provincia = provincia;
    }
    
    // Métodos
}
