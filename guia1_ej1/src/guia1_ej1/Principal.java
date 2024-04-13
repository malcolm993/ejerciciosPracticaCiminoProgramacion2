/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1_ej1;

import java.text.ParseException;

/**
 *  paginna q ayudo bastante : https://www.arquitecturajava.com/java-calendar-y-el-manejo-de-fechas/
 * @author santiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
//        Persona sujeto1 = new Persona();
//        int edadPrueba;
//        sujeto1.setNombre("santiago");
//        sujeto1.setApellido("lopez");
//        sujeto1.setFechaNacimiento("01/05/1993");
//        
//        System.out.println( sujeto1.getNombre() + " "+sujeto1.getApellido());
//        System.out.println("fecha de nacimiento "+ sujeto1.getFechaNacimiento());
//        
//        System.out.println(sujeto1.getEdad());
//        edadPrueba = 40;
//        System.out.println("verificar si es mayor a "+ edadPrueba+" = "+ sujeto1.verificarMayorA(edadPrueba));
           Domicilio domicilio1 = new Domicilio("Flores", "Segurola", "2558");
           Persona sujeto2 = new Persona("julian", "Lopez", "02/01/1960", domicilio1);
          
           System.out.println(sujeto2.toString());
//        System.out.println(sujeto1.toString());
                
    
    }
    
}
