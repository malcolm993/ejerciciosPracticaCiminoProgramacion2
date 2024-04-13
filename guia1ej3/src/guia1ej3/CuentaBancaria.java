/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author santiago
 */
public class CuentaBancaria {
    private String cbu ;
    private TipoDeCuenta tipo;
    private double saldo = 0.0;
    private Persona titular;
    private Date fechaApertura;

    public CuentaBancaria( TipoDeCuenta tipo, Persona x, String fechaA) throws ParseException {
        
        this.tipo = tipo;
        setCbu();
        this.titular = x;
        setFechaAperturaCuenta(fechaA);
        
    }

    public double getSaldo() {
        return saldo;
    }

    private void setCbu() {
        this.cbu = "12345678";
    }
    
    
    private boolean verificarMonto(int monto){
        return monto>=0;
    }
    public void depositarDinero(int monto){
        if (verificarMonto(monto)){
            saldo=+monto;
        }
    }    
        
    public void extraccion (int montoExtraido){
        
        if(verificarMonto(montoExtraido) && tipo == TipoDeCuenta.CUENTA_CORRIENTE){
            saldo-=montoExtraido;
        }else if(verificarMonto(montoExtraido) && saldo > montoExtraido){
            saldo-=montoExtraido;
        }
    }
    public String getUlitmos3Digitos(){
        return cbu.substring(4);
    }
    
     public void setFechaAperturaCuenta(String fechaAperturaString ) throws ParseException {
     
        DateFormat fechaformato = new SimpleDateFormat("dd/MM/yyyy");
        
        fechaApertura = fechaformato.parse(fechaAperturaString);
            
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + '}';
    }

   
    
}
