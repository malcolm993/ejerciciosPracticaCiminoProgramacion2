/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej7;

/**
 *
 * @author santiago
 */
public class Robot {
    String nombreRobot ;

    public Robot(String x) {
        this.nombreRobot = x;
    }
    
    public void saludar(String nombreCliente){
        System.out.println("Hola " + nombreCliente+ " , mi nombre es "+ nombreRobot +". "+"¿En que puedo ayudarte?" );
    }
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ nombreRobot +". "+" ¿En que puedo ayudarte?" );
    }
    
}
