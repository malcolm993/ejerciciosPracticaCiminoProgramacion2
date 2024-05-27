package guia2.ej8;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {

        Pieza p1 = new Pieza("Batería de litio");
        Pieza p11 = new Pieza("Batería de litio");
        Pieza p111 = new Pieza("Batería de litio");
        Pieza p2 = new Pieza("Sensor de acercamiento");
        Pieza p22 = new Pieza("Sensor de acercamiento");
        Pieza p222 = new Pieza("Sensor de acercamiento");
        Pieza p3 = new Pieza("Visor nocturno");
        Pieza p33 = new Pieza("Visor nocturno");
        Pieza p4 = new Pieza("Tornilleria ");
        Pieza p44 = new Pieza("Tornilleria");
        Pieza p5 = new Pieza("Cables");
        Pieza p55 = new Pieza("Cables");
        Pieza p6 = new Pieza("Gps");
        Pieza p66 = new Pieza("Gps");

        Droide d1 = new Droide();
        Droide dr2 = new Droide();
        Droide dr3 = new Droide();

        dr3.agregarListaPiezasOp(p111);
        dr3.agregarListaPiezasNoOp(p222);

        dr2.agregarListaPiezasOp(p11);
        dr2.agregarListaPiezasOp(p22);
        dr2.agregarListaPiezasNoOp(p33);

        d1.agregarListaDroidesRotos(dr2);
        d1.agregarListaDroidesRotos(dr3);

        d1.agregarListaPiezasOp(p2);
        d1.agregarListaPiezasOp(p4);
        d1.agregarListaPiezasNoOp(p1);
        d1.agregarListaPiezasNoOp(p3);
        d1.agregarListaPiezasNoOp(p5);

        System.out.println(d1.autoRepararse());

    }

}
