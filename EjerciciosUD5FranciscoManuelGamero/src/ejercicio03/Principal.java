package ejercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux,nombre,apellidos;
		double notaMedia;
		int opcion,codAlumno=1;
		
		Alumno a1= new Alumno("Candi", "Alcantarilla", 6.4,codAlumno);
		codAlumno++;
		Alumno a2= new Alumno("Pedro", "Chen", 9.2,codAlumno);
		codAlumno++;
		Set<Alumno> lista = new HashSet<Alumno>();
		CrudAlumno c = new CrudAlumno(lista);
		c.agregarAlumno(a1);
		c.agregarAlumno(a2);
		
		do {
			System.out.println("""
					0. Salir
					1. Añadir un alumno.
					2. Mostrar un alumno.
					3. Mostrar todos los alumnos.
					4. Modificar la nota media de un alumno.
					5. Borrar un alumno.
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
				System.out.println("Introduzca la nota media:");
				aux = sc.nextLine();
				notaMedia = Double.parseDouble(aux);
				c.agregarAlumno(new Alumno(nombre,apellidos,notaMedia,codAlumno));
				codAlumno++;
				break;
			case 2:
				System.out.println("Introduzca el cod del alumno: ");
				aux = sc.nextLine();
				codAlumno = Integer.parseInt(aux);
				c.mostrarAlumno(codAlumno);
				break;
			case 3:
				c.mostrar();
				break;
			case 4:
				System.out.println("Introduzca el cod del alumno: ");
				aux = sc.nextLine();
				codAlumno = Integer.parseInt(aux);
				System.out.println("Introduzca la nueva nota media:");
				aux = sc.nextLine();
				notaMedia = Double.parseDouble(aux);
				c.modificarNotaMedia(codAlumno, codAlumno);
				break;
			case 5:
				System.out.println("Introduzca el cod del alumno: ");
				aux = sc.nextLine();
				codAlumno = Integer.parseInt(aux);
				c.eliminarAlumno(codAlumno);
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);
	}

}
