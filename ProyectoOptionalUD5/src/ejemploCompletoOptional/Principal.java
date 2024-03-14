package ejemploCompletoOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String aux, nombre, apellidos, curso;
		int id=1, op=0, salir=0, edad, idBuscar, opSubmenu;
		
		List<Alumno> lista = new ArrayList<Alumno>();
		
		Alumno a1 = new Alumno(id, "Pablo", "Cámara García", 19, "1ºDAM");
		id++;
		Alumno a2 = new Alumno(id, "José Carlos", null, 19, "1ºDAM");
		id++;
		Alumno a3 = new Alumno(id, "Rafalillo", "El Pillo", 20, null);
		id++;
		Alumno a4 = null;
		id++;
		Alumno a5 = new Alumno(id, null, "Segura Rodríguez", 20, null);
		id++;
		Alumno a6 = new Alumno(id, "Juan", "Romero Romero", 23, "1ºDAM");
		id++;
		Alumno a7 = null;
		id++;
		Alumno a8 = new Alumno(id, "Carlos", null, 19, "1ºDAM");
		id++;
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);
		lista.add(a7);
		lista.add(a8);
		
		Colegio c = new Colegio(lista, lista.size());
		
		
		System.out.println("Bienvenido al programa");
		
		do {
			System.out.println("""
					
					Seleccione una opción:
					 1. Mostrar listado de alumnos
					 2. Agregar un alumno
					 3. Mostrar un alumno
					 4. Mostrar alguna propiedad de un alumno
					 5. Mostrar lista cambiando alumnos no disponibles por dummys
					 
					 0. Salir
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
			case 1:
				c.mostrarLista();
				break;
				
			case 2:
				System.out.println("Diga nombre del alumno:");
				nombre=sc.nextLine();
				System.out.println("Diga apellidos del alumno:");
				apellidos=sc.nextLine();
				System.out.println("Diga la edad del alumno:");
				aux=sc.nextLine();
				edad=Integer.parseInt(aux);
				System.out.println("Diga el curso del alumno:");
				curso=sc.nextLine();
				
				lista.add(new Alumno(id, nombre, apellidos, edad, curso));
				id++;
				c.setNumAlumnos(lista.size());
				break;
				
			case 3:
				System.out.println("Diga id del alumno a buscar:");
				aux=sc.nextLine();
				idBuscar=Integer.parseInt(aux);
				
				c.mostrarMensajeAlumno(c.findById(idBuscar));
				break;
				
			case 4:
				System.out.println("Primero, diga el id del alumno:");
				c.mostrarLista();
				
				aux=sc.nextLine();
				idBuscar=Integer.parseInt(aux);
				
				System.out.println("""
						
						Seleccione qué propiedad mostrar:
						 1. Nombre
						 2. Apellidos
						 3. Edad
						 4. Curso
						""");
				aux=sc.nextLine();
				opSubmenu=Integer.parseInt(aux);
				
				switch(opSubmenu) {
				case 1:
					c.mostrarNombreAlumno(c.findById(idBuscar));
					break;
					
				case 2:
					c.mostrarApellidosAlumno(c.findById(idBuscar));
					break;
					
				case 3:
					c.mostrarEdadAlumno(c.findById(idBuscar));
					break;
					
				case 4:
					c.mostrarCursoAlumno(c.findById(idBuscar));
					break;
				}
				break;
				
			case 5:
				Alumno dummy = new Alumno(999, "DUMMY", "DUMMYDUMMY", 99, "1ºDAM");
				c.cambiarAlumnoPorDummy(dummy);
				System.out.println("Alumnos no disponibles cambiados por dummys");
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.err.println("Opción no válida.");
				break;
				
			}
			
		}while(op!=salir);
		
		System.out.println("Gracias por usar el programa.");

	}

}
