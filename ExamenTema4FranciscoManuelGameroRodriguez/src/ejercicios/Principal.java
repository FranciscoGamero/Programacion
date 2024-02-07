package ejercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux, direccion, matricula;
		int tam, opcion;
		double cantidadFija, sumaFurgoneta, sumaNavidad;
		Vehiculo lista[];
		Parking p;

		Vehiculo v1 = new Vehiculo("1D32F", 10.1);
		Vehiculo f1 = new Furgoneta("L2KJL", 25.9, 4);
		Vehiculo f2 = new Furgoneta("32LIH", 15.2, 10);
		Vehiculo m1 = new Moto("4OUHM", 40.5, 450);
		Vehiculo m2 = new Moto("2OPJJ", 33.7, 150);

		System.out.println("""
				*********************************************
					Bienvenido al gestor de Parking
				*********************************************
					""");

		System.out.println("Introduzca la capacidad de su parking:");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		lista = new Vehiculo[tam];
		System.out.println("Introduzca la dirección del parking:");
		direccion = sc.nextLine();

		lista[0] = v1;
		lista[1] = m1;
		lista[2] = f2;
		lista[3] = f1;
		lista[4] = m2;

		p = new Parking(lista, direccion);

		System.out.println("Introduzca la cantidad fija por minuto de su parking: ");
		aux = sc.nextLine();
		cantidadFija = Double.parseDouble(aux);

		System.out.println("Introduzca el añadido a las furgonetas de mas de 4 metros: ");
		aux = sc.nextLine();
		sumaFurgoneta = Double.parseDouble(aux);

		System.out.println("Introduzca el añadido por Navidad: ");
		aux = sc.nextLine();
		sumaNavidad = Double.parseDouble(aux);

		do {
			System.out.println("""
					*****************************************************
						0. Salir del programa.
						1. Calcular el precio de un vehículo.
						2. Mostrar datos de todos los vehículos.
						3. Calcular lo recaudado solo por las motos.
						4. Calcular el precio de un vehículo en Navidad.
					*****************************************************
						""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 0:
				System.out.println("""
						---------------------------------------------
							Gracias por usar nuestro gestor
						---------------------------------------------
							""");
				break;
			case 1:
				System.out.println("Introducza la matrícula del vehículo:");
				matricula = sc.nextLine();
				System.out.printf("El precio por el estacionamiento de su vehículo es: %.2f€\n",
						p.calcularPrecioUnVehiculo(p.buscarPorMatricula(matricula), cantidadFija, sumaFurgoneta));
				break;
			case 2:
				p.mostrarListaVehiculos();
				break;
			case 3:
				System.out.printf("El total recaudado por las motos es de: %.2f€\n",
						p.calcularRecaudadoMotos(cantidadFija, sumaFurgoneta));
				break;
			case 4:
				System.out.println("Introducza la matrícula del vehículo:");
				matricula = sc.nextLine();
				System.out.printf("El precio por el estacionamiento de su vehículo en Navidad es: %.2f€\n",
						p.calcularPrecioUnVehiculoNavidad(v1, cantidadFija, sumaFurgoneta, sumaNavidad));
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (opcion != 0);
	}

}
