package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux, nombre, apellidos, curso,letra;
		double notaMedia, nota;
		int edad, opcion,cantidad,tamanio;
		List<Alumno> lista = new ArrayList<>();
		Secretaria ges = new Secretaria(lista);
		ges.agregarAlumno(new Alumno("Cándida", "Alcantarilla", "1ºDAM", 8.7, 22));
		ges.agregarAlumno(new Alumno("Alejandro", "Acal", "2ºDAM", 6.3, 19));
		ges.agregarAlumno(new Alumno("Tomás", "Zarzosa", "1ºDAM", 9.1, 17));
		ges.agregarAlumno(new Alumno("Marco", "Pérez", "2ºDAM", 4, 18));
		ges.agregarAlumno(new Alumno("Dario", "Ruíz", "1ºDAM", 5.6, 20));
		ges.agregarAlumno(new Alumno("Antonio", "Mayo", "2ºDAM", 7, 21));



		/*
		 * System.out.println(ges.buscarMasPequenio());
		 */

		/*
		 * System.out.println(ges.buscarPrimero());
		 */

		/*
		 * ges.mostrarLista(ges.buscarPorLongitudNombre(5));
		 */

		System.out.println("----------------------------------------------");
		System.out.println("Bienvenido al gestor de la secretaría");
		System.out.println("----------------------------------------------");

		do {
			System.out.println("""
					\n0 - Salir.
					1 - Agregar un alumno.
					2 - Mostrar por edad.
					3 - Mostrar todos los alumnos.
					4 - Mostrar alumnos que empiecen por una letra.
					5 - Mostrar el tamaño de la lista de alumnos.
					6 - Buscar por curso y nota media.
					7 - Mostrar solo un nº de alumnos.
					8 - Buscar el alumno mas pequeño.
					9 - Buscar el primer alumno de la lista.
					10 - Buscar alumnos por tamaño del nombre.
					11 - Buscar alumnos por el tamaño de nombre y letra inicial.
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro gestor.");
				break;
			case 1:
				System.out.println("Introduzca el nombre del alumno: ");
				nombre = sc.nextLine();
				
				System.out.println("Introduzca el apellido del alumno: ");
				apellidos = sc.nextLine();
				
				System.out.println("Introduzca el curso del alumno: ");
				curso = sc.nextLine();
				
				System.out.println("Introduzca la nota media del alumno: ");
				aux = sc.nextLine();
				notaMedia = Double.parseDouble(aux);
				
				System.out.println("Introduzca la edad del alumno: ");
				aux = sc.nextLine();
				edad = Integer.parseInt(aux);
				
				ges.agregarAlumno(new Alumno(nombre, apellidos, curso, notaMedia, edad));
				break;
			case 2:
				System.out.println("Introduzca la edad");
				aux = sc.nextLine();
				edad = Integer.parseInt(aux);
				
				ges.mostrarLista(ges.filtrarPorEdad(edad));
				break;
			case 3:
				ges.mostrarLista(ges.getListaAlumnos());
				break;
			case 4:
				System.out.println("Inserte la letra inicial: ");
				letra=sc.nextLine();
				ges.mostrarLista(ges.buscarPorLetra(letra));
				break;
			case 5:
				 System.out.printf("La lista tiene una cantidad de %.0f alumnos",ges.contarLista(ges.getListaAlumnos()));
				 break;
			case 6:
				System.out.println("Inserte el curso: ");
				curso=sc.nextLine();
				System.out.println("Inserte la nota a superar: ");
				aux=sc.nextLine();
				nota=Double.parseDouble(aux);
				ges.mostrarLista(ges.buscarPorNota(nota, curso));
				break;
			case 7:
				System.out.println("Inserte la cantidad de alumnos que desea mostrar: ");
				aux=sc.nextLine();
				cantidad=Integer.parseInt(aux);
				ges.mostrarNAlumnos(cantidad);
				break;
			case 8:
				System.out.println(ges.buscarMasPequenio());
				break;
			case 9:
				System.out.println(ges.buscarPrimero());
				break;
			case 10:
				System.out.println("Inserte el tamaño del nombre: ");
				aux=sc.nextLine();
				tamanio=Integer.parseInt(aux);
				ges.mostrarLista(ges.buscarPorLongitudNombre(tamanio));
				break;
			case 11:
				System.out.println("Inserte la letra inicial: ");
				letra=sc.nextLine();
				System.out.println("Inserte el tamaño del nombre: ");
				aux=sc.nextLine();
				tamanio=Integer.parseInt(aux);
				ges.mostrarLista(ges.buscarPorLetraYLongitud(letra, tamanio));
				break;
			}
		} while (opcion != 0);
	}

}
