package Taller_exceptions_2;

import java.util.Scanner;

public class Modelo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ruta del archivo ZIP (nombre_archivo.zip):");
        String rutaArchivo = scanner.nextLine();
        
        scanner.close();

        Carpeta carpeta1 = new Carpeta(rutaArchivo);
        carpeta1.contar();

    }
}


/// D:/Usuarios/Luisda/Descargas/U/Ingenieria de Software/Java/Taller_exceptions_2/Pruebas/Pruebas.zip