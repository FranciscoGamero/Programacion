package ejercicio01V2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		int num1, num2;
		Exception eAux = null;
		Calculadora c = new Calculadora();
		do {
			try {
				System.out.println("Inserte el primer numero");
				aux=sc.nextLine();
				num1=Integer.parseInt(aux);
				System.out.println("Inserte el segundo numero");
				aux=sc.nextLine();
				num2=Integer.parseInt(aux);
				System.out.println(c.dividirEnteros(num1, num2));
				System.out.println(c.sumarEnteros(num1, num2));
				
			} catch(RuntimeException e) {
				System.out.println("Error inesperado");
				eAux=e;
			}
		} while(eAux != null);

	}

}
