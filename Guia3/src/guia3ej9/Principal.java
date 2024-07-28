package guia3ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        InsumosInformaticos i1 = new InsumosInformaticos(15, 10000, TipoDeInsumo.LIMPIEZA);
        InsumosInformaticos i2 = new InsumosInformaticos(10, 20000, TipoDeInsumo.HARDWARE);
        InsumosInformaticos i3 = new InsumosInformaticos(5, 8000, TipoDeInsumo.PERIFERICO);
        
        ServicioArmado sa1= new ServicioArmado(5);
        ServicioArmado sa2= new ServicioArmado(10);
        
        ServicioReparacion sr1 = new ServicioReparacion(2, 4);
        ServicioReparacion sr2 = new ServicioReparacion(3, 1);
        
        Historial his = new Historial();
        
        his.agregarFacturaLista(i3);
        his.agregarFacturaLista(i2);
        his.agregarFacturaLista(i1);
        his.agregarFacturaLista(sa1);
        his.agregarFacturaLista(sa2);
        his.agregarFacturaLista(sr1);
        his.agregarFacturaLista(sr2);
        
       
        System.out.println("EL TOTAL FACTURADO FUE : " + his.montoTotalFacturado());
        
        System.out.println("CANTIDAD DE SERVICIOS DE REPARACION DE NIVEL DE DIFICULTAD MENOR 2: " + his.cantServiciosSimples());
        
        
    }

}