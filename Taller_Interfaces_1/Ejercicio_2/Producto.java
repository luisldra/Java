package Taller_Interfaces_1.Ejercicio_2;

public class Producto implements IRentable{
    
    double costo;
    double precioVenta;

    public Producto(double costo, double precioVenta) {
        this.costo = costo;
        this.precioVenta = precioVenta;
    }

    public double rentabilidad() {
        double rentabilidad = (precioVenta - costo) * 0.5;
        return rentabilidad;
    }

    
}
