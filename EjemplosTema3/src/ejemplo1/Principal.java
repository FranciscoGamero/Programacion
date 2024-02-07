package ejemplo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux,nombre,calle;
		int edad;
		double notaMedia;
		Alumno a1;
		Scanner sc=new Scanner(System.in);
		//Instanciamos un objeto con valores
		
		System.out.println("Diga el nombre: ");
		nombre=sc.nextLine();
		System.out.println("Diga edad: ");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		System.out.println("Diga nota media: ");
		aux=sc.nextLine();
		notaMedia=Double.parseDouble(aux);
		System.out.println("Diga la calle de residencia: ");
		calle=sc.nextLine();
	
		a1=new Alumno (nombre, edad, notaMedia);
		
		a1.mostrarDatos(calle);
	// Alumno a2;
	//	a2=new Alumno ();
	}
}
