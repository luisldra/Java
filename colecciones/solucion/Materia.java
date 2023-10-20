package solucion;

import java.util.Objects;

/**
 * Materia que es inscrita por estudiantes en la U
 */
public class Materia {
    private String codigo;
    private String nombre;

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(codigo, materia.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
