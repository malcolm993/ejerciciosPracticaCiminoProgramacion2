/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1ej8;

import java.awt.BorderLayout;
import javax.sound.midi.Soundbank;

/**
 *
 * @author santiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Password clave = new Password("santiago1234");
        
        System.out.println(clave.toString());
        System.out.println("la clave es fuerte: " + clave.esFuerte());
        System.out.println("clave generada aleatoriamente: " + clave.generarAleatorio(3));
        
        clave.nuevoValor("132");
        System.out.println(clave.toString());
        System.out.println("la clave es fuerte: " + clave.esFuerte());
        
         clave.nuevoValor("clave78");
        System.out.println(clave.toString());
        System.out.println("la clave es fuerte: " + clave.esFuerte());
    }
    
}
