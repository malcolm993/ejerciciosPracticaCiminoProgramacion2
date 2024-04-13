/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1ej4;

/**
 *
 * @author santiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(4, 8, 1995);
        fecha1.obtenerDia();
        
        fecha1.sumarMes();
        fecha1.obtenerDia();
        
        System.out.println("es navidad : "+ fecha1.esNavidad());
    }
    
}
