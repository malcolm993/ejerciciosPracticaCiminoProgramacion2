package guia2.ej8;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Droide {

    private ArrayList<Pieza> listaPiezaNoOperativos;
    private ArrayList<Pieza> listaPiezasOperativos;
    private ArrayList<Droide> droidesRotos;

    public Droide() {
        listaPiezaNoOperativos = new ArrayList<>();
        listaPiezasOperativos = new ArrayList<>();
        droidesRotos = new ArrayList<>();
    }

    public ResultadoReparacion autoRepararse() {
        ResultadoReparacion res = ResultadoReparacion.COMPLETAMENTE_OPERATIVO;

        if (!this.listaPiezaNoOperativos.isEmpty()) {
            System.out.println("hasta aca bien 1");
            res = repararme();
        }
        return res;
    }

    private ResultadoReparacion repararme() {
        System.out.println("hasta aca bien 2");
        ResultadoReparacion res = ResultadoReparacion.REPARACION_IMPOSIBLE;
        if (efectuarReparacion() > 0) {
            res = ResultadoReparacion.REPARACION_PARCIAL;

        }
        return res;
    }

    private int efectuarReparacion() {
        int cantP = 0;
        //modificar for each por while

        System.out.println("hasta aca bien 3");
        
        while( cantP < this.listaPiezaNoOperativos.size() ){
            Pieza auxPieza = this.listaPiezasOperativos.get(cantP);
            boolean sePudoRep = reparar(auxPieza);
            if (sePudoRep){
                cantP++;
            }
        }
//        for (Pieza p : this.listaPiezaNoOperativos) {
//            boolean sePudoRep = reparar(p);
//            if (sePudoRep) {
//                cantP++;
//            }
//        }
        return cantP;
    }

    private boolean reparar(Pieza rota) {
        boolean reparada = false;
        int i = 0;
        System.out.println("hasta aca bien 4");
        while (i < droidesRotos.size() && !reparada) {
            Droide d = droidesRotos.get(i);
            Pieza x = d.sacarPiezaOp(rota.getNombre());
            if (x != null) {
                reparada = true;
                listaPiezaNoOperativos.remove(rota);
                listaPiezasOperativos.add(rota);
            }
            i++;
        }

        return reparada;
    }

    public ArrayList<Pieza> getListaPiezaNoOperativos() {
        return listaPiezaNoOperativos;
    }

    public ArrayList<Pieza> getListaPiezasOperativos() {
        return listaPiezasOperativos;
    }

    private Pieza sacarPiezaOp(String nom) {
        Pieza p = null;
        int c = 0;
        System.out.println("longitud de las piezas Op :" + listaPiezasOperativos.size());
        while (c < listaPiezasOperativos.size() && p == null) {
            System.out.println("hasta aca bien 5");
            Pieza aux = listaPiezasOperativos.get(c);
            if (aux.getNombre().equalsIgnoreCase(nom)) {
                p = aux;
                listaPiezasOperativos.remove(aux);

            }
            c++;

        }
        return p;
    }

    public void agregarListaDroidesRotos(Droide x) {
        if (x != null) {
            droidesRotos.add(x);
        }
    }

    public void agregarListaPiezasNoOp(Pieza x) {
        if (x != null) {
            listaPiezaNoOperativos.add(x);
        }
    }

    public void agregarListaPiezasOp(Pieza x) {
        if (x != null) {
            listaPiezasOperativos.add(x);
        }
    }

}
