package Taller_Interfaces_1.Ejercicio_1;

public class ControlTransportables {
    public static void main(String[] args) {

        ControlTransportables control = new ControlTransportables();

        System.out.println("Debe mostrar volumen 0.024; peso 0.096 y precio 480");
        ITransportable transportable = new Paquete(0.4,0.3, 0.2);
        control.mostrarDatosTransporable(transportable);

        System.out.println("Debe mostrar volumen 2; peso 20 y precio 60000");
        transportable = new Mascota(20.0,'m');
        control.mostrarDatosTransporable(transportable);
    }

    public void mostrarDatosTransporable(ITransportable transportable) {
        Transportador transportador = new Transportador();
        System.out.println("Volumen: "+transportable.calcularVolumen()+
                ", Peso: "+transportable.calcularPeso());

        double precio = transportador.calcularPrecio(transportable);
        System.out.println("Precio: "+ precio);
    }
}
