package guia3ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Matematica {

    public double sumarPorcentaje(double valor, int porcentaje) {
        double total;
        total = valor + (valor* porcentaje/100);
        return total;
    }

}