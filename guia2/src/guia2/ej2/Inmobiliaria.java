package guia2.ej2;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Inmobiliaria {

    private ArrayList<Inmueble> inmbueblesOfertadas;

    public Inmobiliaria() {
        this.inmbueblesOfertadas = new ArrayList<>();
    }
    
    
    public double promedioDePrecio() {
        double promedio;
//        System.out.println(precioTotalDeTodosInmuebles()+"    "+ inmbueblesOfertadas.size()  );
        promedio = precioTotalDeTodosInmuebles()/inmbueblesOfertadas.size();
        return promedio;
    }

    public ArrayList<Inmueble> propiedadesMasEconomicas() {
        // Método a resolver...
        return null;
    }

    public ArrayList<Inmueble> cantidadDePropiedadesSegunTipo(TipoDeInmueble tipodeinmuebles1) {
        // Método a resolver...
        return null;
    }
    
    public boolean cargarInmueble (Inmueble i){
        boolean aux= false;
        if( i != null){
            this.inmbueblesOfertadas.add(i);
            aux= true;                    
        }
        return aux;        
    }
    
    private double precioTotalDeTodosInmuebles (){
        double total = 0.0;
        for (Inmueble in : inmbueblesOfertadas) {
            total = total + in.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Inmobiliaria{" + "inmbueblesOfertadas=" + inmbueblesOfertadas + '}';
    }
    
    

}
