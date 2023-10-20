package Taller_Exceptions;

import java.util.Scanner;

public class taller {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese su fecha de nacimiento");

    System.out.println("dia:");
    int dia = scanner.nextInt();

    System.out.println("mes");
    int mes = scanner.nextInt();

    System.out.println("año");
    int año = scanner.nextInt();

    scanner.close();

    
    controlFecha c1 = new controlFecha();

    if (!c1.validarFecha(dia, mes, año)) {
      System.out.println("La fecha ingresada es invalida");
    }
    
    /**
     * Opcion
     
      try {
        fecha.crearFecha();
      } catch (Exception e) {
        System.out.println("Fecha mala " + e.getMessage());
      }

     */
   
    
  

}
}