package guia2.ej4;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Concesionaria {

    private String nombreConcesionaria;
    private ArrayList<Automovil> listaAutmoviles;

    public ArrayList<Automovil> mostrarVehiculos(TipoDeAutomovil tipodeautomovil1) {
        ArrayList<Automovil> listaAux = new ArrayList<>();
        for (Automovil a : listaAutmoviles) {
            if( a.getTipo().equals(tipodeautomovil1)){
                listaAux.add(a);
                
            }
        }
        return listaAux;
    }
    public ArrayList<Automovil> mostrarVehiculos(){      
        return listaAutmoviles;
    }
    

}
