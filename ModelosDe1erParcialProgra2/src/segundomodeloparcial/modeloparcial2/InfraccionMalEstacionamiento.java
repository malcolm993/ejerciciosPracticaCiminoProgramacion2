package segundomodeloparcial.modeloparcial2;

import java.time.LocalDate;
import java.time.Period;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class InfraccionMalEstacionamiento extends Infraccion {

    private static final double montoFijo = 300;
    private static final int cantidadUF = 20;

    public InfraccionMalEstacionamiento(String fecha) {
        super(fecha);

    }


//    private void verificarCaducada() {
//        if (condicionCaducada()) {
//            cambioIsCaducada();
//        }
//    }
//    private boolean condicionCaducada() {
//        Period p = Period.between(getFecha(), LocalDate.now());
//        int anios = p.getYears();
////        System.out.println("cantidad de anios " + anios);
//        return anios >= 1;
//    }
    @Override
    public boolean isCaducado() {
        Period p = Period.between(getFecha(), LocalDate.now());
        int anios = p.getYears();
        return anios >= 1;

    }

    @Override
    public int getCantUFs() {
        return cantidadUF;
    }

    @Override
    public double calcularImporte() {
        return super.calcularImporte() + montoFijo;
    }

    
    
}
