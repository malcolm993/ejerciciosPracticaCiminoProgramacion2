/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1_ej1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author santiago
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int edad;
    private Domicilio dom;

    public Persona(String nombre, String apellido, String fechaNacString, Domicilio a) throws ParseException {
        this.nombre = nombre;
        this.apellido = apellido;
        setFechaNacimiento(fechaNacString);
        this.dom = a;
    }
    
    
    
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }

    public void setFechaNacimiento(String fechaNacimientoString ) throws ParseException {
     
        DateFormat fechaformato = new SimpleDateFormat("dd/MM/yyyy");
        
        fechaNacimiento = fechaformato.parse(fechaNacimientoString);
        
        edad = inicalizarEdad();
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        DateFormat fechaformato = new SimpleDateFormat("yyyy-MM-dd");
        return fechaformato.format(fechaNacimiento);
    }
    
    public int inicalizarEdad(){
        
//        Calendar nacimiento = new GregorianCalendar();
//        nacimiento.setTime(fechaNacimiento);
//        Calendar fechaActual = Calendar.getInstance();
          Period anios = Period.between(LocalDate.parse(getFechaNacimiento()), LocalDate.now()) ;
   
        return anios.getYears();
    }
    
    public int getEdad (){
        return edad;
    }
    
    public boolean verificarMayorA ( int num){
        return edad > num;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", dom=" + dom + '}';
    }

    

    
    
    
    
    
    
}
