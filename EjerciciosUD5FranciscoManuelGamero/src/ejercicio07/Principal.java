package ejercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double impuestoLujo=25, impuestoCaducidad=20; // se pedirian por teclado antes de ejecutar el resto del programa
		int opcion, cero=0;
		
		List<LineaVenta> lista= new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		String aux;
		Venta todo = new Venta(lista);
		
		Producto e1= new Electronica(1,"Batería", 10,impuestoLujo);
		Producto e2= new Electronica(2, "Redmi Note 12", 250,impuestoLujo);
		Producto a1= new Alimentacion(3, "Pollo asado", 10, 15,impuestoCaducidad);
		Producto a2= new Alimentacion(4, "Lechuga", 5, 1, impuestoCaducidad);
		
		LineaVenta v1= new LineaVenta(a1, 2);
		lista.add(new LineaVenta(a1, 2));
		LineaVenta v2= new LineaVenta(a2, 3);
		lista.add(new LineaVenta(a2, 2));
		LineaVenta v3= new LineaVenta(e1, 4);
		lista.add(new LineaVenta(e1, 2));
		LineaVenta v4= new LineaVenta(e2, 1);
		lista.add(new LineaVenta(e2, 2));
		
	        System.out.println("Bienvenido al programa");
	        System.out.println("----------------------");
	        do{
	            System.out.println("\n---------------------------------");
	            System.out.println("""
	                    \n0 - Salir
	                    1 - Mostrar Ticket
	                    2 - Mostrar lista de productos
	                    """);
	            System.out.println("¿Qué desea hacer?");
	            aux=sc.nextLine();
	            opcion=Integer.parseInt(aux);
	            System.out.println("\n-----------------------------------------------------------------");
	            switch(opcion){
	            case 0:
	                System.out.println("Saliendo...");
	                break;
	            case 1:
	            	todo.mostrarLista();
	                break;
	            case 2:
	            	todo.mostrarTodo();
	                break;

	            default:
	                System.out.println("Opción no válida");
	                break;
	            }
	        }while(opcion!=cero);
	}
}

