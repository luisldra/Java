package Taller_POO_2.modelo;

import Taller_POO_2.proceso.Empaque;

public class CuboFlexible extends Cubo{
    int elasticidad;

    public CuboFlexible(double lado, double valorFabricacion, int elasticidad) {
        super(lado, valorFabricacion);
        this.elasticidad = elasticidad;
    }

    public boolean cabe (Empaque empaque){
        boolean valor;
        if(empaque.volumen() > volumen()){
            valor = true;
        }else{
            valor = false;
        }
        return valor;
    }

    public double precio (){
        double valor = super.precio();

        if (elasticidad < 50){
            valor = valor * 1.04;
        } else {
            valor = valor * 1.06;            
        }
        return valor;
    }
    
    
    
}
