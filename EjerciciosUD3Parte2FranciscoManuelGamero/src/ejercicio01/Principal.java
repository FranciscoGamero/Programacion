package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String aux,cod;
		int tam,frag,opcion,porcen;
		double precioFabric,precio;
		boolean fragil;
		String nombre;
		Producto p[],prod;
		Tienda tien;
		
		System.out.println("¿Cuantos productos va a tener?");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		p=new Producto[tam];
		tien=new Tienda(p,0,0,0);
		do {
			System.out.println("*************************************************************************");
			System.out.println("Pulse 1 para añadir un producto.");
			System.out.println("");
			System.out.println("Pulse 2 para mostrar las características de los productos.");
			System.out.println("");
			System.out.println("Pulse 3 para calcular y mostrar lo invertido en productos.");
			System.out.println("");
			System.out.println("Pulse 4 para calcular el precio de venta al público de un producto.");
			System.out.println("");
			System.out.println("Pulse 5 para mostrar las ganancias totales.");
			System.out.println("");
			System.out.println("Pulse 6 para comprobar la fragilidad del producto");
			System.out.println("");
			System.out.println("Pulse 0 si desea terminar.");
			System.out.println("*************************************************************************");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch (opcion) {
				case 1:
					System.out.println("Introduzca el código del producto");
					cod=sc.nextLine();
					
					System.out.println("Introduzca el coste de fabricación del producto:");
					aux=sc.nextLine();
					precioFabric=Double.parseDouble(aux);
					
					System.out.println("Introduzca el nombre del producto: ");
					nombre=sc.nextLine();
					
					System.out.println("Introduce 1 si el producto es frágil y 0 si no lo es: ");
					aux=sc.nextLine();
					frag=Integer.parseInt(aux);
					
					if (frag==1) {
						fragil=true;
					} else {
						fragil=false;
					}
					prod=new Producto(precioFabric,nombre,cod,fragil);
					System.out.println("Introduzca el % del coste del transporte");
					aux=sc.nextLine();
					porcen=Integer.parseInt(aux);
					
					prod.calcularPrecioCoste(porcen);
					
					tien.agregarProducto(prod);
					break;
				case 2:
					tien.mostrarDatoProdcutos();
					break;
				case 3:
					System.out.printf("El precio invertido en productos es de: %.2f€\n",tien.calcularGastos());
					break;
				case 4:
					System.out.println("Introduzca el porcentaje de PVP");
					aux=sc.nextLine();
					porcen=Integer.parseInt(aux);
					System.out.println("Introduce el código del producto");
					cod=sc.nextLine();
					System.out.printf("El precio de venta al público es de: %.2f€\n",tien.calcularPVP(porcen, cod)); 
					break;
				case 5:
					tien.calcularGastos();
					System.out.printf("La posible ganancia de todo los productos sería de: %.2f\n",tien.calcularGanancias());
					break;
				case 6:
					System.out.println("Introduce el código del producto");
					cod=sc.nextLine();
					tien.mostrarFragilidad(tien.comprobarfragil(cod));
					break;
				case 0:
					System.out.println("Gracias por usar nuestro programa.");
					break;
				default:
					System.out.println("Opción no válida.");
					
			}
			
		} while (opcion!=0);
	}

}
