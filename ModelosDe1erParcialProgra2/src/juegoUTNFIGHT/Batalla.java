package juegoUTNFIGHT;

import java.util.ArrayList;

public class Batalla {
    private ArrayList<Jugador> participantes;
    private int ronda;

    public Batalla(Jugador j1, Jugador j2) {
        this.participantes = new ArrayList<>();
        agregarParticipante(j1);
        agregarParticipante(j2);
        this.ronda = 0;
    }

    public void agregarParticipante(Jugador j) {
        participantes.add(j);
    }
    

    public void iniciar(){
        Jugador jAtacante = participantes.get(0);
        Jugador jDefensor = participantes.get(1);
        
        // Que el jugador le diga a su personaje las mismas acciones que pedimos acá
        // (ataque, defensa, estaVivo, etc.) para evitar poner el getter todo el tiempo.
        jDefensor.getPersonajeFavorito().defensa(jAtacante.getPersonajeFavorito().ataque());
        
        while (jDefensor.getPersonajeFavorito().estaVivo()) {
            
            Jugador aux = jAtacante;
            jAtacante = jDefensor;
            jDefensor = aux;
            
            jDefensor.getPersonajeFavorito().defensa(jAtacante.getPersonajeFavorito().ataque());
        }
        System.out.println("Gano " + jAtacante + " y perdio " + jDefensor);
        reiniciarPuntosVida(participantes);
        actualizarPartidas(jAtacante, jDefensor);
    }

 
    private void actualizarPartidas(Jugador jGanador, Jugador jPerdedor){
        jGanador.añadirPartida( new Partida(jPerdedor, Resultado.VICTORIA) );
        jPerdedor.añadirPartida( new Partida(jGanador, Resultado.DERROTA) );
    }


    private void reiniciarPuntosVida(ArrayList<Jugador> participantes){
        for (Jugador j : participantes) {
            j.getPersonajeFavorito().reiniciar();
        }
    }
}
