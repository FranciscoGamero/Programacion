package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		double radio, area,areaM;
		Circulo c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Vamos a calcular el area de un circulo");
		System.out.println("Introduzca los centimetros del radio del circulo");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		c=new Circulo(radio);
		area=c.calcularAreaCm();
		System.out.printf("El área del círculo es: %.2fcm^2", area);
		areaM=c.pasarAMCuadrado(area);
		System.out.printf("\nEl área del círculo es: %.2fm^2", areaM);
	}

}
