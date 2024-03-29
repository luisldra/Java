package solucion;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Lector de un archivo de texto plano.
 * @version 1.0
 */
public class LectorArchivoTexto {

    private final String nombreArchivo;

    public LectorArchivoTexto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * Lee el archivo dado y retorna una lista
     * con cada una de las líneas del archivo.
     *
     * @return lista de cadenas con cada una de las líneas del archivo
     *  o null si no se pudo leer
     */
    public List<String> obtenerLineas() {
        List<String> lineasArchivo = new ArrayList<>();
        Path rutaFormal = Paths.get(nombreArchivo);
        try (BufferedReader lector = Files.newBufferedReader(rutaFormal)) {
            String linea;
            while ((linea = lector.readLine()) != null){
                lineasArchivo.add(linea);
            }
        } catch (IOException errorLectura) {
            return null;
        }
        return lineasArchivo;
    }
}
