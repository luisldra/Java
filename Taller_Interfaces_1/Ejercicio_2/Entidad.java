package Taller_Interfaces_1.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Entidad {

    String nombre;
    List <IRentable> rentables = new ArrayList<IRentable>();

    public Entidad(String nombre) {
        this.nombre = nombre;
    }

    public void adicionarRentable(IRentable rentable) {
        
    }
    
    public double calcularRentabilidadPromedio() {
        return 1;
    }
}
