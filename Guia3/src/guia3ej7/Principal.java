package guia3ej7;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {
        Circunferencia f1 = new Circunferencia(25, "Rojo");
        Rectangulo f2 = new Rectangulo(3, 2, "blanco");
        TrianguloEquilatero f3 = new TrianguloEquilatero(5, "verde");

        GrupoDeFiguras g = new GrupoDeFiguras();

        g.agregarFigura(f1);
        g.agregarFigura(f2);
        g.agregarFigura(f3);

        g.mostrarInfoFiguras();

    }

}
