package repasoud3completo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String aux,nombre;
		
		Producto p,p2,p3,p4,p5,lista[];
		
		Tienda t;
		
		double precioFabrica,ganancia;		
		
		int opcion,enVenta,seccion,tam=10,numTrabajadores=5;
		int numProductos=0, id=0,porcen,porcenGanancia;
		
	/*	System.out.println("Introduzca el tamaño:");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		System.out.println("Introduzca el número de trabajadores:");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);		*/
		
		lista=new Producto[tam];
		

		t= new Tienda(lista,numProductos,numTrabajadores);
		
		p2=new Producto("Pantalón",30.50,3,id,true);
		t.agregarProducto(p2);
		id++;
		p3=new Producto("Pantalla", 80.00, 2,id, true);
		t.agregarProducto(p3);
		id++;
		p4=new Producto("Altavoz", 34.99, 2,id, true);
		t.agregarProducto(p4);
		id++;
		p5=new Producto("Móvil", 119.99, 2,id, true);
		t.agregarProducto(p5);
		id++;
		
		/*el prducto debe de instanciarse con los parametros, sino debemos crear un constructor vacio.*/
		System.out.println("Diga precio:");
		aux=sc.nextLine();
		precioFabrica=Double.parseDouble(aux);
		p=new Producto("Lechuga",precioFabrica,1,id,true); // El Producto p debería ir arriba donde se declaran las variables.
		System.out.println(p.getPrecioFabrica()); // Esto imprime el precio del producto.
		t.agregarProducto(p);
		id++;
	//	System.out.println(precioFabrica); // MAL Esto imprime el valor de la variable que puede cambiar.
		
	//	ESTO NO SE HACE ASÍ, primero se piden las variables y despues se crea, pero no se usan los sets.
	//	p3=new Producto();
	//	p3.setPrecioFabrica(precioFabrica);
	//	Solo devuelve los datos si hay en la clase POJO un toString, sino devuelve la dirección de almacenamiento.
		System.out.println(p);
		
		do {
			System.out.println("""
					1 - Agregar un producto.
					2 - Mostrar productos.
					3 - Mostrar cualquier sección
					4 - Mostrar un producto (Por el indice)
					5 - Calcular el precio de venta al público
					6 - Cambiar el precio de fabrica de una seccion
					7 - Aplicar descuento a un producto
					8 - Eliminar seccion
					9 - Mostrar los productos que no estan en venta
					0 - Salir
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
				case 1:
						System.out.println("Introduzca el nombre del producto:");
						nombre=sc.nextLine();
						System.out.println("Introduzca el precio de fábrica:");
						aux=sc.nextLine();
						precioFabrica=Double.parseDouble(aux);
						System.out.println("Introduzca la sección:");
						aux=sc.nextLine();
						seccion=Integer.parseInt(aux);
						System.out.println("Introduzca 1 si esta en venta o 0 si no:");
						aux=sc.nextLine();
						enVenta=Integer.parseInt(aux);
						
						if(enVenta==1) {
							p=new Producto(nombre,precioFabrica,seccion,id,true);
							t.agregarProducto(p);
							id++;
//Se puede hacer asi pero ahora mismo da igual t.agregarProducto(new Producto(nombre,precioFabrica,seccion,true));
							
						} else {
							p=new Producto(nombre,precioFabrica,seccion,id,false);
							t.agregarProducto(p);
							id++;
//Se puede hacer asi pero ahora mismo da igual t.agregarProducto(new Producto(nombre,precioFabrica,seccion,false));
						}
					break;
				case 2:
					t.mostrarProductos();
					break;
				case 3:
						System.out.println("""
								Introduzca el número de la seccion:\n
								1 - Comida
								2 - Electrónica
								3 - Ropa
								""");
						aux=sc.nextLine();
						seccion=Integer.parseInt(aux);
						t.mostrarLista(t.buscarPorSeccion(seccion));
					break;
				case 4: 
					System.out.println("Introduzca el id del producto:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
				/*	if(t.buscarPorID(id)==-1) {
						System.out.println("Producto no encontrado\n");
					} else {
						System.out.println(t.buscarPorID(id));
					}*/
					if(t.buscarPorID2(id)==null) {
						System.out.println("\nProducto no encontrado\n");
					} else {
						System.out.println(t.buscarPorID2(id));
					}
					break;
				case 5:
					System.out.println("Introduzca el id del producto que desea calcular el precio de venta al público:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					System.out.println("Introduzca el porcentaje que desea ganar:");
					aux=sc.nextLine();
					porcen=Integer.parseInt(aux);
					System.out.printf("El precio de venta al público es de: %.2f€\n ",t.calcularPrecioAlPublico(id, porcen));
					break;
				case 6:
					System.out.println("""
							Introduzca la seccion a la que desea cambiar el precio:
								1 - Comida
								2 - Electrónica
								3 - Ropa
							""");
					aux=sc.nextLine();
					seccion=Integer.parseInt(aux);
					System.out.println("Introduzca el nuevo precio:");
					aux=sc.nextLine();
					precioFabrica=Double.parseDouble(aux);
					t.modificarPrecioSeccion(seccion, precioFabrica);
					t.mostrarLista(t.buscarPorSeccion(seccion));
					break;
				case 7:
					System.out.println("Introduzca el id del producto que desea aplicar al producto:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					System.out.println("Introduzca el porcentaje que desea ganar: ");
					aux=sc.nextLine();
					porcenGanancia=Integer.parseInt(aux);
					System.out.println("Introduzca el descuento que desea aplicar:");
					aux=sc.nextLine();
					porcen=Integer.parseInt(aux);

					System.out.printf("El precio aplicando el descuento sería de: %.2f€\n\n",t.calcularDescuento(id,porcenGanancia,porcen));
					break;
				case 8:
					System.out.println("""
							Introduzca la seccion a la que desea cambiar el precio:
								1 - Comida
								2 - Electrónica
								3 - Ropa
							""");
					aux=sc.nextLine();
					seccion=Integer.parseInt(aux);
					System.out.println(t.eliminarSeccion(seccion));
					break;
				case 9:
					t.mostrarActivos();
					break;
				case 0:
					System.out.println("Gracias por usar nuestro programa.");
					break;
				default:
					System.out.println("Opción no válida.");
			}
		}while(opcion !=0);
			
	}

}
