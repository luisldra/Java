package solucion;

import java.util.*;

/**
 * Clase de control del proceso del archivo de inscripciones
 * @version 1.0
 */
public class ConsolidadoInscripcionesLista {
    private List<Estudiante> estudiantes;

    public ConsolidadoInscripcionesLista(){
        estudiantes = new ArrayList<>();
    }

    /**
     * Obtiene las líneas de texto del archivo
     *  y las procesa para sumar las materias de cada estudiante
     * @param ruta la ruta y nombre completo del archivo que se desea leer
     * @return una lista de cadenas: con el dato de cada estudiante en una cadena
     */
    public List<String> consolidarArchivo(String ruta){
        LectorArchivoTexto lector = new LectorArchivoTexto(ruta);
        List<String> lineasArchivo = lector.obtenerLineas();

        for (String linea: lineasArchivo){
            this.procesarLinea(linea);
        }

        List<String> datosEstudiantes = new ArrayList<>();
        for (Estudiante estudiante: estudiantes){
            datosEstudiantes.add(estudiante.toString());
        }
        return datosEstudiantes;
    }

    /**
     * A partir de una línea del archivo (separada por comas) obtiene
     * los datos de un estudiante y lo guarda en la colección.
     *
     * @param linea  una cadena con cuatro datos separados por comas:
     *               la cédula del estudiante, si nombre,
     *               el código de una materia y su nombre.
     *               Ejemplo: 8620x34,Pepito,345,Lectoescritura
     */
    private void procesarLinea(String linea){
        String[] cadenas = linea.split(",");
        String cedula = cadenas[0];
        Estudiante estudiante = buscarEstudiante(cedula);
        if (estudiante == null){
            estudiante = new Estudiante(cedula, cadenas[1]);
            estudiantes.add(estudiante);
        }
        estudiante.adicionarMateria(cadenas[2],cadenas[3]);
    }

    /**
     * Buscar un estudiante en la colección, a partir de la cédula.
     *
     * @return el objeto estudiante, o null si no se emcuentra
     */
    private Estudiante buscarEstudiante(String cedula){
        for (Estudiante estudiante: estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }
}
