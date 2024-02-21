package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String aux,categoria;
		int opcion, cero=0;
		double cilindrada,potencia,impuesto,impuestoFurgoneta;
		
		Motocicleta m;
		Furgoneta f;
		Coche c;
			
		do {
			System.out.println("""
					1 - Para calcular el precio del impuesto de una motocicleta.
					2 - Para calcular el precio del impuesto de una furgoneta.
					3 - Para calcular el precio de un coche.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
			case 1:
				System.out.println("Introduzca la cilindrada de la motocicleta:");
				aux=sc.nextLine();
				cilindrada=Double.parseDouble(aux);
				System.out.println("Introduzca la potencia de la motocicleta:");
				aux=sc.nextLine();
				potencia=Double.parseDouble(aux);
				System.out.println("Introduzca la categoría de la bicicleta:");
				categoria=sc.nextLine();
			
				System.out.println("Introduzca el impuesto inicial:");
				aux=sc.nextLine();
				impuesto=Double.parseDouble(aux);
				
				m=new Motocicleta(cilindrada,potencia,categoria);
				
				System.out.printf("El impuesto total es de: %.2f€\n",m.calcularImpuesto(impuesto, cero));
				break;
				
			case 2:
				System.out.println("Introduzca la cilindrada de la furgoneta:");
				aux=sc.nextLine();
				cilindrada=Double.parseDouble(aux);
				
				System.out.println("Introduzca la potencia de la furgoneta:");
				aux=sc.nextLine();
				potencia=Double.parseDouble(aux);
				
				System.out.println("Introduzca la categoría de la furgoneta:");
				categoria=sc.nextLine();
				
				System.out.println("Introduzca el impuesto inicial:");
				aux=sc.nextLine();
				impuesto=Double.parseDouble(aux);
				
				System.out.println("Introduzca el impuesto adicional por transporte de mercancías:");
				aux=sc.nextLine();
				impuestoFurgoneta=Double.parseDouble(aux);
				f=new Furgoneta(cilindrada,potencia,categoria);
				
				System.out.printf("El impuesto total es de: %.2f€\n",f.calcularImpuesto(impuesto, impuestoFurgoneta));
				break;
			case 3:
				System.out.println("Introduzca la cilindrada del coche:");
				aux=sc.nextLine();
				cilindrada=Double.parseDouble(aux);
				
				System.out.println("Introduzca la potencia de del coche:");
				aux=sc.nextLine();
				potencia=Double.parseDouble(aux);
				
				System.out.println("Introduzca la categoría de del coche:");
				categoria=sc.nextLine();
				
				System.out.println("Introduzca el impuesto inicial");
				aux=sc.nextLine();
				impuesto=Double.parseDouble(aux);
				
				c=new Coche(cilindrada,potencia,categoria);
				System.out.printf("El impuesto total es de: %.2f€\n",c.calcularImpuesto(cilindrada, cero));
				break;
			default:
					System.out.println("Opción no válida.");
		}
			
		} while(opcion!=0);

	}

}
