package guia2.ej8;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Droide {

    ArrayList<Pieza> listaPiezaNoOperativos;
    private ArrayList<Pieza> listaPiezasOperativos;
    private ArrayList<Droide> droidesRotos;

    public Droide() {
        listaPiezaNoOperativos = new ArrayList<>();
        listaPiezasOperativos = new ArrayList<>();
        droidesRotos = new ArrayList<>();
    }
    
    public ResultadoReparacion autoRepararse() {
        ResultadoReparacion res = ResultadoReparacion.COMPLETAMENTE_OPERATIVO;
        
        if (!this.listaPiezaNoOperativos.isEmpty()){
            res = repararme();
        }
        return res;
    }

    private ResultadoReparacion repararme() {
        ResultadoReparacion res = ResultadoReparacion.REPARACION_IMPOSIBLE;
        if (efectuarReparacion()> 0){
            res= ResultadoReparacion.REPARACION_PARCIAL;
        }
        return res ;
    }

    private int efectuarReparacion() {
        int cantP=0;
        for ( Pieza p : this.listaPiezaNoOperativos){
            boolean sePudoRep = reparar (p);
            if (sePudoRep){
                cantP++;
            }
        }
        return cantP;
    }
    
    private boolean reparar(Pieza rota){
        boolean reparada = false;
        int i = 0;
        
        while ( i < droidesRotos.size() && ! reparada ){
            Droide d = droidesRotos.get(i);
            Pieza  x = d.sacarPiezaOp(rota.getNombre()); 
            if (x != null){
                reparada = true;
                listaPiezaNoOperativos.remove(rota);
                listaPiezasOperativos.add(rota);
            }
        }
        
        return reparada;
    }
    
    private Pieza sacarPiezaOp( String nom){
        Pieza p = null;
        int c =0;
        
        while ( c < listaPiezasOperativos.size() && p != null ){
            Pieza aux = listaPiezasOperativos.get(c);
            if (aux.getNombre().equalsIgnoreCase(nom)){
                p = aux;
                listaPiezasOperativos.remove(p);
                
            }
            c++;
            
        }
        return p; 
    }
    
    
    private void agregarListaDroidesRotos( Droide x){
        if ( x != null){
            droidesRotos.add(x);
        }
    }

}
