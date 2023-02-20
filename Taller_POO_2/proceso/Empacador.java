package Taller_POO_2.proceso;

import Taller_POO_2.modelo.Cubo;
import Taller_POO_2.modelo.CuboRigido;

public class Empacador {

    public boolean empacar (Cubo cubo, Empaque empaque){
        boolean valor = false;

        if (cubo.cabe(empaque)){
            valor = true;
            cubo.setEmpaque(empaque);;
        }
        return valor;
    }

    public boolean empacar (Cubo cubo){
        boolean valor = false;

        if (cubo instanceof CuboRigido){
            Empaque empaque = new Empaque(cubo.getLado()+0.5, cubo.getLado()+0.50, cubo.getLado()+0.50);
            empacar(cubo, empaque);
            cubo.setEmpaque(empaque);
            valor = true;
        }

        return valor;
    }
}
