package guia3ej11;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Uprop {

    private ArrayList<Inmueble> listaDeInmueblesUprop;
    private ArrayList<Inmobiliaria> listaDeInmobiliariasUprop;

    public Uprop() {

        listaDeInmobiliariasUprop = new ArrayList<>();
        listaDeInmueblesUprop = new ArrayList<>();
    }
    
    public void agregarListaInmuebles (Inmueble x){
    
     this.listaDeInmueblesUprop.add(x);
    }
    
    public void agregarListaInmobiliaria (Inmobiliaria e){
        this.listaDeInmobiliariasUprop.add(e);
    }

    public void cambioDePrecio(Inmueble inmueble1 , double precionuevo) {
        inmueble1.cambioDePrecio(precionuevo);
    }

}
