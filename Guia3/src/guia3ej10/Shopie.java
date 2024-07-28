package guia3ej10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Shopie {

    private ArrayList<Programa> listaDeProgramas;
    private ArrayList<Informe> listaInformesDePrograma;

    public Shopie() {
        
        listaDeProgramas = new ArrayList<>();
        listaInformesDePrograma = new ArrayList<>();
    }
    
    public void generarInformesDeCalidad (){
        for (Programa p : listaDeProgramas) {
            if(!siSeGeneroInforme(p)){
                Informe nuevo = new Informe(p);
                agregarInformeLista(nuevo);
                
            }
        }
    
    }
    
    private boolean siSeGeneroInforme( Programa buscado){
        int cont = 0;
        boolean flag = false;
        while(flag == false & cont < listaInformesDePrograma.size() & listaInformesDePrograma.size()>0 ){
            Programa aux = listaInformesDePrograma.get(cont).getProgramaInformado();
            if(aux == buscado){
                flag = true;
            }
            cont++;
        }
        return flag;
            
    }

    public void informeIndiceCalidadProgramas() {
        for (Informe i : listaInformesDePrograma) {
            i.mostrarInformePrograma();
        }
    }
    
    public void agregarProgramaAShopie(Programa x){
        listaDeProgramas.add(x);
    }

    public ArrayList<Programa> programasPorDebajoDe(int numeroFiltro ) {
        ArrayList<Programa> lista = new ArrayList<>();
        for (Programa p : listaDeProgramas) {
            if (p.indiceDeCalidad()< numeroFiltro ){   
                lista.add(p);
            }        
        }   
        return lista;
    }
    
    private void agregarInformeLista(Informe nuevo){
        listaInformesDePrograma.add(nuevo);
    } 
         

}