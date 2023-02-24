package Soluciones_excepciones.Dia_Semana;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class Fecha {

    /**
     * Retorna el día de la semana de una fecha dada
     * @return día que corresponde a la fecha ingresada.
     */
    public DayOfWeek diaSemana(int anho, int mes, int dia){
        LocalDate fecha = LocalDate.of(anho, mes,dia);
        return fecha.getDayOfWeek();
    }

}