package excepciones1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10, denom=0;
		double res;
		Scanner sc= new Scanner(System.in);
		String aux;
		
		//Dentro del try va todo el código que puede dar un error, debe ir todo el código junto, no se separa
		try {
			res=num/denom;
			System.out.println("La división es: "+res);
			
		// Si no se sabe que error puede dar se pone la mas general, en este caso se podría poner RuntimeException
		} catch(ArithmeticException e) {
			System.err.println("Está intentando dividir entre 0");
		}		
		
	}

}
