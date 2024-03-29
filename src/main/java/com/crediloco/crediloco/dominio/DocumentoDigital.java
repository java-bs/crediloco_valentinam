
package com.crediloco.crediloco.dominio;
import java.util.Date;

public class DocumentoDigital {
    
    // Atributos 
    private String nombre;
    private Date fechaDeCarga;
    private byte[] imagen;
    
    DocumentoDigital(String nombre, Date fechaDeCarga, byte[] imagen){
      this.nombre = nombre;
      this.fechaDeCarga = fechaDeCarga;
      this.imagen = imagen;
    }    
    
    // Getters & Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Date getFechaDeCarga(){
        return fechaDeCarga;
    }
    
    public void setFechaDeCarga(Date fechaDeCarga){
        this.fechaDeCarga = fechaDeCarga;
    }
    
    public byte[] getImagen(){
        return imagen;
    }
    
    public void setImagen(byte[] imagen){
        this.imagen = imagen;
    }
    // Métodos
}
