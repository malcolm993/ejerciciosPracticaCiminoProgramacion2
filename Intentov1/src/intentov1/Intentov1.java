/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intentov1;
import java.util.Scanner;

/**
 *
 * @author santiago
 */
public class Intentov1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mudo");
        
        Scanner entrada = new Scanner(System.in);
//        Scanner entrada2 = new Scanner(System.in);
//        int numero1;
//        int numero2;
//        char letra;
//        String oracion;
////        System.out.println("ingresa el nuevo valor de numero 1");
////        numero1 = entrada.nextInt();
////        System.out.println("ingresa el nuevo valor de numero 2");        
////        numero2 = entrada.nextInt();
////        
////        System.out.println(" La suma de ambos es igual a " + (numero1 + numero2) );
//        System.out.println("ingresa una palabra");
//        
//        letra = entrada.next().charAt(0);
//        
//        System.out.println("la 1ra letra detectadas es : " + letra);
//        
// 
//        
//        System.out.println("ingresa una nueva oracion ");
//        
//        oracion = entrada2.nextLine();
//        
//        System.out.println("la oracion ingresada fue: " + oracion);
        
        int edad;
        String nombre;
        System.out.println("Ingresá tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingresá tu nombre: ");
        nombre = entrada.nextLine(); // No se lee
        System.out.println("Hola " + nombre + ". Tenés " + edad + " años.");
        
        
        
        
    }
    
}
