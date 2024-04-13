/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej12;

import java.util.Date;

/**
 *
 * @author santiago
 */
public class Documento {
    
    String fecha;
    String titulo;
    String cuerpo;

    public Documento(String fecha, String titulo, String documento) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.cuerpo = documento;
    }
    
    public int cantCaracteresCuerpo (){
        return cuerpo.length();
    } 

    @Override
    public String toString() {
        return "\n\n"+ fecha + " \t\t\t titulo= " + titulo + "\n\ncuerpo=" + cuerpo + '}';
    }
    
    
    
    
}
