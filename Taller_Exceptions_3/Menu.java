package Taller_Exceptions_3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<String> platos= new ArrayList<String>();
    ;

    public void adicionarPlato(String nombre) throws PlatoYaRegistradoException {

        if(!platoRegistrado(nombre)){
            platos.add(nombre);
        }else{
            throw new PlatoYaRegistradoException("El nombre del plato ya esta registrado");
        }
    }

    public boolean platoRegistrado(String nombre) {
        boolean registrado = false;

        if(platos.contains(nombre)){
            registrado = true;
        }
        return registrado;
    }

    public int cantidadPlatos() {
        return platos.size();
    }
}
