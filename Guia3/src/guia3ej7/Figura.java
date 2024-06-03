package guia3ej7;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Figura {

    
    private String color;
    private double area;
    private double perimetro;

    public Figura (String color) {   
        this.color = color;
    }
    
    

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    

}