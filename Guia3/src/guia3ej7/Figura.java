package guia3ej7;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public String getColor() {
        return color;
    }
    
    

    public abstract void mostrarFigura();
}
