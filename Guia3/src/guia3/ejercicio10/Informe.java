/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3.ejercicio10;

/**
 *
 * @author santiago
 */
public class Informe {
    
    private double indiceCalidadPrograma;
    private Programa programaInformado;

    public Informe(Programa programaInformado) {
        
        this.programaInformado = programaInformado;
        this.indiceCalidadPrograma = programaInformado.indiceDeCalidad();
    }

    public double getIndiceCalidadPrograma() {
        return indiceCalidadPrograma;
    }

    public Programa getProgramaInformado() {
        return programaInformado;
    }
    
    
    
    public void mostrarInformePrograma(){
    
        System.out.println("INFORME PROGRAMA  "
                + "ID: " +programaInformado.getId() + " nombre: " + programaInformado.getNombrePrograma() + " INDICE DE CALIDAD :" + this.indiceCalidadPrograma);
    }
    
    
}
