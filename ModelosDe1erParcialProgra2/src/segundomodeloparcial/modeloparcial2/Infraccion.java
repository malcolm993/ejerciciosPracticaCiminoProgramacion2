package segundomodeloparcial.modeloparcial2;

import java.time.LocalDate;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public abstract class Infraccion {

    private LocalDate fecha;
    private boolean caducada = false;
    private double importe;
    private double unidadFija = 60.5;

    public Infraccion(String fecha) {
        this.fecha = LocalDate.parse(fecha);

    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getUnidadFija() {
        return unidadFija;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public abstract double calcularImporte();

    public void cambioIsCaducada() {
        caducada = !caducada;
    }

    public boolean isCaducada() {
        return caducada;
    }

}
