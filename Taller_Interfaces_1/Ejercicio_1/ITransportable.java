package Taller_Interfaces_1.Ejercicio_1;

public interface ITransportable {
    
    /**
     * calcular el peso de la mascota y de el paquete
     * el peso en la mascota viene desde la creacion del objeto
     * @return peso en kg
     */
    public double calcularPeso();

    /**
     * Calcular el volumen de la mascota y de el paquete
     * En mascota depende del tamaño
     * @return volumen m^3
     */

    public double calcularVolumen();
}
