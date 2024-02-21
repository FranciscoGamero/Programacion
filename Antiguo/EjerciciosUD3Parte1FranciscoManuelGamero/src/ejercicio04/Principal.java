package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		double radio, altura,volumen;
		Cilindro ci1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Vamos a calcular el volumen de un cilindro");
		System.out.println("Introduzca los centimetros del radio del cilindro");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		System.out.println("Introduzca los centimetros de la altura del cilindro");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		ci1=new Cilindro(radio, altura);
		ci1.mostrarVolumen(ci1.calcularVolumen());
	}

}
