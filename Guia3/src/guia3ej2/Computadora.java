/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3ej2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author santiago
 */
public class Computadora {

    private ArrayList<Archivo> listaDeArchivos;

    public Computadora() {

        listaDeArchivos = new ArrayList<>();

    }
    
    public void cerrarTodos(){
        for (Archivo a : listaDeArchivos) {
            a.cerrarArchivo();
        }
  
    }
    
    public void cantArchivoDeTexto(){
        int contArchivoTexto = 0;
        for (Archivo a : listaDeArchivos) {
            if ( a instanceof ArchivoTexto){
            
                contArchivoTexto++;
            }
        }
    }
    
    
    public void cifrarArchivos(){
        for (Archivo a : listaDeArchivos) {
            if(verifiacionCifradoDeArchivo(a)){
                ((ArchivoTexto)a).cifrarContenido();
            }
            
        }
    }
    
    private boolean verifiacionCifradoDeArchivo(Archivo x){
        return (x instanceof ArchivoTexto) && ((ArchivoTexto)x).getCodificacion().equalsIgnoreCase("UTF-8");
    }
    
    public double duracionPromedio(){
        return cantidadTotalSegundosMultimedia()/cantidadArchivosMultimedia();
    }
    
    private double cantidadTotalSegundosMultimedia(){
        double totalSegundos = 0;
        for (Archivo a : listaDeArchivos) {
            if(a instanceof ArchivoMultimedia){
                totalSegundos = totalSegundos + ((ArchivoMultimedia) a).getDuracion();
            }
        }
        return totalSegundos;
    }
    
    private int cantidadArchivosMultimedia(){
        int totalMultimedia = 0;
        for (Archivo a : listaDeArchivos) {
            if(a instanceof ArchivoMultimedia){
                totalMultimedia++ ;
            }
        }
        
        return totalMultimedia;
    }

}
