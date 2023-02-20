package Taller_POO_1;

public class Portatil extends Dispositivo{
    
    int recargo = 10000;
    double incremento = 0.1;

    public Portatil(double precioBase) {
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
