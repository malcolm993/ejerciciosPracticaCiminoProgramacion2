package guia3ej8;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public abstract class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Persona(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;

    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public abstract double calcularSalario();

    public abstract void mostrarSalario();

}
