package segundomodeloparcial.modeloparcial2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        InfraccionExcesoVelocidad i1 = new InfraccionExcesoVelocidad("2024-05-01");
        InfraccionExcesoVelocidad i2 = new InfraccionExcesoVelocidad("2025-06-01");
        InfraccionMalEstacionamiento i3 = new InfraccionMalEstacionamiento("2023-01-01");
        InfraccionMalEstacionamiento i4 = new InfraccionMalEstacionamiento("2025-03-01");

        Reclamo r1 = new Reclamo("12121212", i1);
        Reclamo r2 = new Reclamo("45454545", i2);
        Reclamo r3 = new Reclamo("98989898", i3);
        Reclamo r4 = new Reclamo("82828282", i4);

        sistema.agregarReclamoALista(r1);
        sistema.agregarReclamoALista(r2);
        sistema.agregarReclamoALista(r3);
        sistema.agregarReclamoALista(r4);

        sistema.mostrarCantidadInfraccionCaducada();

        sistema.mostrarImporteTotalReclamos();
    }

}
