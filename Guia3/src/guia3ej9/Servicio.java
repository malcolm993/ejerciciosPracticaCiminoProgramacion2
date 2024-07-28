package guia3ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Servicio implements Facturable {

    private int cantidadHorasServicio;
    
    

    public Servicio(int cantidadHorasServicio) {
        this.cantidadHorasServicio = cantidadHorasServicio;
    }

    public int getCantidadHorasServicio() {
        return cantidadHorasServicio;
    }
    
    public abstract double calcularMonto();
    

}