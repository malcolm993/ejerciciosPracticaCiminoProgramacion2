package guia2.ej8;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {

        Pieza p1 = new Pieza("Batería de litio");
        Pieza p2 = new Pieza("Sensor de acercamiento");
        Pieza p3 = new Pieza("Visor nocturno");
        Pieza p4 = new Pieza("Bomba neumatica");
        Pieza p5 = new Pieza("Tornilleria");
        Pieza p6 = new Pieza("Memoria");
        Pieza p7 = new Pieza("Cables");
        Pieza p8 = new Pieza("Gps");
        Pieza p9 = new Pieza("Engranaje");

        Droide d1 = new Droide();
        Droide dr2 = new Droide();
        Droide dr3 = new Droide();

        dr3.agregarListaPiezasOp(p1);
        dr3.agregarListaPiezasOp(p1);
        dr3.agregarListaPiezasOp(p1);

        dr2.agregarListaPiezasOp(p1);
        dr2.agregarListaPiezasOp(p2);
        

        d1.agregarListaDroidesRotos(dr2);
        d1.agregarListaDroidesRotos(dr3);

        d1.agregarListaPiezasOp(p3);
        d1.agregarListaPiezasOp(p4);
        d1.agregarListaPiezasNoOp(p1);
        d1.agregarListaPiezasNoOp(p2);
        d1.agregarListaPiezasNoOp(p5);

        System.out.println(d1.autoRepararse());

    }

}
