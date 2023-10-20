package excepciones.carros;

public class CarrosMain {

    public static void main(String[] args) {
        // ESCRIBIR LA RUTA DE LA CARPETA DONDE ESTÁN LOS ARCHIVOS DE PRUEBA.
        // POR EJEMPLO: C:\\UCaldas\\IngSw\\Patrones\\
        String carpeta = ".\\resources\\";
        ControlCarros control = new ControlCarros();

        System.out.println(" PRUEBA 1 - archivo inexistente: ");
        System.out.println("Debe salir: \"No se pudo leer el archivo\"");
        control.obtenerDatosCarros(carpeta+"INEXISTENTE");

        System.out.println(" PRUEBA 2 - datos correctos: ");
        System.out.println("Debe salir: 2 carros leídos, 0 datos incorrectos");
        control.obtenerDatosCarros(carpeta+"Carros.csv");
        System.out.println(control.getCantidadCarrosCreados() +
                " carros leídos, " + control.getCantidadDatosIncorrectos() +
                " datos incorrectos");

        System.out.println("Debe salir: [[placa=QUX-346, modelo=2020], [placa=HFY-974, modelo=2019]]");
        System.out.println(control.consultarDatosCarros());

        System.out.println(" PRUEBA 3 - datos incorrectos: ");
        System.out.println("Debe salir: 2 carros leídos, 2 datos incorrectos");
        control.obtenerDatosCarros(carpeta+"CarrosIncorrectos.csv");
        System.out.println(control.getCantidadCarrosCreados() +
                " carros leídos, " + control.getCantidadDatosIncorrectos() +
                " datos incorrectos");

        System.out.println("Debe salir: [[placa=ABC-123, modelo=1999], [placa=DFG-879, modelo=2000]");
        System.out.println(control.consultarDatosCarros());
    }
}
