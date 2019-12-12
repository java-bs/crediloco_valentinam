package com.crediloco.crediloco.dominio;

public interface ImprimirDatos {

    // los atributos en una interfaz se llaman fields, son public, static y final, son constantes
    String COLORDEFAULT = "negro";
    String COLORSECUNDARIO = "azul";

    // los métodos en una interfaz son, por default, abstract y public, no tengo que especificarlo
    void imprimirDatos();


}