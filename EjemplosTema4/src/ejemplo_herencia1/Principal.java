package ejemplo_herencia1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String aux;
		double fijo=1500;
		Trabajador t1=new Trabajador("Pedro","Junior","12345678l");
		Empleado e=new Empleado("Antonio","Senior","87654321a",2000.00,15.0);
		Empleado e2= new Empleado("3C",1500.0, 12.5);
		Consultor c= new Consultor("2Z", 41, 3);
		
		System.out.println(t1);
		System.out.println(t1.calcularPago()+"€");
		System.out.println(t1.calcularPagoV2()+"€");
		System.out.println(t1.calcularPagoV3(fijo));
		System.out.println("******************************************");
		System.out.println(e);
		System.out.println(e.calcularPago()+"€");
		System.out.println(e.calcularPagoV2()+"€");
		System.out.println(e.calcularPagoV3(fijo)+"€");
		System.out.println("******************************************");
		System.out.println(e2);
		System.out.println(e2.calcularPago()+"€");
		System.out.println(e2.calcularPagoV2()+"€");
		System.out.println(e2.calcularPagoV3(fijo)+"€");
		System.out.println("******************************************");
		System.out.println(c);
		System.out.println(c.calcularPago()+"€");
		System.out.println(c.calcularPagoV2()+"€");
		System.out.println(c.calcularPagoV3(fijo)+"€");
		System.out.println("************************ PONER DE BAJA *******************");
		e.darBaja();
		System.out.println(e);

	}

}
