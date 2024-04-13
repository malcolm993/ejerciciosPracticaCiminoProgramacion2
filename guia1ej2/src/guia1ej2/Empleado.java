/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej2;

/**
 *
 * @author santiago
 */
public class Empleado {
    
    String dni;
    String nombre;
    String apellido;
    Double salarioBase;
    Double salarioFinal;
    int cantidadHijos;
    EstadoCivilEmpleado datoEstadoCivil;

    public Empleado(String dni, String nombre, String apellido, Double salarioBase, int cantidadHijos, EstadoCivilEmpleado datoEstadoCivil) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        
        this.cantidadHijos = cantidadHijos;
        this.datoEstadoCivil = datoEstadoCivil;
        calculoPlus();
        if (datoEstadoCivil == EstadoCivilEmpleado.SOLTERO){
            calculoDescuentoSoltero();
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", cantidadHijos=" + cantidadHijos + ", datoEstadoCivil=" + datoEstadoCivil + '}';
    }
    
    
    private void calculoPlus (){
        if (cantidadHijos > 3){
            calculoPlusMayor3();
        }else{
            calculoPlusMenor3();
        }
        
    }
    
    private void calculoPlusMayor3 (){
        salarioFinal= salarioBase*1.1 ;
    }
    private void calculoPlusMenor3 (){
        salarioFinal= salarioBase + salarioBase*(0.03*cantidadHijos);
    }
    
    private void calculoDescuentoSoltero(){
        salarioFinal= salarioFinal-salarioFinal*0.04;
    }
    public void obtenerSalarioFinal(){
        System.out.println(" el salario final de empleado es : " + salarioFinal);
    }
    
}
