package guia3ej10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Shopie s = new Shopie();
        
        //metodos
        
        Metodo m1 = new Metodo(4, 5, 6, "AAA");
        Metodo m2 = new Metodo(3, 2, 1, "BBB");
        Metodo m3 = new Metodo(2, 2, 2, "CCC");
        
        //fuentes de Programacion 
        
        
        FuenteDeProgramacion fp1 = new FuenteDeProgramacion("ABC123", "DESKTOP", LenguajeProgra.JAVA);
        FuenteDeProgramacion fp2 = new FuenteDeProgramacion("DEF987", "DOCUMENTOS", LenguajeProgra.JAVASCRIPT);
        FuenteDeProgramacion fp3 = new FuenteDeProgramacion("JKL", "DESCARGAS", LenguajeProgra.CSHARP);
        
        //fuentes de marcado
        
        FuenteDeMarcado fm1 = new FuenteDeMarcado("987EFG", "DOCUMENTOS", LenguajeMarcado.HTML, 50);
        FuenteDeMarcado fm2 = new FuenteDeMarcado("456HIJ", "DESKTOP", LenguajeMarcado.XML, 90);
        FuenteDeMarcado fm3  = new FuenteDeMarcado("963XYZ", "DOCUMENTOS", LenguajeMarcado.HTML, 75);
        
        // programas
        Programa p1 = new Programa("1", "Oximoron", "carlos", false);
        Programa p2 = new Programa("2", "Ares", "Santiago", true);
        Programa p3 = new Programa("55", "AFIP", "Javier", true);
        
        //agrego metodos a las fuentes de programacion
        fp1.agregarMetodo(m3);
        fp1.agregarMetodo(m1);
        
        fp2.agregarMetodo(m2);
        
        fp3.agregarMetodo(m1);
        fp3.agregarMetodo(m2);
        fp3.agregarMetodo(m3);
        
        //agregar fuentes a programas
        p1.agregarFuente(fp1);
        p1.agregarFuente(fm1);
        
        p2.agregarFuente(fp3);
        p2.agregarFuente(fm2);
        
        p3.agregarFuente(fp2);
        
        //pruebas de programa 
        ///listado de fuentes mayores al promedio
        System.out.println( p2.listadoFuentesMayoresAlPromedio(1.0));
        ///mostrar detalle del metodo dentro de una fuente de uno de lo sprogrmas
        p1.mostrarDetelleDeMetodo("AAA");
        
        
        //pruebas Shopie
        // programa por debajo de un promedio
        s.agregarProgramaAShopie(p1);
        s.agregarProgramaAShopie(p2);
        s.agregarProgramaAShopie(p3);
        
        System.out.println(p3);
        
        int valor=10;
        System.out.println("Programas con promedio debajo : " + valor);
        System.out.println(s.programasPorDebajoDe(10));
        
        //mostrar informes
        System.out.println("INFORMES");
        s.generarInformesDeCalidad();
        s.informeIndiceCalidadProgramas();
    }

}