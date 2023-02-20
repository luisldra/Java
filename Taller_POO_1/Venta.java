package Taller_POO_1;

public class Venta {
    boolean tarjeta;
    Dispositivo equipo;

    public Venta(boolean tarjeta, Dispositivo equipo) {
        this.tarjeta = tarjeta;
        this.equipo = equipo;
    }


    public double precioFinal(){
        double precio;

        if (tarjeta){
            precio = equipo.calcularPrecioT();
        }else{   
            precio = equipo.calcularPrecio();
        }
        return precio;

    }

}
