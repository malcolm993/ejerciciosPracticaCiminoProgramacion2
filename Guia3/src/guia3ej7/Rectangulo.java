package guia3ej7;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Rectangulo extends Figura {

    private double altura;
    private double base;

    public Rectangulo(double altura, double base, String color) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void mostrarFigura() {
System.out.println("Rectangulo : "+ "altura: " + altura+ "base: "+ base + "perimetro : "+ calcularPerimetro()+ "área: "+ calcularArea()+ "color : " + getColor());    }

   
}
