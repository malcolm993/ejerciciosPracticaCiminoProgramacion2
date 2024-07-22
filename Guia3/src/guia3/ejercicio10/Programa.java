package guia3.ejercicio10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Programa implements Calificables{

    private String id;
    private String nombrePrograma;
    private String nombreResponsable;
    private boolean siPasoPruebas;
    private ArrayList<Fuente> listaDeFuentesDePrograma;

    public Programa(String id, String nombrePrograma, String nombreResponsable, boolean verdaderoOfalso) {
        this.id = id;
        this.nombrePrograma = nombrePrograma;
        this.nombreResponsable = nombreResponsable;
        this.siPasoPruebas = verdaderoOfalso;
        listaDeFuentesDePrograma = new ArrayList<>();
    }
    
    public void agregarFuente(Fuente x){
        listaDeFuentesDePrograma.add(x);
        
    }

    @Override
    public double indiceDeCalidad() {
        double indiceCalidad = 0 ;
        if (this.siPasoPruebas != false){
            indiceCalidad = promedioListaFuentes();
        }
        return indiceCalidad;
    }
    
    
    private int cantidadTotalFuentes(){
        return listaDeFuentesDePrograma.size();
    }
    
    private double sumaTotalIndiceFuentes(){
        double total =0;
        for (Fuente f : listaDeFuentesDePrograma) {
            total += f.indiceDeCalidad();
        }
        
        return total;
    }
    
    private double promedioListaFuentes(){
        return sumaTotalIndiceFuentes()/cantidadTotalFuentes();
    }

    public void mostrarDetelleDeMetodo(String nombreMetodo) {
         String x = "no existe el metodo solicitado";
         Metodo aux = busquedaMetodo(nombreMetodo);
         System.out.println(aux);
         if(aux != null) {
             
             x = aux.toString();
         }

        System.out.println(x);
    }
    
    private Metodo busquedaMetodo( String nombreMetodoBuscado){
        int cont =0;
        Metodo encontrado = null;
        while (cont < listaDeFuentesDePrograma.size() & encontrado == null){
            Fuente aux = listaDeFuentesDePrograma.get(cont);
            if (aux instanceof FuentesDeProgramacion){
                
                encontrado = ((FuentesDeProgramacion) aux).busquedaMetodo(nombreMetodoBuscado);
                System.out.println(encontrado);
            }
            cont++;
        }
        return encontrado;    
    }

    public ArrayList<Fuente> listadoFuentesMayoresAlPromedio( double promedioFiltro) {
        ArrayList<Fuente> lista1 = new ArrayList<>();
        for (Fuente j : listaDeFuentesDePrograma) {
            if(j.indiceDeCalidad()> promedioFiltro){

                lista1.add(j);
            }
        }
                
        
        return lista1;
    }

    public String getId() {
        return id;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public boolean isSiPasoPruebas() {
        return siPasoPruebas;
    }

    public void setSiPasoPruebas(boolean siPasoPruebas) {
        this.siPasoPruebas = siPasoPruebas;
    }
    
    
    
    
    

}