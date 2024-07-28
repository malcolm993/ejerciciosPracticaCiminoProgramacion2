package guia3ej10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class FuenteDeProgramacion extends Fuente {

    private LenguajeProgra tipoDeLenguage;
    private ArrayList<Metodo> listaMetodosProgra;

    public FuenteDeProgramacion(String nombre, String ubicacion ,LenguajeProgra tipoDeLenguage) {
        super(nombre, ubicacion);
        this.tipoDeLenguage = tipoDeLenguage;
        listaMetodosProgra = new ArrayList<>();
    }

    
    
    public void agregarMetodo (Metodo x){
        listaMetodosProgra.add(x);
    }
    
    private double totalSumaIndiceCalidadMetodos(){
        double total=0.0;
        for (Metodo m : listaMetodosProgra) {
            total += m.indiceDeCalidad();
        }
        
        return total;
    }
    
    private int cantidadDeMetodos(){
        return listaMetodosProgra.size();
    }

    @Override
    //Fuentes de programación: promedio de índice de calidad de sus métodos.
    public double indiceDeCalidad() {       
        return totalSumaIndiceCalidadMetodos()/cantidadDeMetodos();
    }
    
    public Metodo busquedaMetodo(String nombreDeMetodo){
        Metodo encontrado = null;
        int  cont=0;
        
        while(cont < listaMetodosProgra.size() & encontrado == null){
            Metodo aux= listaMetodosProgra.get(cont);
            if(aux.getNombre().equalsIgnoreCase(nombreDeMetodo)){
                
                encontrado = aux;
            }
            
            cont++;
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "\n\nFuentesDeProgramacion{" + 
                "\ntipoDeLenguage=" + tipoDeLenguage + 
                "\n, listaMetodosProgra=" + listaMetodosProgra + '}';
    }
    

}   