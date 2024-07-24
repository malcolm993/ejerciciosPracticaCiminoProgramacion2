package guia3.ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioReparacion extends Servicio {
     private final int VALOR_MIN_DIF=3;
     private final int PORCENTAJE_DIF=25; 
     private static final int VALOR_HORA_REP = 180;
     private int nivelDificultad;

    public ServicioReparacion(int cantidadHorasServicio ,int nivelDificultad) {
        super(cantidadHorasServicio);
        this.nivelDificultad = nivelDificultad;
        
    }

//    private void validacion
    
    
    @Override
    public double montoDeFacturacion() {
        return (new Matematica().sumarPorcentaje(calcularMonto(), IVA/21));
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    @Override
    public double calcularMonto() {
        
        double aux;
        aux= this.getCantidadHorasServicio()*VALOR_HORA_REP;
        if(this.nivelDificultad > VALOR_MIN_DIF){
            //aux= aux+(aux*PORCENTAJE_DIF/100);
            aux = (new Matematica().sumarPorcentaje(aux,PORCENTAJE_DIF ));
        }
        
        return aux;
    }

}