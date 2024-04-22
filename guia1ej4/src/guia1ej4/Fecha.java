/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej4;

/**
 *
 * @author santiago
 */
public class Fecha {
    private int fecha;
    private int mes;
    private int anio;

    public Fecha(int fecha, int mes, int anio) {
        setFecha(fecha);
        setMes(mes);
        setAnio(anio);
    }
    private boolean verificarFecha(int x){
        return x>0 && x<32;
    }
    private boolean verificarMes(int x){
        return x>0 && x<13;
    }
    private boolean verificarAnio(int x){
        return x>0 ;
    }
    public void setFecha(int d) {
        if(verificarFecha(d)){
            this.fecha = d;
        }
    }

    public void setMes(int m) {
        if (verificarMes(m)){
            this.mes = m;
        }
    }

    public void setAnio(int a) {
        if (verificarAnio(a)){
            this.anio = a;
        }
    }
    
    public void obtenerDia(){
        System.out.println("la fecha es : " + fecha +"/"+ mes + "/"+ anio );
    } 
    public boolean esNavidad(){
        return fecha == 25 && mes == 12;
    }
    
    public void sumarMes(){
        if (mes == 12){
            mes = 1;
        }
        mes++;
        
    }
}
