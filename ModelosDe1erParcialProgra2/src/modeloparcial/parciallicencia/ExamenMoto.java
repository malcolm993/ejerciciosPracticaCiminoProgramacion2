package modeloparcial.parciallicencia;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ExamenMoto extends Examen {
    private final static int TIEMPO_LIMITE_CILINDRADA_INF = 120;
    private final static int CLINDRADA_LIMITE = 150;
    private ArrayList<Circuito> listaCircuitos;
    private Moto motoUsada;

    public ExamenMoto(String fecha, Persona personaEvaluada, Moto usada) {
        super(fecha, personaEvaluada);
        listaCircuitos = new ArrayList<>();
        this.motoUsada = usada;
    }
    
    public void agregarCircuitoMoto(Circuito x){
        listaCircuitos.add(x);
                
    }
    
    
    private int cantidadCircuitosDesaprovados(){
        int contador=0;
        for (Circuito x : listaCircuitos) {
            if(!x.verificarAprobacion()){
                contador++;
            }
        }
        return contador;
    
    }
    
    private int tiempoTotalCircuito(){
        int totalSegundos=0;
        for (Circuito a : listaCircuitos) {
            totalSegundos += a.getSegundosCircuitoHecho();
        }
        return totalSegundos;
    }
    
    private boolean verificacionCasoCilindradraMayor(){
      
        return cantidadCircuitosDesaprovados()==0;
    }
    
    private boolean verificacionCasoCilindradaMenor(){
        return cantidadCircuitosDesaprovados()<2 && tiempoTotalCircuito()<= TIEMPO_LIMITE_CILINDRADA_INF;
    }
    

    @Override
    public boolean verificarAprobacion() {
        boolean aux;
        aux= verificacionCasoCilindradraMayor();
        if(this.motoUsada.getCilindrada()<= CLINDRADA_LIMITE){
            aux=verificacionCasoCilindradaMenor();
        }
        return aux;
    }

}