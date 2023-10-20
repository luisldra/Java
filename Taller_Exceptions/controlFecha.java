package Taller_Exceptions;

public class controlFecha {

    public boolean validarFecha(int dia, int mes, int año){
         int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes < 13 && dia <= diasPorMes[mes]){
            Fecha fecha = new Fecha(año, mes, dia);
            fecha.crearFecha();

            return true;
        }else{
            return false;
        }
    }
}
