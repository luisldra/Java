package Taller_Interfaces_1.Ejercicio_1;

public class Mascota implements ITransportable{
    
    Double peso;
    char tamaño;

    public Mascota(Double peso, char tamaño) {
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public double calcularPeso(){
        return peso;
    }

    public double calcularVolumen(){

        switch (tamaño){
            case 's':
                return 0.125;
            case 'm':
                return 2;
            case 'l':
                return 8;
            default:
                return 0;

        }
    }


}
