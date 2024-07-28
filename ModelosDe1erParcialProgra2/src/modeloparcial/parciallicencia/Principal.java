package modeloparcial.parciallicencia;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        
       Prototipo pro = new Prototipo();
       
       Persona p1 = new Persona("45454545", "Santiago", "Lopez");
       Persona p2 = new Persona("89898989", "javier", "rodriguez");
       Persona p3 = new Persona("12121212", "roberto", "fernendez");
       Persona p4 = new Persona("56565656", "james", "Perez");
       
       Circuito c1 = new Circuito(45, 1);
       Circuito c2 = new Circuito(64, 1);
       Circuito c3 = new Circuito(22, 3);
       Circuito c4 = new Circuito(90, 0);
       Circuito c5 = new Circuito(120, 1);
       Circuito c6 = new Circuito(62, 0);
       Circuito c7 = new Circuito(420, 3);
       
       Auto a1 = new Auto(3, "ABC123", "FIAT", 1600);
       Auto a2 = new Auto(5, "RTY", "FORD", 1200);
       Auto a3 = new Auto(3, "KLH", "VW", 2300);
       
       Moto m1 = new Moto(true, "EFG456", "HONDA", 250);
       Moto m2 = new Moto(false, "VBN789", "ZANELLA", 110);
       Moto m3 = new Moto(true, "IOP896", "HARLEY", 600);
       
       ExamenMoto em1= new ExamenMoto("05-05-2024", p1, m1);
       ExamenMoto em2= new ExamenMoto("02-09-2024", p2, m2);
       
       em1.agregarCircuitoMoto(c1);
       em1.agregarCircuitoMoto(c2);
       em2.agregarCircuitoMoto(c3);
       em2.agregarCircuitoMoto(c4);       
       
       ExamenAuto ea1 = new ExamenAuto(c7, "02-06-2021", p4, a3);
       ExamenAuto ea2 = new ExamenAuto(c6, "06-04-2023", p3, a2);
       
       pro.agregarExamen(ea2);
       pro.agregarExamen(ea1);
       pro.agregarExamen(em1);
       pro.agregarExamen(em2);
       
        System.out.println(pro.ObtenerInforme());
   
       
       
       
       
       
    }

}