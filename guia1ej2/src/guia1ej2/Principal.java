/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1ej2;

/**
 *
 * @author santiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("37558303", "santiago", "lopez", 900000.00, 0, EstadoCivilEmpleado.SOLTERO);
        
        System.out.println(empleado1.toString());
        empleado1.obtenerSalarioFinal();
    }
    
}
