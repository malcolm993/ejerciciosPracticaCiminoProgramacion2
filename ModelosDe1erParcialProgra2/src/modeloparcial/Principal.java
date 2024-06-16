package modeloparcial;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {
        Atlantis atlantis = new Atlantis();

        PuntosDeAtranque p1 = new PuntosDeAtranque();
        PuntosDeAtranque p2 = new PuntosDeAtranque();
        PuntosDeAtranque p3 = new PuntosDeAtranque();
        PuntosDeAtranque p4 = new PuntosDeAtranque();
        PuntosDeAtranque p5 = new PuntosDeAtranque();

        TipoCargo n1 = new TipoCargo("Baterias Recargables", 120, "Neptuno", 21);
        TipoCargo n2 = new TipoCargo("Sustancias Cosmicas", 90, "Marte", 15);
        TipoCruiser n3 = new TipoCruiser(0, "Mercurio", 8);
        TipoCruiser n4 = new TipoCruiser(12, "Urano", 48);

        atlantis.agregarPuntoDeAparque(p1);
        atlantis.agregarPuntoDeAparque(p2);
        atlantis.agregarPuntoDeAparque(p3);
        atlantis.agregarPuntoDeAparque(p4);
        atlantis.agregarPuntoDeAparque(p5);
        
        
        
        atlantis.estacionarNave(n1);
        atlantis.estacionarNave(n2);
        atlantis.estacionarNave(n3);
        atlantis.estacionarNave(n4);
        
        
        
        

        atlantis.mostrarManifestos();

    }

}
