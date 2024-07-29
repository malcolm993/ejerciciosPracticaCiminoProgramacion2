/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2ej9;

/**
 *
 * @author santiago
 */
public class Informe {
    
    private String codigoGarage;
    private int cantVehiculosEstacionados;

    public Informe(String codigoGarage, int cantVehiculosEstacionados) {
        this.codigoGarage = codigoGarage;
        this.cantVehiculosEstacionados = cantVehiculosEstacionados;
    }

    @Override
    public String toString() {
        return "Informe{" + "codigoGarage=" + codigoGarage + ", cantVehiculosEstacionados=" + cantVehiculosEstacionados + '}';
    }

    
    
    
}
