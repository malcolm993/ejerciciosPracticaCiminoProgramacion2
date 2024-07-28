package juegoUTNFIGHT;

import java.util.ArrayList;

public class Jugador {

    private String ID;
    private Personaje personajeFavorito;
    private ArrayList<Partida> partidasJugadas;

    public Jugador(String ID, Personaje personajeFavorito) {
        this.ID = ID;
        this.personajeFavorito = personajeFavorito;
        this.partidasJugadas = new ArrayList<Partida>();
    }

    public String getID() {
        return ID;
    }

    public Resumen getResumenDePartidas() {
        int[] cantsPorResultado = new int[Resultado.values().length];        
        for (Partida partida : partidasJugadas) {
            int idx = partida.getResultado().ordinal();
            cantsPorResultado[idx]++;
        }
        return new Resumen(cantsPorResultado);
    }

    // obtener el personaje favorito
    public Personaje getPersonajeFavorito() {
        return personajeFavorito;
    }

    public void añadirPartida(Partida partida) {
        partidasJugadas.add(partida);
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + '}';
    }
    
    
}