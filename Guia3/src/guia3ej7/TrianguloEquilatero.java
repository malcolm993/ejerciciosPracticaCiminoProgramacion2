package guia3ej7;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class TrianguloEquilatero extends Figura {

    private double altura;
    private double base;

    public TrianguloEquilatero(double altura, double base, String color) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularPerimetro() {

        return (base * 3);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

}
