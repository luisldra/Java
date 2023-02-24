package Taller_Exceptions_3;

public class ControlMenus {

	public static void main(String[] args) {
		ControlMenus control = new ControlMenus();
		control.pruebaMenus();
	}
	
	/**
	 * Se realizan pruebas de los principales métodos de Menu y Restaurante
	 */
	public void pruebaMenus() {
		// Crear un Menu 
		Menu menu = new Menu();
		System.out.println("Menú creado");
		
		System.out.println("-- DEBE SALIR: restaurante.PlatoYaRegistradoException"); 
		// Adicionar dos platos diferentes y uno igual
		try {
			menu.adicionarPlato("Crema de tomate");
			menu.adicionarPlato("Mondongo");
			menu.adicionarPlato("Mondongo");
		} catch (PlatoYaRegistradoException e) {
			System.out.println(e.getClass());
		}
		System.out.println("Cantidad de platos:  -- DEBE SER 2"); 
		System.out.println(menu.cantidadPlatos());
		
		//Crear un restaurante
		Restaurante restaurante = new Restaurante(menu);
		System.out.println("Restaurante creado");
		
		//Adicionar un plato nuevo al restaurante
		boolean adicionPlato1 = restaurante.adicionarPlato("Ensalada rusa");
		System.out.println("Pudo adicionar plato nuevo:  -- DEBE SER true"); 
		System.out.println(adicionPlato1);
		
		//Adicionar un plato repetido al restaurante
		boolean adicionPlato2 = restaurante.adicionarPlato("Ensalada rusa");
		System.out.println("Pudo adicionar plato repetido:  -- DEBE SER false"); 
		System.out.println(adicionPlato2);		
	}
}
