package ejercicioTipoExamen2ConSet;


import java.util.HashSet;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double capacidadTrastero, precioTrastero;
		String aux, direccion;
		int numTrastero = 4, opcion, opcion2;
		boolean estadoTrastero;

		Oficina lista = new Oficina(new HashSet<Trastero>());
		
		lista.agregarTrastero(new Trastero(50, "hola123", 0, 500, true)); 
		lista.agregarTrastero(new Trastero(10, "hola321", 1, 120, true));
		lista.agregarTrastero(new Trastero(150, "adios123", 2, 1500, false));
		lista.agregarTrastero(new Trastero(200, "adios321", 3, 2500, false));
		
		System.out.println("-".repeat(50));
		System.out.println("Bienvenido al Gestor de Trasteros");
		System.out.println("-".repeat(50));
		System.out.println("");
		do {
			System.out.println("""
					0 - Salir.
					1 - Agregar un trastero.
					2 - Imprimir todos los trasteros.
					3 - Buscar trasteros por precio.
					4 - Mostrar el trastero mas caro.
					5 - Eliminar un trastero.
					6 - Modificar el precio de un trastero.
					7 - Mostrar trasteros no ocupados.
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar el diccionario");
				break;
			case 1:
				System.out.println("Inserte los metros cuadrados del trastero: ");
				aux = sc.nextLine();
				capacidadTrastero = Double.parseDouble(aux);
				System.out.println("Inserte la dirección del trastero: ");
				direccion = sc.nextLine();
				System.out.println("Inserte el precio del trastero: ");
				aux = sc.nextLine();
				precioTrastero = Double.parseDouble(aux);
				do {
					System.out.println("""
							1 - Está ocupado.
							2 - No está ocupado.
							""");
					aux = sc.nextLine();
					opcion2 = Integer.parseInt(aux);
					switch (opcion2) {
					case 1:
						lista.agregarTrastero(new Trastero(capacidadTrastero,direccion,numTrastero,precioTrastero,true));
						break;
					case 2:
						lista.agregarTrastero(new Trastero(capacidadTrastero,direccion,numTrastero,precioTrastero,false));
						break;
					}
				} while (opcion2 != 0);
				break;
			case 2:
				lista.mostrarLista(lista.getLista());				
				break;
			case 3:
				System.out.println("Introduzca el precio del trastero: ");
				aux = sc.nextLine();
				precioTrastero = Double.parseDouble(aux);
				lista.mostrarLista(lista.buscarPorPrecio(precioTrastero));
				break;
			case 4:
				System.out.println(lista.buscarMasCaro());
				break;
			case 5:
				System.out.println("Inserte el numero del trastero: ");
				aux= sc.nextLine();
				numTrastero= Integer.parseInt(aux);
				lista.eliminarTrastero(numTrastero);
				break;
			case 6:
				System.out.println("Inserte el numero del trastero: ");
				aux= sc.nextLine();
				numTrastero= Integer.parseInt(aux);
				System.out.println("Inserte el nuevo precio del trastero: ");
				aux = sc.nextLine();
				precioTrastero = Double.parseDouble(aux);
				lista.modificarPrecio(numTrastero, precioTrastero);
				break;
			case 7:
				lista.mostrarNoOcupados();
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
	} while(opcion!=0);

}
}
