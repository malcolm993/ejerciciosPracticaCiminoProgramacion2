/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2.ej3;

import java.util.ArrayList;

/**
 *
 * @author santiago
 */
public class Alumno {

    private String nombre;
    private String dni;
    private ArrayList<Evaluacion> listaDeEvaluacionAlumno;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.listaDeEvaluacionAlumno = new ArrayList<>();
    }

    public double calcularPromedios() {
        double promedio = 0;
        for (Evaluacion e : listaDeEvaluacionAlumno) {
            promedio = promedio + e.getNotaExamen();
        }

        promedio = promedio / listaDeEvaluacionAlumno.size();
        return promedio;
    }

    public boolean agregarExamenAlumno(Evaluacion x) {
        boolean aux = false;
        if (x != null) {
            listaDeEvaluacionAlumno.add(x);
            aux = true;
        }
        return aux;

    }

    public int cantidadEvaluaciones() {

        return listaDeEvaluacionAlumno.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", listaDeEvaluacionAlumno=" + listaDeEvaluacionAlumno + '}';
    }

}
