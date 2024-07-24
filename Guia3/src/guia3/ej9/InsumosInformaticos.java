package guia3.ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class InsumosInformaticos implements Facturable {

    private int porcentajeGanancia;
    private double precioLista;
    private TipoDeInsumo tipo;

    public InsumosInformaticos(int porcentajeGanancia, double precioLista, TipoDeInsumo tipo) {
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
        this.tipo = tipo;
    }
    
    

    @Override
    public double montoDeFacturacion() {
        double monto = new Matematica().sumarPorcentaje(precioLista, porcentajeGanancia);
        return (new Matematica().sumarPorcentaje(monto, IVA));
    }
    
}