package guia3ej8;

import java.time.Year;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class PersonalSalarioFijo extends Persona {

    public static final double DOS_A_CINCO = 0.05;
    public static final double SEIS_A_DIEZ = 0.10;
    public static final double MAS_DE_DIEZ = 0.15;
    private double sueldoBasico;
    private int aniosAntiguo;

    public PersonalSalarioFijo(double sueldoBasico, String dni, String nombre, String apellido, int anioIngreso) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
        this.aniosAntiguo = calcularAniosAntiguedad();
        calcularSalario();
    }

    private int calcularAniosAntiguedad() {
        int x = Year.now().getValue() - this.getAnioIngreso();
        return x;
    }

    private double porcentajeCorrespodiente() {

        Double x = 0.0;
        if (aniosAntiguo > 10) {
            x = MAS_DE_DIEZ;
        } else if (aniosAntiguo > 6) {
            x = SEIS_A_DIEZ;
        } else {
            x = DOS_A_CINCO;
        }
        return x;
    }

    @Override
    public void mostrarSalario() {
        System.out.println(" Empleado: " + this.getNombre() + " " + this.getApellido() + " sueldo : " + calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + sueldoBasico * porcentajeCorrespodiente();
    }

}
