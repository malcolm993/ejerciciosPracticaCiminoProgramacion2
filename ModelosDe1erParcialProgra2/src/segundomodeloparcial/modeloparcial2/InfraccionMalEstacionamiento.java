package segundomodeloparcial.modeloparcial2;

import java.time.LocalDate;
import java.time.Period;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class InfraccionMalEstacionamiento extends Infraccion {

    private final double montoFijo = 300;
    private final int cantidadUF = 20;

    public InfraccionMalEstacionamiento(String fecha) {
        super(fecha);
        setImporte(calcularImporte());
        verificarCaducada();
    }

    @Override
    public double calcularImporte() {
        return (getUnidadFija() * cantidadUF) + montoFijo;
    }

    private void verificarCaducada() {
        if (condicionCaducada()) {
            cambioIsCaducada();
        }
    }

    private boolean condicionCaducada() {
        Period p = Period.between(getFecha(), LocalDate.now());
        int anios = p.getYears();
//        System.out.println("cantidad de anios " + anios);
        return anios >= 1;
    }

}
