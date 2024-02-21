package examen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String nombre, apellidos, aux;

		int opcion, estado, tam = 10, i = 0, dorsal = 3;
		int juvenil = 1, veterano = 3;
		double distancia = 10.98, tiempo, factor;
		Corredor c, c1, c2, c3, auxi;
		Corredor lista[], listaaux[];

		Carrera carrera1;
		lista = new Corredor[tam];
		/*
		 * System.out.println("Introduzca el número de participantes:");
		 * aux=sc.nextLine(); tam=Integer.parseInt(aux); lista=new Corredor[tam];
		 * 
		 * System.out.println("Introduzca los kilómetros de la carrera:");
		 * aux=sc.nextLine(); distancia=Double.parseDouble(aux);
		 */
		carrera1 = new Carrera(lista, distancia, i);

		c1 = new Corredor("Gabriel ", "Montiel Muñoz", 1, juvenil, 10.5);
		carrera1.agregarCorredor(c1, i);
		i++;

		c2 = new Corredor("Jose Angel", "Zheng", 2, veterano, 10.7);
		carrera1.agregarCorredor(c2, i);
		i++;

		c3 = new Corredor("Alejandro ", "Pallares", 3, juvenil, 16.7);
		carrera1.agregarCorredor(c3, i);
		i++;
		do {
			System.out.println("""
					
					0 - Salir del programa
					1 - Agregar corredor
					2 - Calcular el tiempo
					3 - Devolver los veteranos
					4 - Modificar el tiempo
					5 - Calcular la media de tiempo en minutos por kilómetro
					6 - Mostrar la suma total de los juveniles
					7 - Mostrar el ganador de la carrera
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre del corredor");
				nombre = sc.nextLine();

				System.out.println("Introduzca los apellidos del corredor:");
				apellidos = sc.nextLine();
				System.out.println("""
						Introduzca la categoría del corredor:
						1 - Juvenil
						2 - Senior
						3 - Veterano
						""");
				aux = sc.nextLine();
				estado = Integer.parseInt(aux);

				System.out.println("Introduzca el tiempo del corredor:");
				aux = sc.nextLine();
				tiempo = Double.parseDouble(aux);

				dorsal++;

				c = new Corredor(nombre, apellidos, dorsal, estado, tiempo);
				carrera1.agregarCorredor(c, i);
				i++;
				break;
			case 2:
				System.out.println("Introduzca el dorsal del corredor:");
				aux = sc.nextLine();
				dorsal = Integer.parseInt(aux);
				auxi = carrera1.buscarPorDorsal(dorsal);
				if (auxi == null) {
					System.out.println("Corredor no encontrado.");
				} else {
					System.out.println("Introduzca el factor de conversion:");
					aux = sc.nextLine();
					factor = Double.parseDouble(aux);
					System.out.printf("El tiempo tras el factor es de: %.2f", carrera1.calcularTiempo(dorsal, factor));
				}
				break;
			case 3:
				System.out.println("""
						Introduzca que categoría desea buscar:
						1 - Juvenil
						2 - Senior
						3 - Veterano
						""");
				aux = sc.nextLine();
				estado = Integer.parseInt(aux);
				carrera1.mostrarListaV2(carrera1.buscarSeccion(estado));
				break;
			case 4:
				System.out.println("Introduzca el dorsal del corredor:");
				aux = sc.nextLine();
				dorsal = Integer.parseInt(aux);
				System.out.println("Introduzca el nuevo tiempo:");
				aux = sc.nextLine();
				tiempo = Double.parseDouble(aux);
				carrera1.modificarTiempo(dorsal, tiempo);
				break;
			case 5:
				System.out.println("Introduzca el dorsal del corredor:");
				aux = sc.nextLine();
				dorsal = Integer.parseInt(aux);
				System.out.printf("%.2f metros por segundo\n", carrera1.calcularMedia(dorsal));
				break;
			case 6:
				System.out.println("""
						Introduzca que categoría desea sumar el tiempo:
						1 - Juvenil
						2 - Senior
						3 - Veterano
						""");
				aux = sc.nextLine();
				estado = Integer.parseInt(aux);
				System.out.printf("La suma total del tiempo es de: %.2f segundos\n",
						carrera1.sumarTiempo(carrera1.buscarSeccion(estado)));

				break;
			case 7:
				System.out.println(carrera1.buscarGanador());
				break;
			case 0:
				System.out.println("Ha salido del programa.");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (opcion != 0);
	}

}
