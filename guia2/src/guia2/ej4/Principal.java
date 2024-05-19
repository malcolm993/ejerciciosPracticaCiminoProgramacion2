package guia2.ej4;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {
        Automovil a1 = new Automovil("ABC123", 10000, TipoDeAutomovil.AUTO);
        Automovil a2 = new Automovil("DEF456", 15000, TipoDeAutomovil.CAMIONETA);
        Automovil a3 = new Automovil("GHI789", 40000, TipoDeAutomovil.UTILITARIO);
        Automovil a4 = new Automovil("JKL123", 8000, TipoDeAutomovil.AUTO);
        Automovil a5 = new Automovil("MNO456", 2300, TipoDeAutomovil.CAMIONETA);
        Automovil a6 = new Automovil("PQR789", 50000, TipoDeAutomovil.UTILITARIO);
        Automovil a7 = new Automovil("STU321", 12000, TipoDeAutomovil.AUTO);
        Automovil a8 = new Automovil("VWX654", 17000, TipoDeAutomovil.UTILITARIO);
        Automovil a9 = new Automovil("YZZ987", 13000, TipoDeAutomovil.AUTO);

        Concesionaria c1 = new Concesionaria("CONCESIONARIA BUENOS AIRES");
        Concesionaria c2 = new Concesionaria("TODO VEHICULO");

        MarcaAutomotriz m1 = new MarcaAutomotriz();

        System.out.println(m1.toString());

        m1.agregarConcesionaria(c2);
        m1.agregarConcesionaria(c1);

        c1.agregarAutomovilLista(a9);
        c1.agregarAutomovilLista(a8);
        c1.agregarAutomovilLista(a7);
        c1.agregarAutomovilLista(a6);
        c2.agregarAutomovilLista(a5);
        c2.agregarAutomovilLista(a4);
        c2.agregarAutomovilLista(a3);

        //System.out.println(m1.toString());
        System.out.println(" cantidad de Autos en concesionaria TODO VEHICULO " + c2.mostrarVehiculos(TipoDeAutomovil.AUTO));

        System.out.println(m1.toString());

        System.out.println("Concesionaria/s con maxima cantidad de vehiculos" + m1.obtenerConcesionariaMaxVeh());

        System.out.println( "SE ELIMINO EL SIGUIENTE VEHICULO " + m1.borrarVehiculoConcesionaria("GHI789"));

        System.out.println(m1.toString());

        System.out.println(m1.cambiarVehiculoConcesionaria("CONCESIONARIA BUENOS AIRES", "JKL123"));

        System.out.println(m1.toString());
    }

}
