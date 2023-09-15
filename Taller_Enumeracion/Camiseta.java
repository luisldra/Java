package Taller_Enumeracion;

public class Camiseta{

    String estilo;
    Talla talla;

    public Camiseta(String estilo, Talla talla) {
        this.estilo = estilo;
        this.talla = talla;

    }

    @Override
    public String toString() {
        return "Camiseta estilo " + estilo + ", talla " + talla.getTraducTalla() + "]";


    }

    

    

}