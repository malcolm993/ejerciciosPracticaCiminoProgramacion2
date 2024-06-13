package guia3ej11;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {
    
    public static void main(String[] args) {
        Inmueble in1 = new Inmueble("Av Jujuy 400", 62, 3, 30000);
        Inmueble in2 = new Inmueble("Av Entre Rios 520", 40, 3, 45000);
        Inmueble in3 = new Inmueble("Av Santa Fe 3201", 55, 2, 26000);
        
        Inmobiliaria inmb1 = new Inmobiliaria("Propiedades Ya", "py@yahoo.com.ar", 15);
        Inmobiliaria inmb2 = new Inmobiliaria("ArgenProp", "AP@yahoo.com.ar", 13);
        Inmobiliaria inmb3 = new Inmobiliaria("Malito Hns", "malHer@yahoo.com.ar", 25);
        
        Cliente c1 = new Cliente("Gomez", "Pepe", "46464646", "pepeGon@yahoo.com.ar");
        Cliente c2 = new Cliente("Perez", "Andres", "89898989", "andPer@yahoo.com.ar");
        Cliente c3 = new Cliente("Lopez", "Jose", "56565665", "joseLop@yahoo.com.ar");
        
        in1.agregarInteresadoLista(c3);
        in1.agregarInteresadoLista(c2);
        in1.agregarInteresadoLista(inmb1);
        in1.agregarInteresadoLista(inmb2);
        
        in1.cambioDePrecio(28000);
    }
    
}
