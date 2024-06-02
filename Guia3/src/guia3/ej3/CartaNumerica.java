package guia3.ej3;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CartaNumerica extends CartaConPalo {

    private int valorNumero;

    public CartaNumerica(int valorNumero, Palo palo1) {
        super(palo1);
        this.valorNumero = valorNumero;
    }

    

    public void setValorNumero(int valorNumero) {
        this.valorNumero = valorNumero;
    }
    

}