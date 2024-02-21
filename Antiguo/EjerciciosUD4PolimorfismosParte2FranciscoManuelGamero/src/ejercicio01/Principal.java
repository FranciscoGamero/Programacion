package ejercicio01;

import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String aux;
		int tam=4,index=0,anio,numEdicion;
		Publicacion lista[], l1,l2,r1,r2;
		Biblioteca b = new Biblioteca();
		
		boolean prestado=true, noPrestado=false;
		l1= new Libro("Guerra y Paz ","León Tolstói",1886, prestado,"978-8-5370-7202-8");
		l2= new Libro("Crimen y castigo","Fiódor Dostoyevski",1887, noPrestado,"978-9-9072-5965-0");
		r1= new Revista("National Geographic","Jill Tiefenthaler",2024, noPrestado,25);
		r2= new Revista ("Vogue","Arthur Baldwin Turnure",2023, noPrestado,10);
		
		lista= new Publicacion[tam];
		lista[index]=l1;
		index++;
		lista[index]=l2;
		index++;
		lista[index]=r1;
		index++;
		lista[index]=r2;
		index++;
	
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("Hay "+l1.cuentaPrestados(lista)+ " publicacoines prestadas");
		System.out.println("Introduzca hasta que año desea buscar:");
		aux=sc.nextLine();
		anio=Integer.parseInt(aux);
		System.out.println("Hay "+l1.cuentaPublicacionesAnterioresA(lista, anio)+ " publicaciones hasta el año "+anio);
		System.out.println("Introduzca el número de ediciones: ");
		aux=sc.nextLine();
		numEdicion=Integer.parseInt(aux);
		b.imprimirDatos(lista, numEdicion);
	}
}
