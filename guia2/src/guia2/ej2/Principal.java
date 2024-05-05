package guia2.ej2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {
        Inmueble inm1 = new Inmueble("Nazca 10", 300000.00, TipoDeInmueble.DEPARTAMENTO, Barrio.RECOLETA);
        Inmueble inm2 = new Inmueble("Mariano Acosta 870", 300000.00, TipoDeInmueble.CASA, Barrio.BELGRANO);
        Inmueble inm3 = new Inmueble("Av Forest 45", 150000.00, TipoDeInmueble.PH, Barrio.BELGRANO);

        Inmobiliaria mobiliaria = new Inmobiliaria();
        mobiliaria.cargarInmueble(inm1);
        mobiliaria.cargarInmueble(inm2);
        mobiliaria.cargarInmueble(inm3);

        System.out.println(mobiliaria.toString());

        System.out.println("el promedio del valor de lso inmuebles " + mobiliaria.promedioDePrecio());

        System.out.println("Propiedades economicas :  " + mobiliaria.propiedadesMasEconomicas());
        
        System.out.println("Propiedades segun tipo : "+ mobiliaria.cantidadDePropiedadesSegunTipo(TipoDeInmueble.DEPARTAMENTO));
    }

}
