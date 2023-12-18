package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tam=5,porcen=20;
		String aux, modelo, marca;
		double precioUnitario;
		boolean vendido, estadoMov;
		Movil lista[],movil,movil2,movil3,movil4,movil5;
		Vendedor gestion;
		
		lista= new Movil[tam];
		System.out.println("Bienvenido");
		gestion=new Vendedor(lista,0,0);
		movil= new Movil("Samsung","A12", false, true, 149.90);
		movil2= new Movil("Xiaomi","Readme", true, false, 149.90);
		movil3= new Movil("Samsung","A12 mini", false, true, 149.90);
		movil4= new Movil("Xiaomi","Readme pro", true, false, 149.90);
		movil5= new Movil("Apple","15 pro", false, false, 149.90);
		gestion.agregarMovil(movil);
		gestion.agregarMovil(movil2); 
		gestion.agregarMovil(movil3);
		gestion.agregarMovil(movil4);
		gestion.agregarMovil(movil5);
		System.out.println(gestion.comprobarNoVendidos());
		System.out.println(gestion.encontrarPorNombre("HJKHKH"));
		System.out.println(gestion.encontrarPorNombre("A12 mini"));
		//System.out.println(gestion.comprobarestado(gestion.encontrarPorNombre("A12 mini")));
		gestion.mostrarPrecio(gestion.calcularPrecio(gestion.comprobarestado(gestion.encontrarPorNombre("A12 mini")),
				movil3.getPrecioUnitario(), porcen));
		gestion.mostrarGanancias(gestion.calcularGanancias());
	}

}
