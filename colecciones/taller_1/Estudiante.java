package taller_1;
import java.util.HashSet;
import java.util.Set;

import solucion.Materia;

public class Estudiante {
    String cedula;
    String nombre;
    Set<Materia>materias;

    public Estudiante(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this. materias = new HashSet<>();
    }

    public boolean adicionarMateria(String codigo, String nombre){
        // Realiza la validacion de que no sea igual internamente en materia con lo que hicimos de hashmap / equals
        return materias.add(new Materia(codigo, nombre));
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + nombre + " Cantidad de Materias: "+ materias.size() +"]";
    }

    
}
