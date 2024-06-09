package guia3ej8;

import java.time.Year;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {
//        int x = Year.now().getValue();
//        
//        System.out.println("año en variable : " + x);

        AppInf app = new AppInf();

        PersonalAComision p1 = new PersonalAComision(10, 5000, "12121212", "Fernanado", "Dominguez", 2015);
        PersonalAComision p2 = new PersonalAComision(6, 3500, "45454545", "Luis", "Meltrozo", 2020);
        PersonalAComision p3 = new PersonalAComision(2, 4000, "89898989", "Dario", "Duran", 2005);

        PersonalSalarioFijo p4 = new PersonalSalarioFijo(100000, "65656565", "Santiago", "Lopez", 2019);
        PersonalSalarioFijo p5 = new PersonalSalarioFijo(150000, "74747474", "Marcos", "Diaz", 2001);
        PersonalSalarioFijo p6 = new PersonalSalarioFijo(80000, "36363636", "Sergio", "Melo", 2014);

        app.agregarPersonal(p1);
        app.agregarPersonal(p2);
        app.agregarPersonal(p3);
        app.agregarPersonal(p4);
        app.agregarPersonal(p5);
        app.agregarPersonal(p6);

        app.mostrarSalarios();

        app.empleadoConMasClientes();

    }

}
