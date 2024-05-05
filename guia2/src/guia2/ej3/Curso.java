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
public class Curso {

    static final int cantidadMinimaExamen = 2;
    private String codigoCurso;
    private String tituloDeCurso;
    private int horasCursada;
    private ArrayList<Alumno> listaAlumnosCurso;

    public boolean agregarAlumnoCurso(Alumno x) {
        boolean aux = false;
        if (x != null) {
            listaAlumnosCurso.add(x);
            aux = true;
        }
        return aux;
    }

    public ArrayList<Alumno> buscarAlumnosPorEncimaDe(int a) {
        ArrayList<Alumno> listAux = new ArrayList<>();
        for (Alumno x : listaAlumnosCurso) {
            if (x.cantidadEvaluaciones() > cantidadMinimaExamen && x.calcularPromedios() > a) {
                listAux.add(x);
            }
        }

        return listAux;
    }
}
