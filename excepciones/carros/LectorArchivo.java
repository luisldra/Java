package excepciones.carros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase relacionada con un archivo de texto,
 * para leer su contenido.
 */
public class LectorArchivo {

    private File archivo;

    public LectorArchivo(String rutaArchivo) {
        this.archivo = new File(rutaArchivo);
    }

    /**
     * En caso de ser un archivo pequeño, se puede leer completo
     * en una sola instrucción.
     *
     * @return el texto completo del archivo, como un solo String.
     */
//    public String leerTextoArchivo() {
//        Path ruta = Paths.get(archivo.toURI());
//        String texto = Files.readString(ruta);
//        return texto;
//    }
}

