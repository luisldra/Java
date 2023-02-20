package Taller_POO_2.modelo;

import Taller_POO_2.proceso.Empacador;
import Taller_POO_2.proceso.Empaque;

public class ControlCubos {

	public static void main(String[] args) {
		ControlCubos controlCubos = new ControlCubos();
		controlCubos.pruebaCrearCubos();
	}
	
	/**
	 * Realiza pruebas básicas de funcionamiento de las clases de la fábrica de Cubos
	 */
	public void pruebaCrearCubos() {
			
		// Crear cubos rígidos
		Cubo cubo1 = new CuboRigido(10,2000);
		System.out.println("--Se crea un cubo rígido -- DEBE SER Lado 10 cm. y Precio $2380");
		System.out.println(cubo1);
		Cubo cubo3 = new CuboRigido(20,1000);
		System.out.println("--Se crea un cubo rígido -- DEBE SER Lado 20 cm. y Precio $1190");
		System.out.println(cubo3);
		
		// Crear cubos flexibles
		Cubo cubo2 = new CuboFlexible(10,2000,20);
		System.out.println("--Se crea un cubo flexible -- DEBE SER Lado 10 cm. y Precio $2475.2");
		System.out.println(cubo2);
		Cubo cubo4 = new CuboFlexible(20,1000,60);
		System.out.println("--Se crea un cubo flexible -- DEBE SER Lado 20 cm. y Precio $1261.4");
		System.out.println(cubo4);
		
		//Tratar de empacar dos cubos (sin crear previamente el empaque)
		Empacador empacador = new Empacador();
		boolean pudoEmpacar = empacador.empacar(cubo3);
		boolean cuboEmpacado = cubo3.estaEmpacado();
		System.out.println("--Se trata de empacar un cubo rígido -- DEBE SER true - true");
		System.out.println(pudoEmpacar+" - "+cuboEmpacado);
		pudoEmpacar = empacador.empacar(cubo4);
		cuboEmpacado = cubo4.estaEmpacado();
		System.out.println("--Se trata de empacar un cubo flexible -- DEBE SER false - false");
		System.out.println(pudoEmpacar+" - "+cuboEmpacado);
		
		// Se trata de empacar dos cubos en un empaque estrecho (pero con volumen mayor al del cubo flexible)
		Empaque empaque1 = new Empaque(5,5,100);
		pudoEmpacar=empacador.empacar(cubo1,empaque1);
		cuboEmpacado = cubo1.estaEmpacado();
		System.out.println("--Un empaque estrecho con un cubo rígido -- DEBE SER false - false");
		System.out.println(pudoEmpacar+" - "+cuboEmpacado);
		pudoEmpacar=empacador.empacar(cubo2,empaque1);
		cuboEmpacado = cubo2.estaEmpacado();
		System.out.println("--Un empaque estrecho con un cubo flexible -- DEBE SER true - true");
		System.out.println(pudoEmpacar+" - "+cuboEmpacado);
			
		// Se trata de empacar un cubo rígido en un empaque amplio
		Empaque empaque2 = new Empaque(12,12,12);
		pudoEmpacar=empacador.empacar(cubo1,empaque2);
		cuboEmpacado = cubo1.estaEmpacado();
		System.out.println("--Un empaque amplio con un cubo rígido -- DEBE SER true - true");
		System.out.println(pudoEmpacar+" - "+cuboEmpacado);

		// Se trata de empacar un cubo flexible en un empaque muy pequeño
		Empaque empaque3 = new Empaque(5,5,5);
		pudoEmpacar=empacador.empacar(cubo4,empaque3);
		cuboEmpacado = cubo4.estaEmpacado();
		System.out.println("--Un empaque muy pequeño con un cubo flexible -- DEBE SER false -false");
		System.out.println(pudoEmpacar+" - "+cuboEmpacado);
	}
}

