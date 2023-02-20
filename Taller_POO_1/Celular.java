package Taller_POO_1;

public class Celular extends Dispositivo{
    int recargo = 2000;

    public Celular(double precioBase) {
        super(precioBase);
    }

    public double  calcularPrecio(){
        double valor = getPrecioBase();
        return valor;
       }
    
    public double calcularPrecioT() {
        double valor = getPrecioBase() + recargo;
        return valor;
        }
}

