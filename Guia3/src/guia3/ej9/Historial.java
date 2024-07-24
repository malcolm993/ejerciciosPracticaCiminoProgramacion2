package guia3.ej9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Historial {

    private ArrayList<Facturable> listaFacturas;

    public Historial() {
        this.listaFacturas = new ArrayList<>();
    }
    
    
    public void agregarFacturaLista(Facturable x){
        listaFacturas.add(x);
    }

    public double montoTotalFacturado() {
        double aux=0;
        for (Facturable x : listaFacturas) {
            aux += x.montoDeFacturacion();
        }
        return aux;
    }

    public int cantServiciosSimples() {
        int contador=0;
        for (Facturable f : listaFacturas) {
            if(esReparacionSimple(f)){
                contador++;
            }
            
        }
        return contador;
    }
    
    private boolean esReparacionSimple(Facturable x){
        return (x instanceof ServicioReparacion) && ((ServicioReparacion)x).getNivelDificultad()<2;
    }

}