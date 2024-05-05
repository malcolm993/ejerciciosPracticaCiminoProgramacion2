/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2.ej3;

/**
 *
 * @author santiago
 */
public class Evaluacion {
    
    private TipoDeExamen examenTipo;
    private double notaExamen;

    public Evaluacion(TipoDeExamen examenTipo, double notaExamen) {
        this.examenTipo = examenTipo;
        this.notaExamen = notaExamen;
    }

    public TipoDeExamen getExamenTipo() {
        return examenTipo;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "examenTipo=" + examenTipo + ", notaExamen=" + notaExamen + '}';
    }
    
    
}
