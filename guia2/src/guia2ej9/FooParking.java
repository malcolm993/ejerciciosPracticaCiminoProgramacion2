package guia2ej9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class FooParking {

    private ArrayList<Garage> listaDeGarages;

    public ArrayList<Informe> obtenerInformeEstadoGarages() {
        ArrayList<Informe> listaInformes = new ArrayList<>();
        for (Garage g : listaDeGarages) {
            Informe aux = new Informe(g.getCodigoAlfanumerico(),g.cantidadVehiculosEstacionados() );
            listaInformes.add(aux);
        }
        return listaInformes;
    }

    public void mostrarVehiculoSinLlave() {
        // Método a resolver...
    }

    

}