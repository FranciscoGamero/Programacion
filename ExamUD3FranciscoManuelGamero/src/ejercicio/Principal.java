package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String aux,direccion;
		
		int opcion, metrosCuadrados, estado,tam,cont=0;
		int nuevo=1, seminuevo=2,reformar=3,numVendedores;
		int id, porcen;
		
		double precioVenta,precioFinal,ganancias;
		
		Piso lista[],p,prueba1,prueba2;
		Inmobiliaria gestion;
		
		System.out.println("Introduzca cuantos pisos va a tener como máximo: ");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		lista= new Piso[tam]; //Pedir por teclado 
		System.out.println("Introduzca el número de vendedores que dispone su inmobiliaria: ");
		aux=sc.nextLine();
		numVendedores=Integer.parseInt(aux);
		
		// Pisos añadidos para hacer pruebas
		gestion = new Inmobiliaria(lista,numVendedores,0);
		prueba1= new Piso("Calle Tarragona",100,seminuevo,250);
		gestion.agregarPiso(prueba1,cont);
		cont++;
		prueba2= new Piso("Calle Logroño",50,nuevo,250);
		gestion.agregarPiso(prueba2,cont);
		cont++;
		// Pisos añadidos para hacer pruebas
		
		do{
			System.out.println("""
					0 - Para salir.
					1 - Añadir un piso.
					2 - Calcular el precio final de venta de un piso.
					3 - Buscar y mostrar todos los pisos nuevos.
					4 - Modificar el precio de un piso.
					5 - Calcular el precio por metro cuadrado.
					6 - Mostrar ganancias de los pisos seminuevos.
					7 - Mostrar ganancia de cada vendedor.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch (opcion) {
				case 1:
					System.out.println("Introduzca la dirección del piso:");
					direccion=sc.nextLine();
					
					System.out.println("Introduzca los metros cuadrados del piso: ");
					aux=sc.nextLine();
					metrosCuadrados=Integer.parseInt(aux);
					
					System.out.println("""
							Introduzca el estado de su piso:
							1 - Nuevo.
							2 - Seminuevo.
							3 - A reformar.
							""");
					aux=sc.nextLine();
					estado=Integer.parseInt(aux);
					
					System.out.println("Introduzca por cuanto desea venderlo: ");
					aux=sc.nextLine();
					precioVenta=Double.parseDouble(aux);
					p = new Piso(direccion, metrosCuadrados,estado,precioVenta);
					gestion.agregarPiso(p,cont);
					cont++;
				break;
				case 2:
					System.out.println("Introduzca el id del piso: ");
					aux=sc.nextLine();
					id=Integer.parseInt(aux)-1;
					
					System.out.println("Introduzca el porcentaje que desea ganar");
					aux=sc.nextLine();
					porcen=Integer.parseInt(aux);
					
					gestion.mostrarprecioFinal(gestion.calcularPrecioFinalVenta(id, porcen));
				break;
				case 3:
					gestion.mostrarPisosNuevos(gestion.buscarEstados(nuevo));
					
					break;
				case 4:
					System.out.println("Introduzca el id del piso: ");
					aux=sc.nextLine();
					id=Integer.parseInt(aux)-1;
					
					System.out.println("Introduzca el nuevo precio: ");
					aux=sc.nextLine();
					precioFinal=Double.parseDouble(aux);
					gestion.modificarPiso(id, precioFinal);
					
					break;
				case 5:
					System.out.println("Introduzca el id del piso: ");
					aux=sc.nextLine();
					id=Integer.parseInt(aux)-1;
					
					System.out.println("Introduzca el porcentaje que desea ganar");
					aux=sc.nextLine();
					porcen=Integer.parseInt(aux);
					gestion.mostrarMetroCuadrado(gestion.calcularMetroCuadrado(id, porcen));
					break;
				case 6:
					ganancias=gestion.calcularGananciasSeminuevos(gestion.buscarEstados(seminuevo));
					gestion.mostrarGananciasSeminuevos(ganancias);
					break;
				case 7:
					gestion.mostrarGananciasVendedor(gestion.calcularGanaciasPorVendedor());
			}
		} while(opcion!=0);
	//	System.out.println(gestion.calcularPrecioFinalVenta(0, 10));//Pedir el id y el porcen por teclado
		//gestion.mostrarPisos(gestion.buscarNuevos(1));
		System.out.println(gestion.calcularGananciasSeminuevos(gestion.buscarEstados(2)));
		System.out.println(gestion.calcularGanaciasPorVendedor());
	}

}
