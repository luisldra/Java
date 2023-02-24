package Taller_Exceptions_3;

public class Restaurante {
    Menu menu;

    public Restaurante(Menu menu) {
        this.menu = menu;
    }

    public boolean adicionarPlato(String nombre)  {
        try {
            menu.adicionarPlato(nombre);
            return true;
        } catch (PlatoYaRegistradoException e) {
            return false;
        }
        
        
    }


}
