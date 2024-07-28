package juegoUTNFIGHT;

import java.util.Random;

public class Guerrero extends Personaje {
    private final static int VIDA_MINIMO= 20;
    private double fuerza;

    public Guerrero(String nombre, double fuerza) {
        super(nombre);
        this.fuerza = fuerza;
    }

    public double ataque() {
//        int vidaPorDebajoDe = 20; // Que lo calcule Java
        double incrementoFuerza = 0.1;
        if (getPuntosVida() < VIDA_MINIMO) {
            fuerza += fuerza * incrementoFuerza; // Incrementa la fuerza en un 10%
        }
        return fuerza;
    }

}