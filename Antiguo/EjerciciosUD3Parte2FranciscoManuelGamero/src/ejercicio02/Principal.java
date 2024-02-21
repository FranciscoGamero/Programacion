package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String aux,nombre;
		
		int tam,tipo,servicio,numDias,auxiliar,opcion;
		int numHabitacion,porcenDoble,porcenSuite;
		
		boolean ocupada;
		
		double precioHab,precioLimpieza,precioComida;
		double gastoHabitacion;
		double precioMinibar,gastoServicio;
		
		Habitacion hab,listaHab[];
		Hotel gestion;
		
		System.out.println("¿Cuantos habitaciones va a tener?");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		listaHab= new Habitacion[tam];
		gestion = new Hotel(listaHab,0);
		
		System.out.println("*************************************");
		System.out.println("Bienvenido al gestor del minihotel");
		System.out.println("*************************************\n");
		
		hab=new Habitacion();
		
		System.out.println("Introduzca el precio de la habitacion base.");
		aux=sc.nextLine();
		precioHab=Double.parseDouble(aux);
		hab.setPrecioHabitacion(precioHab);
		
		System.out.println("Introduzca el porcentaje añadido de la habtiación doble.");
		aux=sc.nextLine();
		porcenDoble=Integer.parseInt(aux);
		
		System.out.println("Introduzca el porcentaje añadido de la suite.");
		aux=sc.nextLine();
		porcenSuite=Integer.parseInt(aux);
		
		System.out.println("Introduzca el precio del servicio de limpieza.");
		aux=sc.nextLine();
		precioLimpieza=Integer.parseInt(aux);
		
		System.out.println("Introduzca el precio del servicio de comida.");
		aux=sc.nextLine();
		precioComida=Integer.parseInt(aux);
		
		do {
			System.out.println("\n*************************************\n");
			System.out.println("Pulse 1 para añadir una habitación");
			System.out.println("Pulse 2 para ver si una habitación está ocupada");
			System.out.println("Pulse 3 para ver el gasto de los extras de una habitación.");
			System.out.println("Pulse 4 para ver la factura de una habitación");
			System.out.println("*************************************\n");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
				case 1: 
					System.out.println("Introduzca el tipo de habitación:");
					System.out.println("Pulse 1 para una individual");
					System.out.println("Pulse 2 para una doble");
					System.out.println("Pulse 3 para una suite");
					aux=sc.nextLine();
					tipo=Integer.parseInt(aux);
					hab.setTipoHabitacion(tipo);
					hab.setPrecioHabitacion(gestion.calcularPrecioHabitacion(hab, precioHab, porcenDoble, porcenSuite));
					
					System.out.println("Introduzca si desea servicios");
					System.out.println("Pulse 1 para servicio de limpieza.");
					System.out.println("Pulse 2 para servicio de comida.");
					System.out.println("Pulse 3 para ambos servicios");
					System.out.println("Pulse 0 para ningún servicio");
					aux=sc.nextLine();
					servicio=Integer.parseInt(aux);
					hab.setServicios(servicio);
					
					System.out.println("Introduzca el nombre del cliente: ");
					nombre=sc.nextLine();
					hab.setClienteAsignado(nombre);
					
					System.out.println("Introduzca el número de días: ");
					aux=sc.nextLine();
					numDias=Integer.parseInt(aux);
					hab.setNumDias(numDias);
					
					System.out.println("Introduzca si la habitación esta o no limpia.");
					System.out.println("Pulse 1 si está limpia");
					System.out.println("Pulse 0 si no lo está");
					aux=sc.nextLine();
					auxiliar=Integer.parseInt(aux);
					

					
					System.out.println("Introduzca si la habitación esta o no ocupada ahora mismo.");
					System.out.println("Pulse 1 si lo está ");
					System.out.println("Pulse 0 si no lo está");
					aux=sc.nextLine();
					auxiliar=Integer.parseInt(aux);
			
					if (auxiliar==1) { //Hacer en un método aunque se puede hacer en el main
						ocupada=true;
					} else {
						ocupada=false;
					}
					hab.setOcupada(ocupada);
					System.out.println(hab.toString());
					gestion.agregarHabitacion(hab);
					break;
				case 2:
					System.out.println("Introduzca el número de la habitación");
					aux=sc.nextLine();
					numHabitacion=Integer.parseInt(aux)-1;
					gestion.mostrarOcupacion(gestion.comprobarOcupacion(numHabitacion));
					break;
				case 3:
					System.out.println("Introduzca el número de la habitación");
					aux=sc.nextLine();
					numHabitacion=Integer.parseInt(aux)-1;
					System.out.println("Introduzca el gasto del minibar");
					aux=sc.nextLine();
					precioMinibar=Double.parseDouble(aux);
					
					gastoServicio=gestion.precioServicio(gestion.comprobarServicio(numHabitacion), 
							precioLimpieza, precioComida)+precioMinibar;
					
					gestion.mostrarPrecio(gastoServicio);
					break;
				case 4:
					System.out.println("Introduzca el número de la habitación");
					aux=sc.nextLine();
					numHabitacion=Integer.parseInt(aux)-1;
					System.out.println("Introduzca el gasto del minibar");
					aux=sc.nextLine();
					precioMinibar=Double.parseDouble(aux);
					
					gastoServicio=gestion.precioServicio(gestion.comprobarServicio(numHabitacion), 
							precioLimpieza, precioComida)+precioMinibar; // Calcula el gasto de los servicios
					
					gastoHabitacion=gestion.calcularPrecioHabitDias(gestion.calcularPrecioHabitacion(hab, precioHab, 
							porcenDoble, porcenSuite), hab.getNumDias()); // Calcula el gasto de la habitacion por el nº dias
					
					gestion.mostrarFactura(numHabitacion,gastoServicio+gastoHabitacion,gastoServicio,gastoHabitacion);
					break;
				case 0:
					System.out.println("---------------------------------------");
					System.out.println("Gracias por usar nuestro programa");			
					System.out.println("---------------------------------------");

				default:
					System.out.println("Opción no válida.");
			}
			
		}while (opcion!=0);
		
	}

}
