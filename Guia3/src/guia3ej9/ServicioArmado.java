package guia3ej9;

import java.math.MathContext;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioArmado extends Servicio {
    
    private static final int VALOR_HORA_ARMADO = 250;
    

    public ServicioArmado(int cantidadHorasServicio) {
        super(cantidadHorasServicio);
    }
    
    

    @Override
    public double montoDeFacturacion() {
        return (new Matematica().sumarPorcentaje(calcularMonto(), IVA/21));
        
    }

    @Override
    public double calcularMonto() {
        return (this.getCantidadHorasServicio()* VALOR_HORA_ARMADO);
    }

}