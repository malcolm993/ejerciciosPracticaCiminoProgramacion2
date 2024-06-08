package guia3ej7;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class TrianguloEquilatero extends Figura {

    private double lado;

    public TrianguloEquilatero(double lado, String color) {
        super(color);
        this.lado = lado;

    }

    @Override
    public double calcularPerimetro() {

        return (lado * 3);
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) * lado) / 2;
    }

    @Override
    public void mostrarFigura() {
        System.out.println("Triangulo : "+ "lado: " + lado + "perimetro : "+ calcularPerimetro()+ "área: "+ calcularArea()+ "color : " + getColor());
    }

    

}
