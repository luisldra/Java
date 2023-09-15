package Taller_Enumeracion;

import java.time.LocalDate;
import java.time.Period;

/**
 * Información de una persona que será usada en una notaría.
 *
 * Ejercicio para el uso de ENUM.
 */
public class Persona {
    private String nombre;
    private EstadoCivil estadoCivil;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, EstadoCivil estadoCivil, LocalDate fechaNacimiento) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad(){
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }
}
