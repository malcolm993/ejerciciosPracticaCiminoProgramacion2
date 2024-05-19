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

    public void listarAgenda() {

        if (!agendaPersonas.isEmpty()) {
            for (Persona x : agendaPersonas) {
                System.out.println(x.toString());
            }
        } else {
            System.out.println("agenda vacia ");
        }
    }

    public boolean agregarPersona(Persona a) {

        boolean aux = false;
        if (verificarPersonaDni(a) == null) {
            agendaPersonas.add(a);
            aux = true;
        }
        return aux;
    }

    public Persona ulitmoDeAgenda() {
        return agendaPersonas.get(agendaPersonas.size() - 1);
    }

    private Persona verificarPersonaDni(Persona x) {
        Persona aux = null;
        for (Persona personaaux : agendaPersonas) {
            //System.out.println("entro a la funcion verificarPersonaDni dentro de for each ");
            if (personaaux.getDni().equals(x.getDni())) {
                //System.out.println("entro a la funcion verificarPersonaDni dentro de if ");
                aux = x;
            }
        }
        return aux;
    }

    private int cantidadDePersonasEnAgenda() {
        return agendaPersonas.size();
    }

    public Persona removerPersona(String dniEliminar) {
        Persona aux = buscarPorDni(dniEliminar);
        return aux;
    }

    private int cantidadPeronasAgenda() {
        return agendaPersonas.size();
    }

    public Persona buscarPorDni(String dniBuscado) {
        Persona personaEncontrado = null;
        int a = 0;
        while (a <= cantidadDePersonasEnAgenda() && personaEncontrado == null) {

            if (dniBuscado.equalsIgnoreCase(agendaPersonas.get(a).getDni())) {
                personaEncontrado = agendaPersonas.get(a);
            }
            a++;
        }
        return personaEncontrado;
    }

    public boolean modificaDomicilio(String dniCambioDom, Domicilio x) {
        boolean aux = false;
        Persona p1 = buscarPorDni(dniCambioDom);
        if (p1 != null) {
            aux = true;
            p1.setDom(x);
        }
        return aux;
    }

    public ArrayList<Persona> obtenerPorBarrio(String barrio) {
        ArrayList<Persona> auxPersonaBarrio = new ArrayList<>();
        for (Persona p : agendaPersonas) {
            if (p.getBarrioPersona().equalsIgnoreCase(barrio)) {
                auxPersonaBarrio.add(p);
            }
        }

        return auxPersonaBarrio;
    }

    public void vaciar() {
        while (!agendaPersonas.isEmpty()) {
            agendaPersonas.remove(0);
        }
    }
}
