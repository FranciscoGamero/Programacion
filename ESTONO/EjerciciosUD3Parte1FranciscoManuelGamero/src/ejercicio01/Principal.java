package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asignatura, aula, fecha;
		Examenes exam;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, vamos a hacer una cabecera de examenes");
		
		System.out.println("Introduzca el nombre de la asignatura: ");
		asignatura=sc.nextLine();
		
		System.out.println("Introduzca el aula donde se va a realizar el examen: ");
		aula=sc.nextLine();
		
		System.out.println("Introduzca la fecha de hoy: ");
		fecha=sc.nextLine();
		
		exam=new Examenes(asignatura,aula,fecha);
		exam.mostrarCabecera();
	}

}
