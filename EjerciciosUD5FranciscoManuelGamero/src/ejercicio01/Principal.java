package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion, id=0;
		String aux, titulo, cuerpo;
		Scanner sc= new Scanner(System.in);
		List<Nota> listado = new ArrayList<Nota>();
		CrudNotas c = new CrudNotas(listado);
		
		listado.add(new Nota("Lista de la compra","Tomates, Lechugas, Sal",id));
		id++;
		listado.add(new Nota("Agenda","Base de datos, Programacion, Sistemas",id));
		id++;
		System.out.println("""
				*********************************
				Bienvenido al gestor de notas
				*********************************
				""");
		
		do {
		System.out.println("""
				0. Salir
				1. Buscar una nota por id.
				2. Mostrar el número de notas.
				3. Agregar una nota.
				4. Borrar una nota.
				""");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
			switch(opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro programa.");
				break;
			case 1:
				System.out.println("Introduzca el id de la nota: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				
				c.mostrarNota(c.buscarPorId(id));
				break;
			case 2:
				System.out.println(c.mostrarNumeroDeNotas());
				break;
			case 3:
				System.out.println("Introduzca el título de la nota:");
				titulo=sc.nextLine();
				System.out.println("Introduzca el cuerpo de la nota:");
				cuerpo=sc.nextLine();
				c.agregarNota(new Nota(titulo,cuerpo,id));
				id++;
				break;
			case 4:
				c.mostrarLista();
			 	System.out.println("Introduzca el id de la nota: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				c.borrarNota(c.buscarPorId(id));
				break;
			case 5: 
				System.out.println("Introduzca el id de la nota: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				
				System.out.println("Introduzca el título de la nota:");
				titulo=sc.nextLine();
				c.modificarTitulo(id, titulo);
			default:
				System.out.println("Opción no válida.");
			}
		} while(opcion!=0);
	}

}
