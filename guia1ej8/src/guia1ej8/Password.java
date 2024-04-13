/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej8;

/**
 *
 * @author santiago
 */
public class Password {
    
    private String contrasenia;

    public Password(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public Password( ) {
        this.contrasenia = generarAleatorio(0); //verificar esto no es claro
    }
    
    public boolean esFuerte(){
        return contrasenia.length()>=8;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    public boolean nuevoValor(String nuevo){
        if (verificacionPassword(nuevo)){
            setContrasenia(nuevo);
        }
        return nuevo.equals(contrasenia);
    }
    private boolean verificacionPassword(String x){
        return x.length()>= 6;
    }
    
    private int rangoAleatorio (int a){
        int num;
        num = (int) (Math.random() * (int) Math.pow(10, a));
        System.out.println("numero aleatorio: "+ num);
        return num;
    }
    
    
            
    public String generarAleatorio(int x){
        int num;
        String numecad = null;
        if (x>= 6){
            num=rangoAleatorio(x);
            numecad = Integer.toString(num);
        }
        return numecad ;
                
    }

    @Override
    public String toString() {
        return "Password{" + "contrasenia=" + contrasenia + '}';
    }
    
    
    
}
