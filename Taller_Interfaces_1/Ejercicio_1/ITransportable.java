package Taller_Interfaces_1.Ejercicio_1;

public interface ITransportable {
    
    /**
     * el peso en la mascota viene desde la creacion del objeto
     * el peso del paquete es su volumen multiplicado por 4
     * @return peso en kg
     */

    public double calcularPeso();

    /**
     * En mascota depende del tamaño
     * volumen de la caja esta dado por la formula largo * ancho * alto
     * @return volumen m^3
     */

    public double calcularVolumen();
    
}
