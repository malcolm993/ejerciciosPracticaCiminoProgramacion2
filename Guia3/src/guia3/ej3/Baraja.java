package guia3.ej3;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Baraja {

    private ArrayList<Carta> listaCartas;

    public Baraja() {
       this.listaCartas = new ArrayList<>();
       generarCartas();
    }

    private void generarCartas() {
        generarJokers();
        generarCartasRestantes();
        System.out.println("cantidad de cartas: " + this.listaCartas.size());
    }
    
    private void generarJokers(){
        CartaJoker colorida = new CartaJoker(true);
        CartaJoker blancoNegro = new CartaJoker(false);
        this.listaCartas.add(colorida);
        this.listaCartas.add(blancoNegro);
    }
    
    private void generarCartasRestantes(){
        Palo[] palos = Palo.values();
        for(Palo p:palos){
            generarCartasConLetra(p);
            generarCartasConNumero(p);
        }
    }
    
    private void generarCartasConLetra(Palo x){
        Letra[] letrasGenerar = Letra.values();
        for (int i = 0; i < letrasGenerar.length; i++){
            this.listaCartas.add(new CartaConLetra(letrasGenerar[i], x)); 
        }
    }
    
    private void generarCartasConNumero(Palo p){
        for (int i = 2; i <= 10 ; i++){
            this.listaCartas.add(new CartaNumerica(i, p));
        }
    }
    
    public void mostrarTodasLasCartas(){
        
    }
    
    
}
