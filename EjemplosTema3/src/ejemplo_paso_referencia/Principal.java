package ejemplo_paso_referencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		Scanner sc = new Scanner(System.in);
		
		int diaAct, mesAct;
		
		Fecha nacimiento = new Fecha(8, 07, 1976);
		Fecha contratacion = new Fecha(17, 10, 2004);
		
		Empleado empleado = new Empleado("Ángel", "Naranjo", nacimiento, contratacion);
		
		System.out.println(empleado);
		
		System.out.println("Qué día es hoy");
		aux = sc.nextLine();
		diaAct = Integer.parseInt(aux);
		
		System.out.println("¿Qué mes?");
		aux = sc.nextLine();
		mesAct = Integer.parseInt(aux);
		
		Fecha actual = new Fecha(diaAct, mesAct);
		empleado.felicitarCumple(actual);
		
		System.out.println(empleado);
		System.out.println("****************");
		empleado.rejuvenecer(nacimiento);
		System.out.println(empleado);
		// Compara con el paso por copia
		/*
		 * int a=2; Numero miNumero= new Numero ();
		 * System.out.println(miNumero.modificar(a));//Cambia la copia, vale 6
		 * miNumero.mostrar(a);
		 */// El a del main no ha cambiado, vale 2
	}

}
