package taller_1;
import java.util.List;

import solucion.ConsolidadoInscripciones;

public class PruebaInscripciones {

    public static void main(String[] args) {
        ConsolidadoInscripciones proceso = new ConsolidadoInscripciones();
        List<String> datos = proceso.consolidarArchivo("Prueba.csv");
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