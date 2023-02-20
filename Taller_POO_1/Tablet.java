package Taller_POO_1;

public class Tablet extends Dispositivo{
    int recargo = 5000;
    double incremento = 0.05;

    public Tablet(double precioBase) {
        super(precioBase);
    }

   public double  calcularPrecio(){
    double valor = getPrecioBase() + (getPrecioBase() * incremento);
    return valor;
   }

   public double calcularPrecioT() {
    double valor = getPrecioBase() + recargo + (getPrecioBase() * incremento);
    return valor;
    
   }


}
