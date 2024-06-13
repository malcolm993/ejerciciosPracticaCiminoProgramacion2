package guia3ej11;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Cliente implements Interesado {

    private String apellido;
    private String nombre;
    private String telefono;
    private String email;

    public Cliente(String apellido, String nombre, String telefono, String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public void informarCambioDePrecio(String mensaje) {
        System.out.println("He recibido un SMS en mi teléfono " + this.telefono + " con el mensaje:");
        System.out.println(mensaje);

    }

    public String getTelefono() {
        return telefono;
    }

}
