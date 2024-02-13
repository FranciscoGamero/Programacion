package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio01.Nota;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String aux, nombre, apellidos;

		int indice = 0, opcion, id, edad, cantidadHoras;
		double cuota = 200, precioPista, nuevaCuota;

		Socio s1;
		List<Socio> lista = new ArrayList<Socio>();
		CrudSocio cs = new CrudSocio(lista);

		Club c = new Club(cs);

		s1 = new Socio(indice, "Marco", "Vila", 18, cuota);
		indice++;

		lista.add(s1);

		lista.add(new Socio(indice, "Alejandro", "Acal", 18, cuota));
		indice++;
		System.out.println("""
				*********************************
				Bienvenido al gestor de socios del Club de Campo
				*********************************
				""");
		System.out.println("Introduzca la cuota base de los socios:");
		aux = sc.nextLine();
		cuota = Double.parseDouble(aux);

		do {
			System.out.println("""
					0. Salir
					1. Añadir un socio.
					2. Mostrar lista de socios.
					3. Mostar la información de un socio.
					4. Modificar la cuota de un socio.
					5. Borrar un socio.
					6. Calcular el precio de pista para el socio.
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro programa.");
				break;

			case 1:
				System.out.println("Introduzca el nombre: ");
				nombre = sc.nextLine();
				System.out.println("Introduzca los apellidos:");
				apellidos = sc.nextLine();
				System.out.println("Introduzca la edad:");
				aux = sc.nextLine();
				edad = Integer.parseInt(aux);
				c.getCs().agregarSocio(new Socio(indice, nombre, apellidos, edad, cuota));
				indice++;
				break;
			case 3:
				System.out.println("Introduzca el id del socio: ");
				aux = sc.nextLine();
				id = Integer.parseInt(aux);
				System.out.println(c.getCs().buscarSocioPorId(id));
				break;
			case 4:
				System.out.println("Introduzca el id del socio: ");
				aux = sc.nextLine();
				id = Integer.parseInt(aux);
				System.out.println("Introduzca la nueva cuota:");
				aux = sc.nextLine();
				nuevaCuota = Double.parseDouble(aux);
				c.getCs().modificarCuota(id, nuevaCuota);
				break;
			case 2:
				c.getCs().mostrarLista();
				break;
			case 5:
				System.out.println("Introduzca el id del socio: ");
				aux = sc.nextLine();
				id = Integer.parseInt(aux);
				c.getCs().borrarSocio(id);
				break;
			case 6:
				System.out.println("Introduzca el id del socio: ");
				aux = sc.nextLine();
				id = Integer.parseInt(aux);

				System.out.println("Introduzca el precio por hora de la pista:");
				aux = sc.nextLine();
				precioPista = Double.parseDouble(aux);

				System.out.println("Introduzca la cantidad de horas usadas:");
				aux = sc.nextLine();
				cantidadHoras = Integer.parseInt(aux);

				System.out.printf("El precio de la cuota mensual más la pista será: %.2f€\n",c.calcularPrecioPista(precioPista, id, cantidadHoras));
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);
	}

}
