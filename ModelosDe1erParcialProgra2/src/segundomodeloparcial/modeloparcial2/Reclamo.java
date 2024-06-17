package segundomodeloparcial.modeloparcial2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Reclamo {

    private static int contador = 0;
    private String dni;
    private Infraccion infraccionReclamada;
    private int numeroReclamo;

    public Reclamo(String dni, Infraccion infraccionReclamada) {
        contador++;
        this.dni = dni;
        this.infraccionReclamada = infraccionReclamada;
        this.numeroReclamo = contador;
    }

    public String getDni() {
        return dni;
    }

    public Infraccion getInfraccionReclamada() {
        return infraccionReclamada;
    }

    public int getNumeroReclamo() {
        return numeroReclamo;
    }

    public void mostrarImporteTotalAPagar() {
        System.out.println("La cantidad total a pagar del reclamo n°" + this.numeroReclamo + " es de :" + infraccionReclamada.calcularImporte());
    }

}
