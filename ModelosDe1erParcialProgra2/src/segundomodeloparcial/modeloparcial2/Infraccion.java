package segundomodeloparcial.modeloparcial2;

import java.time.LocalDate;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public abstract class Infraccion implements Caducidad {

    private LocalDate fecha;
    private static double unidadFija = 60.5;

    public Infraccion(String fecha) {
        this.fecha = LocalDate.parse(fecha);

    }

    public LocalDate getFecha() {
        return fecha;
    }


    public abstract int getCantUFs();
    
    public double calcularImporte() {
        return Infraccion.unidadFija * getCantUFs();
    }

 

}
