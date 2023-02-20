package Taller_Exceptions;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class Fecha {
    
    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public String crearFecha (){
        LocalDate fecha = LocalDate.of(año,mes,dia);
        DayOfWeek diaSemana = fecha.getDayOfWeek();

        String dia = diaSemana.toString();

        String valor = "";

        switch (dia){
            case "MONDAY":
                valor = "Lunes";
                break;
            case "TUESDAY":
                valor = "Martes";
                break;
            case "WEDNESDAY":
                valor = "Miercoles";
                break;
            case "THURSDAY":
                valor = "Jueves";
                break;
            case "FRIDAY":
                valor = "Viernes";
                break;
            case "SATURDAY":
                valor = "Sabado";
                break;
            case "SUNDAY":
                valor = "Domingo";
                break;
            default:
                valor = "No es un dia de la semana valido";
        }

        return valor;
    }

}
