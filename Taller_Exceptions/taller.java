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

    Fecha fecha = new Fecha(año, mes, dia);

    System.out.println(fecha.crearFecha());
  

}
}