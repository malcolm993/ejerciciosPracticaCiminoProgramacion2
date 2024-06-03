package guia3ej8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PersonalAComision extends Persona {

    public static final int SALARIO_MINIMO = 20000;
    private int numeroClientes;
    private double montoACobrar;

    public PersonalAComision(int numeroClientes, double montoACobrar, String dni, String nombre, String apellido, int anioIngreso) {
        super(dni, nombre, apellido, anioIngreso);
        this.numeroClientes = numeroClientes;
        this.montoACobrar = montoACobrar;
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