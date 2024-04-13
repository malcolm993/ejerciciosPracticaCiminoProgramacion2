/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej13;

/**
 *
 * @author santiago
 */
public class Posnet {
    
    private TarjetaDeCredito tarjeta;
    private int cantidadCuotas;
    private double montoAPagar;

    public Posnet(TarjetaDeCredito tarjeta, int cantidadDeCuotas, double montoDeCompra) {
        this.tarjeta = tarjeta;
        verificarCantCuotas(cantidadDeCuotas);
        verificarMonto(montoDeCompra);
    }
    
    private boolean verificarCantCuotas (int x){
        boolean aux= false;
        if (x<=6 && x>=1){
            cantidadCuotas = x;
            aux= true;
        }else{
            System.out.println("LA CANTIDA DE CUOTAS NO ES CORRECTA");
        }
        
        return aux;
    }
    
    private boolean verificarMonto (double x){
        boolean aux=false;
        if (x>0 && montoMasIncremento() < tarjeta.getLimiteTarjeta() ){
            montoAPagar = x;
            aux = true;
        }else{
            System.out.println(montoMasIncremento());
            System.out.println("EL MONTO ES INCORRECTO O EXCEDE EL LIMITE");
        }
        return aux;
    }
    
    private double incrementoCuotas(){
        double inc = 0.03 ;
        if (cantidadCuotas == 1 ){
            inc=0;
        }
        return montoAPagar*0.03*cantidadCuotas;
    }
    
    private double montoMasIncremento(){
        
        return montoAPagar + incrementoCuotas();
    }
    
    private double montoCadaCuota(){
        return montoMasIncremento()/cantidadCuotas;
    }
    
    public Ticket efectuarPago(){
        
        Ticket t1 = null;
        
        if(verificarCantCuotas(cantidadCuotas) && verificarMonto(montoAPagar)){
   
            t1 = new Ticket(tarjeta.getNombreTitular(), tarjeta.getApellidoTitular(), montoMasIncremento(), montoCadaCuota());
            System.out.println(t1);
        }
        return t1;
    }//hasta aca llegaste
}
