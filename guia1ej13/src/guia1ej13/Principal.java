/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1ej13;

import java.text.ParseException;

/**
 *
 * @author santiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Domicilio dom = new Domicilio("Flores", "nazca", "251");
        Persona p = new Persona("Ariel", "Lopez", "01/01/1998", dom);
        TarjetaDeCredito t1 = new TarjetaDeCredito(EntidadFinanciera.VISA, "Galicia", "454544545", 15000, p);
        Posnet posnet1 = new Posnet(t1, 5, 10000);
        
        posnet1.efectuarPago();
        
        
    }
    
}
