package guia2.ej4;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class MarcaAutomotriz {

    private ArrayList<Concesionaria> listaConcesionarias;

    public MarcaAutomotriz() {
        this.listaConcesionarias = new ArrayList<>();
    }

    public void mostrarVehiculos() {
        for (Concesionaria c : listaConcesionarias) {
            c.mostrarVehiculos();
        }
    }

    public ArrayList<Concesionaria> obtenerConcesionariaMaxVeh() {
        ArrayList<Concesionaria> listaAux = new ArrayList<>();
        for (Concesionaria c1 : listaConcesionarias) {
            if (c1.cantidadVehiculosConcesionaria() >= maximaCantidadVehiculos()) {
                listaAux.add(c1);
            }
        }
        return listaAux;
    }

    private int maximaCantidadVehiculos() {
        int maxCant = 0;

        for (Concesionaria c : listaConcesionarias) {
            if (maxCant == 0 || maxCant < c.cantidadVehiculosConcesionaria()) {
                maxCant = c.cantidadVehiculosConcesionaria();
            }
        }
        return maxCant;
    }

    private int cantidadConcesionarias() {
        return listaConcesionarias.size();
    }

    public Automovil borrarVehiculoConcesionaria(String patente) {

        int cont = 0;
        Automovil a1 = null;
        while (cont < cantidadConcesionarias() && a1 == null) {
            Concesionaria auxC = listaConcesionarias.get(cont);
            a1 = auxC.borrarAutomovil(patente);
            cont++;

        }
        return a1;
    }

    public boolean cambiarVehiculoConcesionaria(String nombreC, String patente) {
        boolean x = false;
        int con = 0;
        Automovil auxA = borrarVehiculoConcesionaria(patente);
        Concesionaria auxC = buscarConcesionaria(nombreC);
        if (auxA != null) {
            auxC.agregarAutomovilLista(auxA);
            x = true;
        }

        return x;
    }

    public void agregarConcesionaria(Concesionaria nuevaConcesionaria) {
        listaConcesionarias.add(nuevaConcesionaria);
    }

    private Concesionaria buscarConcesionaria(String nombreC) {
        int contC = 0;
        Concesionaria auxC = null;

        while (contC < cantidadConcesionarias() && auxC == null) {
            Concesionaria auxC2 = listaConcesionarias.get(contC);
            if (auxC2.getNombreConcesionaria().equalsIgnoreCase(nombreC)) {
                auxC = auxC2;
            }
            contC++;
        }
        return auxC;
    }

    @Override
    public String toString() {
        return "\nMarcaAutomotriz{"
                + "listaConcesionarias=" + listaConcesionarias + '}';
    }

}
