package ejercicio04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre,nuevoNombre, aux,numero;
		int opcion, idContacto = 2;

		Contacto c1 = new Contacto("Candi", 1);
		Contacto c2 = new Contacto("Pedro", 2);
		Map<Contacto, String> lista = new HashMap();
		CrudContacto cC = new CrudContacto(lista);
		cC.agregarContacto(c1, "123-456-789");
		cC.agregarContacto(c2, "987-654-321");

		do {
			System.out.println("""
					0. Salir
					1. Añadir un contacto.
					2. Mostrar un contacto.
					3. Modificar el nombre de un contacto.
					4. Borrar un contacto.
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro programa.");
				break;
			case 1:
				System.out.println("Introduzca el nombre del contacto:");
				nombre = sc.nextLine();
				idContacto++;
				System.out.println("Introduzca el número del contacto:");
				numero=sc.nextLine();
				cC.agregarContacto(new Contacto(nombre, idContacto), numero);
				break;
			case 2:
				System.out.println("Introduzca el nombre del contacto: ");
				nombre = sc.nextLine();
				cC.mostrarContacto(nombre);
				break;
			case 3:
				System.out.println("Introduzca el nombre del contacto: ");
				nombre = sc.nextLine();
				System.out.println("Introduzca el nuevo nombre del contacto:");
				nuevoNombre = sc.nextLine();
				cC.modificarNombre(nombre, nuevoNombre);
				break;
			case 4:
				System.out.println("Introduzca el nombre del contacto: ");
				nombre = sc.nextLine();
				cC.borrarContacto(nombre);
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);
	}
}
