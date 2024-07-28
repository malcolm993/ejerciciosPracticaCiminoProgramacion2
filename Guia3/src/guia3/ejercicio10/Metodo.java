package guia3.ejercicio10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Metodo implements Calificable {

    private int cantidadParametros;
    private int cantidadRamificacinesFlujo;
    private int cantidadInstrucciones;
    private String nombre;

    public Metodo(int cantidadParametros, int cantidadRamificacinesFlujo, int cantidadInstrucciones, String nombre) {
        this.cantidadParametros = cantidadParametros;
        this.cantidadRamificacinesFlujo = cantidadRamificacinesFlujo;
        this.cantidadInstrucciones = cantidadInstrucciones;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    

   

    @Override
    public String toString() {
        return "\n\nMetodo{" + nombre + ":"+
                "\ncantidadParametros=" + cantidadParametros +
                "\n, cantidadRamificacinesFlujo=" + cantidadRamificacinesFlujo + 
                "\n, cantidadInstrucciones=" + cantidadInstrucciones +
                "\nindice de Calidad Metodo: " + indiceDeCalidad()
                ;
    }

    @Override
    public double indiceDeCalidad() {
        return 5 / (this.cantidadParametros+1)+20/ this.cantidadInstrucciones + 3 / (this.cantidadRamificacinesFlujo + 1 );
    }
    
    

}