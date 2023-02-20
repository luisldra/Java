package Taller_POO_2.modelo;

import Taller_POO_2.proceso.Empaque;

public class CuboRigido extends Cubo {

    public CuboRigido(double lado, double valorFabricacion) {
        super(lado, valorFabricacion);
    }
    
    public boolean cabe (Empaque empaque){
        boolean valor;

        if ((empaque.getAlto() > super.getLado()) && (empaque.getAncho() > super.getLado()) && (empaque.getLargo() > super.getLado())){
            valor = true;
        }else{
            valor = false;
        }

        return valor;
    }
    
}
