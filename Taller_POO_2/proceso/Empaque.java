package Taller_POO_2.proceso;

public class Empaque {
    double largo;
    double ancho;
    double alto;

    public Empaque(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double volumen(){
        double valor = largo * ancho * alto;
        return valor;
    }
}
