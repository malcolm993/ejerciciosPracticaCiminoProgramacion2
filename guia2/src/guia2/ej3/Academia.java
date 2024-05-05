/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2.ej3;

import java.beans.Customizer;
import java.util.ArrayList;

/**
 *
 * @author santiago
 */
public class Academia {

    private ArrayList<Curso> listaCursosAcademiia;

    public Academia() {
        this.listaCursosAcademiia = new ArrayList<>();
    }

    public boolean agregarCursoAcademia(Curso x) {
        boolean aux = false;
        if (x != null) {
            listaCursosAcademiia.add(x);
            aux = true;
        }
        return aux;
    }

}
