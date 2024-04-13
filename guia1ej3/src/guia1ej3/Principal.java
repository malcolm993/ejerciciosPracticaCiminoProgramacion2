/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1ej3;

import java.text.ParseException;

/**
 *
 * @author santiago
 */public class Principal {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       Domicilio domicilio1 = new Domicilio("Villa Ortuzar", "av Triunvirato", "3174");
       Persona sujeto = new Persona("Fulano", "Gomez", "16/04/1990", domicilio1);
       Persona sujeto2 = new Persona("Mengana", "Torres", "23/11/1991", domicilio1);
       CuentaBancaria cb1 = new CuentaBancaria(TipoDeCuenta.CAJA_DE_AHORRRO,sujeto, "01/04/2023");
       CuentaBancaria cb2 = new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE,sujeto2, "01/04/2023");
       System.out.println("saldo :" + cb1.getSaldo());
       
       cb1.depositarDinero(500);
       System.out.println(cb1.getSaldo());
       
       cb1.extraccion(200);
       System.out.println(cb1.getSaldo());
       
       cb1.extraccion(800);
       System.out.println(cb1.getSaldo());
       
        System.out.println(cb1.toString());
        
         System.out.println(cb2.toString());
       
    }
    
}
