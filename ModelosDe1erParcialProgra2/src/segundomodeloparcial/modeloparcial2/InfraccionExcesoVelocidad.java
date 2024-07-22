package segundomodeloparcial.modeloparcial2;

import java.time.LocalDate;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class InfraccionExcesoVelocidad extends Infraccion {

    private static final int CANTIDADUF = 100;

    public InfraccionExcesoVelocidad(String fecha) {
        super(fecha);

    }

    @Override
    public int getCantUFs() {
        return CANTIDADUF;
    }

    @Override
    public boolean isCaducado() {
        return false;
    }

}
