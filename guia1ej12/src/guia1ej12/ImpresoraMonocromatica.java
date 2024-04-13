/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej12;

/**
 *
 * @author santiago
 */
public class ImpresoraMonocromatica {
    
    private boolean encendido= false;
    private int cantHojas =0;
    private int nivelDeTinta = 100;
    private Documento doc;

    public ImpresoraMonocromatica(Documento doc) {
        this.doc = doc;
    }
    
    
    public void encenderImpresora (){
        encendido = true;
    }
    
    public void apagarImpresora (){
        encendido = false;
    }
    public int nivelSegunCantCaracteres(int cant){
        
        return cant/50;
    }
    
    private boolean verificarCantHojasRecarga (int a){
       return a>0 && (a+cantHojas)<36; 
    }
    private boolean verificarCantHojasImprimir (){
       return cantHojas > (doc.cantCaracteresCuerpo()/20); 
    }
    
    private boolean verificarNivelTintaImprimir (){
       return nivelDeTinta > (doc.cantCaracteresCuerpo()/50); 
    }
    
    public void recargarBandeja(int hojas){
        if(verificarCantHojasRecarga(hojas)){
            cantHojas+=hojas;
        }
    }
    
    private boolean verifiacarCondicionesImprimir(){
        return verificarCantHojasImprimir() && verificarNivelTintaImprimir() && encendido;
    }
    
    public void imprimir(Documento x){//aca creo q habria q descartar el parametro x
        if (verifiacarCondicionesImprimir()){
            nivelDeTinta = nivelDeTinta - (doc.cantCaracteresCuerpo()/50);
            cantHojas = cantHojas -(doc.cantCaracteresCuerpo()/20); 
            System.out.println(doc.toString()); 
            
        } else{
            System.out.println("no se puede imprimir verificar cant de hojas o nivel de tinta");
        }
    }
}
