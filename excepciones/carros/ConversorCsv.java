package excepciones.carros;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Permite convertir datos de carros que están en formato CSV
 * a sus correspondientes objetos "Carro" en Java.
 */
public class ConversorCsv {
    private int datosIncorrectos;

    public ConversorCsv() {
        this.datosIncorrectos = 0;
    }

    public int getDatosIncorrectos() {
        return datosIncorrectos;
    }

    /**
     * Se deben tener varias líneas de texto, cada una con los datos de un carro.
     * No se debe tener una línea de encabezado, desde la primera línea son datos.
     */
    public List<Carro> crearListaCarros(String texto) {
        List<Carro> carros = new ArrayList<>();
        List<String> datosCarrosEnTexto = Arrays.asList(texto.split(System.lineSeparator()));
        for (String datosCarro : datosCarrosEnTexto) {
            Carro carro = crearCarro(datosCarro);
            carros.add(carro);
        }
        return carros;
    }

    /**
     * La cadena debe estar con los datos de un Carro separados por comas
     *  Por ejemplo: QUX-346,2020
     */
    public Carro crearCarro(String datos) {
        String[] datosCarro = datos.split(",");
        String placa = datosCarro[0];
        int modelo = Integer.parseInt(datosCarro[1]);
        return new Carro(placa, modelo);
    }
}

