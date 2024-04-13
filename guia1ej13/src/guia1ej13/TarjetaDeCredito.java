/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej13;

/**
 *
 * @author santiago
 */
public class TarjetaDeCredito {
    
    private EntidadFinanciera nombreF;
    private String banco;
    private String numeroTarjeta;
    private double saldo;
    private Persona titular;

    public TarjetaDeCredito(EntidadFinanciera nombreF, String banco, String numeroTarjeta, double saldo, Persona titular) {
        this.nombreF = nombreF;
        this.banco = banco;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public double getLimiteTarjeta(){
        return saldo;
    }
    
    public String getNombreTitular(){
        return titular.getNombre();
    }
    
    public String getApellidoTitular(){
        return titular.getApellido();
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "nombreF=" + nombreF + ", banco=" + banco + ", numeroTarjeta=" + numeroTarjeta + ", saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    
    
    
}
