package Soluciones_excepciones.Zip;

import java.io.IOException;
import java.util.Scanner;

public class ProgramaZip {
    public static void main(String[] args) {
        ProgramaZip programa = new ProgramaZip();
        programa.mostrarCantidadArchivos();
    }

    /**
     * Pide el nombre de un archivo zip y muestra la cantidd
     *  de archivos que tiene internamente
     */
    public void mostrarCantidadArchivos() {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ruta archivo: ");
        String rutaArchivo = consola.next();

        consola.close();

        ArchivoZip archivo = new ArchivoZip();
        try {
            int cantidadArchivos = archivo.cantidadArchivos(rutaArchivo);
            System.out.println("Cantidad: "+cantidadArchivos);
        } catch (IOException errorArchivo){
            System.out.println("La ruta no corresponde a un" +
                    "archivo zip. Revisar.");
        }
    }
}
