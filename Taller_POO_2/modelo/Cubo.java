package Taller_POO_2.modelo;

import Taller_POO_2.proceso.Empaque;

public abstract class Cubo {
    private double lado;
    private double valorFabricacion;
    private Empaque empaque;

    public Cubo(double lado, double valorFabricacion) {
        this.lado = lado;
        this.valorFabricacion = valorFabricacion;
        this.empaque = null;
    }

    public double getLado() {
        return lado;
    }

    public boolean estaEmpacado(){
        if(empaque!=null){
            return true;
        }else{
            return false;
        }
    }

    public double volumen(){
        double valor = Math.pow(lado, 3);
        return valor;
    }

    public double precio (){
        double valor = 0.0;
        valor = (valorFabricacion * 1.19);
        return valor;
    }

    public abstract boolean cabe (Empaque empaque);
    
    public String toString(){
        return "Lado: " + lado + "cm. y Precio $" + precio();
    }

    public void setEmpaque(Empaque empaque) {
        this.empaque = empaque;
    }

    
}
