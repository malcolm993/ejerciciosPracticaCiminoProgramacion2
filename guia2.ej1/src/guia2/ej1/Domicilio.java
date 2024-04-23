/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2.ej1;

/**
 *
 * @author santi
 */
public class Domicilio {
    
    private String barrio;
    private String calle;
    private String altura;

    public Domicilio(String barrio, String calle, String altura) {
        this.barrio = barrio;
        this.calle = calle;
        this.altura = altura;
    }

    public String getBarrio() {
        return barrio;
    }
    
    @Override
    public String toString() {
        return "Domicilio{" + "barrio=" + barrio + ", calle=" + calle + ", altura=" + altura + '}';
    }
    
    
    
}
