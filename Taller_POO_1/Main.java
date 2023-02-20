package Taller_POO_1;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {
    
    public static void main (String[] args) {

        DecimalFormat formatea = new DecimalFormat("###,###.##");
        ArrayList<Venta> ventas = new ArrayList<Venta>();

        Celular cel1 = new Celular(150000);
        Celular cel2 = new Celular(200000);
        Tablet tab1 = new Tablet(300000);
        Tablet tab2 = new Tablet(250000);
        Portatil por1 = new Portatil(2000000);
        Portatil por2 = new Portatil(2500000);

        Venta v1 = new Venta(false, cel1);
        Venta v2 = new Venta(true, cel2);
        Venta v3 = new Venta(true, tab1);
        Venta v4 = new Venta(false, tab2);
        Venta v5 = new Venta(true, por1);
        Venta v6 = new Venta(false, por2);

        ventas.add(v1);
        ventas.add(v2);
        ventas.add(v3);
        ventas.add(v4);
        ventas.add(v5);
        ventas.add(v6);

        double total = 0.0;

        for(Venta v: ventas){
            total += v.precioFinal();
        }

        System.out.print("Dinero total de las ventas: "+formatea.format(total));
    }
}
