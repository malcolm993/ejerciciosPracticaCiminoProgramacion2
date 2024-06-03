package guia3.ej3;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class CartaConLetra extends CartaConPalo {

    private Letra letra;

    public CartaConLetra(Letra letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "CartaConLetra{" + "letra=" + letra + '}';
    }

    

   

}
