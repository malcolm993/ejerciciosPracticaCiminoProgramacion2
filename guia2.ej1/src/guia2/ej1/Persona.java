/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2.ej1;

/**
 *
 * @author santi
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String dni;
    private Domicilio dom;

    public Persona(String nombre, String apellido, String dni, Domicilio x) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.dom = x;
    }

    public String getDni() {
        return dni;
    }

    public void setDom(Domicilio dom) {
        this.dom = dom;
    }
    public String getBarrioPersona(){
        return dom.getBarrio();
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", dom=" + dom + '}';
    }
    
    
            

}
