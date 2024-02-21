package ejemplo2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, aux;
		double notaPro,notaBD,media;
		Alumno a1;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Introduzca el nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Introduzca la nota de Programación");
		aux=sc.nextLine();
		notaPro=Double.parseDouble(aux);
		
		System.out.println("Introduzca la nota de Base de Datos");
		aux=sc.nextLine();
		notaBD=Double.parseDouble(aux);
		
		a1=new Alumno(nombre, notaPro, notaBD);
		
		media=a1.calcularMedia();
		
		a1.mostrarMedia(media);
		
		//se podria hacer con:  a1.mostrarMedia(a1.calcularMedia());
	}

}
