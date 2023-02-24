package Taller_Interfaces_1.Ejercicio_1;

public class Transportador {
    
    public double calcularPrecio(ITransportable transportable) {

        double precioVolumen = (transportable.calcularVolumen())*20000;

        double precioPeso = (transportable.calcularPeso())*3000;

        if (precioVolumen > precioPeso){
            return precioVolumen;
        }else{
            return precioPeso;
        }
    }
}
