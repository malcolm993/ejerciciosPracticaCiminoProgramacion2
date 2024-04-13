/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1_ej1;

/**
 *
 * @author santiago
 */
public class Domicilio {
    String barrio;
    String calle;
    String altura;

    public Domicilio(String barrio, String calle, String altura) {
        this.barrio = barrio;
        this.calle = calle;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "barrio=" + barrio + ", calle=" + calle + ", altura=" + altura + '}';
    }
    
    
    
         
}
