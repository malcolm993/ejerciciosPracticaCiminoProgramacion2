package guia3.ej3;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    

    

    public int getValor() {
        
        return 0;
    }

    @Override
    public String toString() {
        return "CartaConPalo{" + "palo=" + palo + '}';
    }

}
