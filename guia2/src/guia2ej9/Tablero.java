package guia2ej9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Tablero {

    private ArrayList<Llave> listaDeLlaves;

    public Tablero() {
        
        listaDeLlaves= new ArrayList<>();
    }
    
    public void agregarLlaveATablero(Llave llaveVehiculoEstacionado){
        listaDeLlaves.add(llaveVehiculoEstacionado);
    }

    public Llave devolverLlave(String patente ) {
        Llave encontrada = null;
        int cont=0;
        while(encontrada == null && cont < listaDeLlaves.size()){
            Llave aux= listaDeLlaves.get(cont);
            if(aux.getEtiquetaPatente().equalsIgnoreCase(patente)){
                encontrada = aux;
            }
            cont++;
        }
        return encontrada;
    }

}