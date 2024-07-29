package guia2ej9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Vehiculo {

    private String patente;
    private Llave llave;
    private ArrayList<Persona> personasAutorizadas;
    private int mesesDeDeuda;

    public Vehiculo(String patente , int cantMesesAdeuda) {
        this.patente = patente;
        this.llave = new Llave(patente);
        this.mesesDeDeuda = cantMesesAdeuda;
        personasAutorizadas = new ArrayList<>();
    }

    public String getPatente() {
        return patente;
    }

    public Llave getLlave() {
        return llave;
    }
    
    

    public int getMesesAdeudados() {
         return mesesDeDeuda;
    }
    
    public Persona buscarPersonaAutorizada( String dniBuscado){
        Persona encontrada = null;
        int contador =0;
        while (encontrada == null && contador < personasAutorizadas.size()){
            Persona aux = personasAutorizadas.get(contador);
            if( aux.getDni().equalsIgnoreCase(dniBuscado)){
                encontrada = aux;
            }
            
            contador++;
        }
        return encontrada;
    }

}