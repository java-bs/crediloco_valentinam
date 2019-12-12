
package com.crediloco.crediloco;

import com.crediloco.crediloco.dominio.Banco;
import com.crediloco.crediloco.dominio.Cliente;
import com.crediloco.crediloco.dominio.Prestamo;
import com.crediloco.crediloco.dominio.PrestamoPersonal;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
                System.out.println("Hola mundo!");

        Banco bancoSaenz = Banco.obtenerBanco();

        System.out.println("Iniciando sistema del banco: " + bancoSaenz);

        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 6);

        //elMonto = new BigDecimal(4435.564);
        //elMonto.setScale(5, RoundingMode.HALF_UP);
        //miPrimerPrestamo.setMonto(elMonto);
        Prestamo miSegundoPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 12);

        //uso de constructor de Cliente
        //como no hay setter del nombre, una vez que lo creo no lo puedo cambiar
        Cliente cliente = new Cliente("José", 123, "17555555", 1900.00);

        PrestamoPersonal miTercerPrestamoPersonal = new PrestamoPersonal(bancoSaenz, elMonto, 30);
        miTercerPrestamoPersonal.setSituacionVeraz("AA");

        Prestamo[] prestamosDelCliente = {miPrimerPrestamo,
            miSegundoPrestamo,
            miTercerPrestamoPersonal};
        //asignacion de prestamos al cliente
        cliente.setPrestamos(prestamosDelCliente);
        cliente.imprimirDatos();
        miTercerPrestamoPersonal.imprimirDatos();
        //cliente.getPrestamos()[2] = miPrimerPrestamo;
        //cliente.getPrestamos().length;
        System.out.println("Prestamo creado: " + miPrimerPrestamo);
        System.out.println("Cliente creado: " + cliente);
    }
    
}
