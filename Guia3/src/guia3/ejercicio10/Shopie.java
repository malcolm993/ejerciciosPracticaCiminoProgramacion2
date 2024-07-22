package guia3.ejercicio10;

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
    
    private void generarInformesDeCalidad (){
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
        while(flag == false & cont < listaDeProgramas.size() ){
            Programa aux = listaDeProgramas.get(cont);
            if(aux == buscado){
                flag = true;
            }
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
        for (Programa p : lista) {
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