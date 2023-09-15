package Taller_Enumeracion;

// Pruebas informales de objetos "Camiseta", para uso de ENUM.
public class ProgramaCamisetas {

    public static void main(String[] args) {
        Camiseta camisetaPequeña = new Camiseta("Tradicional",Talla.SMALL);
        Camiseta camisetaMediana = new Camiseta("Moderna",Talla.MEDIUM);
        Camiseta camisetaGrande = new Camiseta("Urbana",Talla.LARGE);

        System.out.println("Debe salir: Camiseta estilo Tradicional talla pequeña");
        System.out.println(camisetaPequeña);
        System.out.println("Debe salir: Camiseta estilo Moderna talla mediana");
        System.out.println(camisetaMediana);
        System.out.println("Debe salir: Camiseta estilo Urbana talla grande");
        System.out.println(camisetaGrande);
    }
}
 