/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2.ej1;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Agenda {
    
    ArrayList<Persona> agendaPersonas;

    public Agenda() {
        agendaPersonas = new ArrayList<>();
    }
    
    
    public void listarAgenda (){
        for (Persona x : agendaPersonas) {
            System.out.println(x.toString());
        }
    }
        
    public void agregarPersona(Persona a){
        agendaPersonas.add(a);
    }

    public Persona ulitmoDeAgenda(){
        return agendaPersonas.get(agendaPersonas.size()-1);
    }
}
    

