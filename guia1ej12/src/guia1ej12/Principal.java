/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1ej12;

/**
 *
 * @author santiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento doc1 =  new Documento("01/01/2024", "Prueba de impresion", "Los "
                + "hermanos sean unidos porque esa es la ley primera; "
                + "tengan unión verdadera en cualquier tiempo que sea, "
                + "porque si entre ellos pelean los devoran los de afuera");
        
        ImpresoraMonocromatica imp1 = new ImpresoraMonocromatica(doc1);
        
        imp1.encenderImpresora();
        imp1.imprimir(doc1);
        
        imp1.recargarBandeja(20);
        imp1.imprimir(doc1);
    }
    
}
