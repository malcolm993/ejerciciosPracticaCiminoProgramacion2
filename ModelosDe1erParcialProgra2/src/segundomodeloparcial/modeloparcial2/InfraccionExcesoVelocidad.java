package segundomodeloparcial.modeloparcial2;

import java.time.LocalDate;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class InfraccionExcesoVelocidad extends Infraccion {

    private final int cantidadUF = 100;

    public InfraccionExcesoVelocidad(String fecha) {
        super(fecha);
        setImporte(calcularImporte());

    }

    @Override
    public double calcularImporte() {
        return getUnidadFija() * cantidadUF;
    }

}
