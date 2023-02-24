package Soluciones_excepciones.Zip;

import java.io.IOException;
import java.util.zip.ZipFile;

/**
 * Clase para operaciones con un archivo zip
 *
 * @version  1.0
 */
public class ArchivoZip {

    /**
     * Obtener la cantidad de archivos en un zip,
     * a partir del nombre completo del archivo.
     */
    public int cantidadArchivos(String rutaArchivo)
            throws IOException {
        ZipFile archivoZip = new ZipFile(rutaArchivo);
        archivoZip.close();
        return archivoZip.size();
    }
}