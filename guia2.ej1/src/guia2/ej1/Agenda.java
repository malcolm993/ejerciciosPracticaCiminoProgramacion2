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
        
    public boolean agregarPersona(Persona a){
        
        boolean aux = false;
        if (verificarPersonaDni(a)){
            agendaPersonas.add(a);
            aux = true;
        }
        return aux;
    }

    public Persona ulitmoDeAgenda(){
        return agendaPersonas.get(agendaPersonas.size()-1);
    }
    
    private boolean verificarPersonaDni (Persona x){
        boolean aux = true;
        for (Persona personaaux : agendaPersonas) {
            //System.out.println("entro a la funcion verificarPersonaDni dentro de for each ");
            if(personaaux.getDni().equals(x.getDni())){
                //System.out.println("entro a la funcion verificarPersonaDni dentro de if ");
                aux = false;
            }
        }
        return aux;
    }
}
    

