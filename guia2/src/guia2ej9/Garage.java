package guia2ej9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Garage {
    private final static int MESES_LIMITE_ADEUDADOS = 3;
    private String codigoAlfanumerico;
    private ArrayList<Vehiculo> vehiculosRetirados;
    private ArrayList<Vehiculo> vehiculosEstacionados;
    private Tablero tablero;

    public Garage(String codigoAlfanumerico) {
        this.codigoAlfanumerico = codigoAlfanumerico;
        vehiculosEstacionados= new ArrayList<>();
        vehiculosRetirados = new ArrayList<>();
        this.tablero = new Tablero();
    }
    
    private Vehiculo buscarVehiculoEstacionado (String patentebuscada){
        Vehiculo encontrado =null;
        int contador =0;
        while(encontrado == null && contador < vehiculosEstacionados.size()){
            Vehiculo aux = vehiculosEstacionados.get(contador);
            if(aux.getPatente().equalsIgnoreCase(patentebuscada)){
                encontrado = aux;
            }
            contador++;
        }
        return encontrado;
    }
    
    private Vehiculo buscarVehiculoRetirados (String patentebuscada){
        Vehiculo encontrado =null;
        int contador =0;
        while(encontrado == null && contador < vehiculosRetirados.size()){
            Vehiculo aux = vehiculosRetirados.get(contador);
            if(aux.getPatente().equalsIgnoreCase(patentebuscada)){
                encontrado = aux;
            }
            contador++;
        }
        return encontrado;
    }
  

    public EstadoVehiculo estacionarVehiculo(String patente) {
        EstadoVehiculo aux = EstadoVehiculo.VEHICULO_NO_HABILITADO;
        if(buscarVehiculoEstacionado(patente)!= null){
            aux = EstadoVehiculo.VEHICULO_YA_ESTACIONADO;
        }
        if(buscarVehiculoRetirados(patente)!= null){
            aux = EstadoVehiculo.NO_ESTACIONA_ADEUDA;
            if(buscarVehiculoRetirados(patente).getMesesAdeudados()<= MESES_LIMITE_ADEUDADOS){
                aux = EstadoVehiculo.INGRESO_OK;
                Vehiculo veh = buscarVehiculoRetirados(patente);
                ingresoDeVehiculo(veh);
                
            }
        }
                
        return aux;
    }
    
    private void ingresoDeVehiculo(Vehiculo x){
        vehiculosEstacionados.add(x);
        vehiculosRetirados.remove(x);
        tablero.agregarLlaveATablero(x.getLlave());
        
    }

    public String getCodigoAlfanumerico() {
        return codigoAlfanumerico;
    }
    
    public int cantidadVehiculosEstacionados(){
        return vehiculosEstacionados.size();
    }
    
    public boolean esPersonaAutorizada(String dni) {
        boolean aux= false;
        int cont=0;
        while(aux == false && cont < vehiculosEstacionados.size()){
            Vehiculo auxV = vehiculosEstacionados.get(cont);
            if(auxV.buscarPersonaAutorizada(dni) != null){
                aux = true;
            }
        }
        
        return aux;
    }

}