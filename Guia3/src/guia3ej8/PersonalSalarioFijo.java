package guia3ej8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PersonalSalarioFijo extends Persona {

    public static final int DOS_A_CINCO = 5;
    public static final int SEIS_A_DIEZ = 10;
    public static final int MAS_DE_DIEZ = 10;
    private double sueldoBasico;
    private int aniosAntiguo;

    public PersonalSalarioFijo(double sueldoBasico, int aniosAntiguo, String dni, String nombre, String apellido, int anioIngreso) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
        this.aniosAntiguo = aniosAntiguo;
        calcularSalario();
    }
    
    

    @Override
    public double mostrarSalario() {
        return 0.0;
    }

    @Override
    public double calcularSalario() {
        return 0.0;
    }

}