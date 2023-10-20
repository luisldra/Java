package excepciones.carros;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que obtiene datos de un archivo para
 * crear una lista de carros.
 */
public class ControlCarros {
    private List<Carro> carros;
    private ConversorCsv convertidor;

    public ControlCarros() {
        this.carros = new ArrayList<>();
        this.convertidor = new ConversorCsv();
    }

    public int getCantidadCarrosCreados() {
        return carros.size();
    }

    public int getCantidadDatosIncorrectos() {
        return convertidor.getDatosIncorrectos();
    }

    /**
     * Crea un lector para obtener los datos de un archivo,
     * a partir de su ruta, y obtener los datos de los carros que tiene.
     *
     * @param rutaArchivo la ruta completa del archivo,
     * 		con su nombre y extensión. Por ejemplo:
     *      C:\\UCaldas\\IngSw\\Patrones\\Carros.json
     */
    public void obtenerDatosCarros(String rutaArchivo) {
        LectorArchivo lector = new LectorArchivo(rutaArchivo);
       //String textoArchivo = lector.leerTextoArchivo();
       //this.carros = convertidor.crearListaCarros(textoArchivo);
    }

    public String consultarDatosCarros(){
        return carros.toString();
    }
}
