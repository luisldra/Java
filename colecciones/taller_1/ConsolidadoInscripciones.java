package taller_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import solucion.Estudiante;
import solucion.LectorArchivoTexto;

public class ConsolidadoInscripciones {

    Map<String, Estudiante> estudiantes;

    public List<String> consolidarArchivo (String ruta){
        LectorArchivoTexto lector = new LectorArchivoTexto(ruta);
        List<String> lineasArchivo = lector.obtenerLineas();

        for (String linea: lineasArchivo){
            this.procesarLinea(linea);
        }

        List<String> datosEstudiantes = new ArrayList<>();
        Collection<Estudiante> listaEstudiantes = estudiantes.values();
        for (Estudiante estudiante: listaEstudiantes){
            datosEstudiantes.add(estudiante.toString());
        }
        return datosEstudiantes;
    }
    

    public void procesarLinea(String linea){
        String[] consolidado = linea.split(",");
        Estudiante estudiante = buscarEstudiante(consolidado[0]);

        if (estudiante == null) {
            estudiante = new Estudiante(consolidado[0], consolidado[1]);
            estudiantes.put(consolidado[0], estudiante);
        }
        estudiante.adicionarMateria(consolidado[2], consolidado[3]);

    }

    public Estudiante buscarEstudiante(String cedula) {
        return estudiantes.get(cedula);
    }

}
