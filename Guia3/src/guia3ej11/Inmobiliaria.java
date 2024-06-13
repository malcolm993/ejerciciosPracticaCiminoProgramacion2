package guia3ej11;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Inmobiliaria implements Interesado {

    private String nombre;
    private String email;
    private double porcentajeComision;
    private ArrayList<Inmueble> listaInmuebles;

    public Inmobiliaria(String nombre, String email, double porcentajeComision) {
        this.nombre = nombre;
        this.email = email;
        this.porcentajeComision = porcentajeComision;
        listaInmuebles = new ArrayList<>();
    }

    @Override
    public void informarCambioDePrecio(String mensaje) {
        System.out.println("He recibido un mail a nuestra casilla " + this.email + "con el mensaje");
        System.out.println(mensaje);
    }

    public String getEmail() {
        return email;
    }

}
