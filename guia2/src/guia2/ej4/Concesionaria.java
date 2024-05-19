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

    public Concesionaria(String nombreConcesionaria) {
        this.nombreConcesionaria = nombreConcesionaria;
        listaAutmoviles = new ArrayList<>();
    }

    public ArrayList<Automovil> mostrarVehiculos(TipoDeAutomovil tipodeautomovil1) {
        ArrayList<Automovil> listaAux = new ArrayList<>();
        for (Automovil a : listaAutmoviles) {
            if (a.getTipo().equals(tipodeautomovil1)) {
                listaAux.add(a);

            }
        }
        return listaAux;
    }

    public ArrayList<Automovil> mostrarVehiculos() {
        return listaAutmoviles;
    }

    public void agregarAutomovilLista(Automovil x) {
        listaAutmoviles.add(x);
        System.out.println("se agrego a la lista de la consecionaria " + nombreConcesionaria
                + " el vehiculo : " + x);

    }

    public int cantidadVehiculosConcesionaria() {

        return listaAutmoviles.size();
    }

    public Automovil buscarPorPatente(String patente) {
        Automovil a = null;
        int cont = 0;
        while (cont < cantidadVehiculosConcesionaria() && a == null) {
            Automovil aAux = listaAutmoviles.get(cont);
            if (aAux.getPatente().equalsIgnoreCase(patente)) {
                a = aAux;
            }
            cont++;
        }
//        for (Automovil x : listaAutmoviles) {
//            if (x.getPatente().equalsIgnoreCase(patente)) {
//                a = x;
//            }
//        }
        return a;
    }

    public Automovil borrarAutomovil(String patente) {
        Automovil auxA = buscarPorPatente(patente);
        if (auxA != null) {
            listaAutmoviles.remove(buscarPorPatente(patente));

        }
        return auxA;
    }

    public String getNombreConcesionaria() {
        return nombreConcesionaria;
    }

    @Override
    public String toString() {
        return "\n Concesionaria{" + "nombreConcesionaria=" + nombreConcesionaria
                + ", listaAutmoviles=" + listaAutmoviles + '}';
    }

}
