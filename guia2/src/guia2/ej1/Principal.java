/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia2.ej1;

/**
 *
 * @author santi
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Domicilio dom1 = new Domicilio("flores", "nazca", "798");
        Domicilio dom2 = new Domicilio("paternal", "directorio", "124");
        Domicilio dom3 = new Domicilio("Floresta", "av J B Justo", "456");

        Persona p1 = new Persona("santiago", "lopez", "45454545", dom1);
        Persona p2 = new Persona("julian", "gomez", "898989", dom2);
        Persona p3 = new Persona("roberto", "Gonzales", "656565", dom3);
        Persona p4 = new Persona("julio", "ramirez", "45454545", dom3);

        Agenda a1 = new Agenda();

        a1.agregarPersona(p1);
        a1.agregarPersona(p2);
        a1.agregarPersona(p3);

        a1.listarAgenda();
        System.out.println("");
        System.out.println(a1.ulitmoDeAgenda());

        System.out.println("se puede agregar a la persona 4? :" + a1.agregarPersona(p4));

        a1.listarAgenda();
        System.out.println("");
        System.out.println(a1.ulitmoDeAgenda());

//        a1.removerPersona("45454545");
//        a1.listarAgenda();
        System.out.println("dni encontrado:" + a1.buscarPorDni("45454545"));

    }

}
