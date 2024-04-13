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
    
    String ciudad;
    String calle;
    String altura;

    public Domicilio(String ciudad, String calle, String altura) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "ciudad=" + ciudad + ", calle=" + calle + ", altura=" + altura + '}';
    }
    
    
    
}
