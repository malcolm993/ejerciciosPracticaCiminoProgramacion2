package guia3ej7;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Circunferencia extends Figura {

    private double radio;

    public Circunferencia(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * radio * Math.PI;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(radio, 2.0));
    }

}
