package taller_1;
import java.util.List;

import solucion.ConsolidadoInscripciones;

public class Prueba {

    public static void main(String[] args) {
        ConsolidadoInscripciones proceso = new ConsolidadoInscripciones();
        List<String> datos = proceso.consolidarArchivo("D:\\Usuarios\\Luisda\\Descargas\\U\\Ingenieria de Software 23-1\\Java\\colecciones\\taller_1\\Pruebas\\Pruebas2.txt");
        if (datos == null || datos.isEmpty()){
            System.out.println("No hay datos en el archivo o" +
                    " no tienen el formato correcto.");
        }
        else {
            for(String estudiante: datos) {
                System.out.println(estudiante);
            }
        }
    }
}
