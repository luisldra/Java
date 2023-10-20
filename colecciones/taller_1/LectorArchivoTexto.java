package taller_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Lector de un archivo de texto plano.
 */
public class LectorArchivoTexto {

    private final String nombreArchivo;

    public LectorArchivoTexto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * Lee el archivo dado (a partir de la ruta) y retorna una lista
     * con cada una de las líneas del archivo.
     *
     * @return lista de cadenas con cada una de las líneas del archivo
     *  o null si no se pudo leer
     */
    public List<String> obtenerLineas() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            return null;
        }

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
