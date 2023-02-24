package Taller_Interfaces_1.Ejercicio_1;

public class Paquete implements ITransportable {
    Double largo;
    Double ancho;
    Double alto;

    public Paquete(Double largo, Double ancho, Double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularPeso(){
        double peso = calcularVolumen() * 4;
        return peso;
    }

    public double calcularVolumen(){
        double volumen = (largo * ancho * alto); 
        return volumen;
    }
}
