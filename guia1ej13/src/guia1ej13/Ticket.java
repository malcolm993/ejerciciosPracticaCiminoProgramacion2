/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej13;

/**
 *
 * @author santiago
 */
public class Ticket {
    
    private String nombreCliente;
    private String apellidoCliente;
    private double montoTotal;
    private double montoCuota;

    public Ticket(String nombreCliente, String apellidoCliente, double montoTotal, double montoCuota) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.montoTotal = montoTotal;
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", montoTotal=" + montoTotal + ", montoCuota=" + montoCuota + '}';
    }
    
    
}
