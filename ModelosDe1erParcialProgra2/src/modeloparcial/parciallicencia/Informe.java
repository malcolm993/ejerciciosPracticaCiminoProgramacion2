package modeloparcial.parciallicencia;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Informe {

    private double porcentajeExamenesAprobados;
    private double promedioTiempoExamenesAutosAprobados;

    public Informe(ArrayList<Examen> x) {
        
        this.porcentajeExamenesAprobados= calcularPorcentajeExamenesAprobados(x);
        this.promedioTiempoExamenesAutosAprobados = calcularPromedioTiempoExamenesAutosAprobados(x);
    }
    

    
    private double calcularPorcentajeExamenesAprobados(ArrayList<Examen> x){
        int cont=0;
        for (Examen e : x) {
            if(e.verificarAprobacion()){
                cont++;
            }
        }
        return (cont * 100)/x.size();
    }
    
    private double calcularPromedioTiempoExamenesAutosAprobados (ArrayList<Examen> x){
       
        double total=0;
        int contadorExamenAuto=0;
        for (Examen ex : x) {
            if( ex instanceof ExamenAuto){
                total += ((ExamenAuto)ex).getCircuito().getSegundosCircuitoHecho();
                contadorExamenAuto++;
            }
        }
        
        return total/contadorExamenAuto;
        
    }

    @Override
    public String toString() {
        return "Informe{" + "porcentajeExamenesAprobados=" + porcentajeExamenesAprobados + ", promedioTiempoExamenesAutosAprobados=" + promedioTiempoExamenesAutosAprobados + '}';
    }
    
    
    

}