package guia3ej8;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class AppInf {

    private ArrayList<Persona> listaPersonal;

    public AppInf() {
        this.listaPersonal = new ArrayList<>();
    }

    public void agregarPersonal(Persona x) {
        this.listaPersonal.add(x);
    }

    public void mostrarSalarios() {
        for (Persona p : listaPersonal) {
            p.mostrarSalario();
        }
    }

    public void empleadoConMasClientes() {
        int cant = 0;
        Persona p1 = null;
        for (Persona p : listaPersonal) {
            if (cantClientesPersonalComision(p) > cant) {
                p1 = p;
                cant = cantClientesPersonalComision(p);
            }

        }

        System.out.println("Empleado con mayor cantidad de clientes : " + p1.getNombre() + " " + p1.getApellido() + " cantidad de Clientes : " + cant);
    }

    private int cantClientesPersonalComision(Persona x) {
        int a = 0;
        if (x instanceof PersonalAComision) {
            a = ((PersonalAComision) x).getNumeroClientes();
        }
        return a;
    }

}
