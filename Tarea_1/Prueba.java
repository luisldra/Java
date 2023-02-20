package Tarea_1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        /// D:/Usuarios/Luisda/Descargas/U/Ingenieria de Software/Java/Tarea_1/pruebas/
    
        String carpeta;
        String palabra;
    
        System.out.println("Ingrese la ubicacion de la carpeta:");
        carpeta = scan.nextLine();
    
        System.out.println("Ingrese la palabra a buscar:");
        palabra = scan.nextLine();
        scan.close();
    
        ContarPalabras ejemplo = new ContarPalabras(carpeta, palabra);
    
        ejemplo.encontrarCarpeta();
    
    }
}
