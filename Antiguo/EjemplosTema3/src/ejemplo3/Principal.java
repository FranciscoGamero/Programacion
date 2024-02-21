package ejemplo3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String aux,nombreNuevo;
		double precioNuevo;
		int numeroRuedasNuevo;
		Vehiculo v=new Vehiculo("Amoto",1200.00,2);
		Vendedor ven=new Vendedor("Pepe",1200.00,2);
		System.out.println(ven);
		/*
		//mostrar
		System.out.println(v.getNombre());
		System.out.println(v.getPrecio());
		System.out.println(v.getNumeroRuedas());
		
		//modificar
		System.out.println("Introduzca el nombre del vehiculo");
		nombreNuevo=sc.nextLine();
		v.setNombre(nombreNuevo);
		System.out.printf("El nuevo nombre es: %s",v.getNombre());
		
		System.out.println("Introduzca el precio del vehiculo");
		aux=sc.nextLine();
		precioNuevo=Double.parseDouble(aux);
		v.setPrecio(precioNuevo);
		
		System.out.printf("El nuevo precio es: %.2f",v.getPrecio());
		
		System.out.println("Introduzca el número de ruedas");
		aux=sc.nextLine();
		numeroRuedasNuevo=Integer.parseInt(aux);
		v.setPrecio(precioNuevo);
		System.out.printf("El nuevo número de ruedas es: %d",v.getNumeroRuedas());*/
	}
}
