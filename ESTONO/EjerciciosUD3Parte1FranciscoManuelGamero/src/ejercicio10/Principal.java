package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		String fecha, contrasenia;

		int numPersonas, opcion, opcion2;


		double precioUnitario, saldo;
		Scanner sc = new Scanner(System.in);

		Ticket tic1;
		Maquina maq1, maqSuma;

		tic1=new Ticket();
	//	maqSuma=new Maquina();
		maq1=new Maquina();
		System.out.println("Bienvenido a la máquina de tickets:");
		
		tic1 = new Ticket();
		maqSuma = new Maquina();
		maq1 = new Maquina();
		
		
		
		System.out.println("Bienvenido a la máquina de tickets:\n");

		System.out.println("Establezca el precio por ticket: ");
		aux = sc.nextLine();
		precioUnitario = Double.parseDouble(aux);
		tic1.setPrecioUnitario(precioUnitario);
		
		System.out.println("Introduzca la fecha de hoy (DD/MM/AAAA)");
		fecha = sc.nextLine();
		tic1.setFecha(fecha);

		do {
			System.out.printf("El precio actual del ticket es de: %.2f\n", tic1.getPrecioUnitario());
			System.out.println("*************************************************************");
			System.out.println("Pulse 1 para comprar un ticket.");
			System.out.println("Pulse 2 para entrar a las opciones de operador.");
			System.out.println("Pulse 0 para salir");
			System.out.println("*************************************************************");

			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:

				System.out.println("Introduzca el número de personas: ");
				aux = sc.nextLine();
				numPersonas = Integer.parseInt(aux);
				tic1.setNumPersonas(numPersonas);
				System.out.println("Introduzca la fecha de hoy (DD/MM/AAAA)");
				fecha = sc.nextLine();
				tic1.setFecha(fecha);
				maq1 = new Maquina(tic1);

				System.out.printf("El precio es de: %.2f€\n", maq1.calcularPrecio());
				maq1.setTic(tic1);
				
				System.out.printf("El precio es de: %.2f€\n",maq1.calcularPrecio());
				System.out.println("Introduzca la cantidad de dinero que va a cargar: ");

				aux = sc.nextLine();
				saldo = Integer.parseInt(aux);
				
				if (saldo>tic1.getPrecioUnitario()) {
				do {
					System.out.println("Pulse 1 para mostrar el cambio.");
					System.out.println("Pulse 2 para imprimir el ticket.");
					System.out.println("Pulse 0 para salir.");
					aux = sc.nextLine();
					opcion2 = Integer.parseInt(aux);
					switch (opcion2) {
						case 1:
							System.out.printf("El cambio es de: %.2f€\n", maq1.calcularCambio(saldo));
							break;
						case 2:
							if (maq1.comprobarPersonas(numPersonas)) {
								System.out.println("*****************************************");
								System.out.println("Ticket Metro Sevilla");
								System.out.println("Fecha: " + tic1.getFecha());
								System.out.println("");
								System.out.println("Válido para " + tic1.getNumPersonas() + " personas");
								System.out.println("*****************************************");
							} else {
								System.out.println("*****************************************");
								System.out.println("Ticket Metro Sevilla");
								System.out.println("Fecha: " + tic1.getFecha());
								System.out.println("");
								System.out.println("Válido para " + tic1.getNumPersonas() + " persona");
								System.out.println("*****************************************");
							}
							break;
						case 0:
							break;
						default:
							System.out.println("Opción no válida.");
							break;


						}
					} while (opcion2 != 0);
					saldo -= maq1.calcularPrecio();
					maqSuma.sumarRecaudacion(maq1.calcularPrecio());
					break;
				} else {
					System.out.println("El saldo introducido es menor que el precio\n");
				}
							
					}
				} while (opcion2 != 0);
				saldo-=maq1.calcularPrecio();
				maq1.sumarRecaudacion(maq1.calcularPrecio());
				break;
				
			case 2:
				System.out.println("Introduzca la contraseña de la máquina:");
				contrasenia = sc.nextLine();
				if (maq1.comprobarContrasenia(contrasenia)) {
					do {
						System.out.println("Pulse 1 para ver la recaudacion del día.");
						System.out.println("Pulse 2 para reestablecer la recaudación.");
						System.out.println("Pulse 3 para cambiar el precio del ticket.");
						System.out.println("Pulse 0 para salir.");
						aux = sc.nextLine();
						opcion2 = Integer.parseInt(aux);
						switch (opcion2) {
						case 1:
							maqSuma.mostrarRecaudacion();
							break;
						case 2:
							maqSuma.restablecerRecaudación();
							break;

						case 3:
							System.out.println("Introduzca el nuevo precio: ");
							aux = sc.nextLine();
							precioUnitario = Double.parseDouble(aux);
							tic1 = new Ticket();
							tic1.setPrecioUnitario(precioUnitario);
						case 0:
							break;
						default:
							System.out.println("Opción no válida.");
							case 1:
								maq1.mostrarRecaudacion();
								break;
							case 2:
								maq1.restablecerRecaudación();
								break;
								
							case 3:
								System.out.println("Introduzca el nuevo precio: ");
								aux = sc.nextLine();
								precioUnitario =Double.parseDouble(aux);
								tic1=new Ticket();
								tic1.setPrecioUnitario(precioUnitario);
							case 0:
								break;
							default: 
								System.out.println("Opción no válida.");
						}
					} while (opcion2 != 0);
				} else {
					System.out.println("Contraseña incorrecta");
				}
			case 0:
				System.out.println("Gracias por usar nuestro programa ^^");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);

	}

}
