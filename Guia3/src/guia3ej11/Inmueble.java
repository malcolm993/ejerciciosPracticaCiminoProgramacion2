package guia3ej11;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Inmueble {

    private String domicilio;
    private int superficieM2;
    private int cantAmbientes;
    private double precioDolares;
    private ArrayList<Interesado> listaDeInteresados;

    public Inmueble(String domicilio, int superficieM2, int cantAmbientes, double precioDolares) {
        this.domicilio = domicilio;
        this.superficieM2 = superficieM2;
        this.cantAmbientes = cantAmbientes;
        this.precioDolares = precioDolares;
        listaDeInteresados = new ArrayList<>();
    }
    
    private boolean validacionPrecio(double x){
        boolean aux = false;
        if(x > 0){
            aux= true;
        }
        return aux;
    }

    private void setPrecioDolares(double precioDolares) {
        this.precioDolares = precioDolares;
    }
    
    
    
    public void cambioDePrecio(double a){
        double aux = 0.0;
        if(validacionPrecio(a)){
            aux = getPrecioDolares();
            setPrecioDolares(a);
            informarAInteresados(aux);
            
        }
    }

    public double getPrecioDolares() {
        return precioDolares;
        
        
    }
    
    private String crearMensaje(){
        String aux= "El inmueble
        return
    }
    
    private void informarAInteresados(double precioviejo){
        for (Interesado x : listaDeInteresados) {
            x.informarCambioDePrecio(precioviejo);
        }
    }
    

}
