package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String aux;
		int porcen;
		Ordenador o= new Ordenador("1TB",3400.0,750,"HP");
		Sobremesa s = new Sobremesa("2TB",2666.0, 1100, "Acer",100);
		Portatil p = new Portatil("500GB", 1500.0, 500, "Lenovo", true, 150);
		
		System.out.println("Introduzca el porcentaje de ganancia:");
		
		aux=sc.nextLine();
		porcen=Integer.parseInt(aux);
		
		System.out.println("Calculamos el precio de venta al público de un ordenador");
		
		System.out.printf("%.2f€\n",o.calcularPrecioPVP(porcen));
		
		System.out.println("Calculamos el precio de venta al público de un ordenador de sobremesa");
		
		System.out.printf("%.2f€\n",s.calcularPrecioPVP(porcen));
		
		System.out.println("Calculamos el precio de venta al público de un portátil");
		
		System.out.printf("%.2f€\n",p.calcularPrecioPVP(porcen));
	}

}
