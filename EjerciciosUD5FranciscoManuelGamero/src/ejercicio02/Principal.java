package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio01.Nota;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String aux, nombre, apellidos;
		int indice=1, opcion, id,cantidadHoras;
		double cuota=200,precioPista, nuevaCuota;
		Socio s;
		Socio s1= new Socio(indice,"Marco","Vila",18,cuota);
		List<Socio> lista= new ArrayList();
		CrudSocio cs = new CrudSocio(lista);
		Club c = new Club(cs);
		indice++;
		
		
		lista.add(s1);
		lista.add(new Socio(2,"Alejandro","Vila",18,cuota));
		
		System.out.println("""
				*********************************
				Bienvenido al gestor de socios del Club de Campo
				*********************************
				""");
		
		do {
		System.out.println("""
				0. Salir
				1. Añadir un socio
				2. Mostar la información de un socio.
				3. Modificar la cuota de un socio.
				4. Borrar un socio.
				5. Calcular el precio de pista para el socio.
				""");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
			switch(opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro programa.");
				break;
			case 1:
				System.out.println("Introduzca el id del socio: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				
				
				break;
			case 2:
				System.out.println("Introduzca el id del socio: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				System.out.println(cs.buscarSocioPorId(id));
				break;
			case 3:
				System.out.println("Introduzca el id del socio: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				System.out.println("Introduzca la nueva cuota:");
				break;
			case 4:
				c.mostrarLista();
			 	System.out.println("Introduzca el id del socio: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				c.borrarNota(c.buscarPorId(id));
				break;
			case 5: 
				System.out.println("Introduzca el id del socio: ");
				aux=sc.nextLine();
				id=Integer.parseInt(aux);
				
				System.out.println("Introduzca el precio por hora de la pista:");
				aux=sc.nextLine();
				precioPista=Double.parseDouble(aux);

				System.out.println("Introduzca la cantidad de horas usadas:");
				aux=sc.nextLine();
				cantidadHoras=Integer.parseInt(aux);
				
				System.out.println(c.calcularPrecioPista(precioPista, id, cantidadHoras));
			default:
				System.out.println("Opción no válida.");
			}
		} while(opcion!=0);
	}

}
