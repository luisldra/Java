package Taller_POO_1;

public abstract class Dispositivo {
    double precioBase;

    public Dispositivo(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double  calcularPrecio();

    public abstract double  calcularPrecioT();

    




}
