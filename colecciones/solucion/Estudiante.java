package solucion;

import java.util.HashSet;
import java.util.Set;

/**
 * Un estudiante que inscribe materias en la U
 */
public class Estudiante {
    private String cedula;
    private String nombre;
    private Set<Materia> materias;

    public Estudiante(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public String getCedula() {
        return this.cedula;
    }

    /**
     * Adicionar una nueva materia a lista de inscritas
     *
     * @return true si se pudo adicionar (no estaba ya en las inscritas)
     *   o false en caso contrario
     */
    public boolean adicionarMateria(String codigo, String nombre){
        return materias.add(new Materia(codigo,nombre));
    }

    @Override
    public String toString() {
        return nombre + "   "+materias.size()+" materias";
    }
}
