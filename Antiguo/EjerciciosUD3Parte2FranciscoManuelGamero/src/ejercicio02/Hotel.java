package ejercicio02;

public class Hotel {
/* nombre del hotel*/
	private Habitacion lista[];
	private int nHabit;

	public Hotel(Habitacion[] lista, int numHabitaciones) {
		this.lista = lista;
		this.nHabit = numHabitaciones;
	}

	public void agregarHabitacion(Habitacion h) {
		lista[nHabit] = h;
		nHabit++;
	}
	// AÑADIDO EN LA CORRECCIÓN
	public void listarHabitaciones() {
		for (int i = 0; i < nHabit; i++) {
			System.out.println(lista[i]);
		}
	}
	// AÑADIDO EN LA CORRECCIÓN
	
	public double calcularPrecioHabitacion(Habitacion h,double precioBase,int porcenDoble, int porcenSuite) {
		double precio=0;
		int cien=100;
		if(h.getTipoHabitacion()==1) {
			precio=precioBase;
		} else if(h.getTipoHabitacion()==2) {
			precio=precioBase+(precioBase*porcenDoble/cien);
		}else if(h.getTipoHabitacion()==3) {
			precio=precioBase+(precioBase*porcenSuite/cien);
		}
		return precio;
	}

	public double calcularPrecioHabitDias(double precioHab, int numDias) {
		return precioHab*numDias;
	}
	public int encontrarPorNumHabitacion(int num) {
		int i = 0;
		boolean encontrado = false;
		while (i < nHabit && !encontrado) {
			Habitacion delista = lista[i];
			if (num==nHabit) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}

	public boolean comprobarOcupacion(int n) {
		if (lista[n].isOcupada()) {
			return true;
		} else {
			return false;
		}
	}
	public void mostrarOcupacion(boolean estado) {
		if (estado) {
			System.out.println("La habitación está ocupada");
		} else {
			System.out.println("La habitación no está ocupada");
		}
	}
	
	public void mostrarHabitaciones() {
		System.out.printf("Tiene en total %d habitaciones ", nHabit);
	}

	public int comprobarServicio(int n) {
		return lista[n].getServicios();
	}
	public double precioServicio(int servicio, double precioLimpieza, double precioComida) {
		double precio=0;
		/*Para la próxima si hay mas else if, mejor hacer un switch con las opciones*/
		if (servicio == 1) {
			precio=precioLimpieza;
		} else if (servicio == 2) {
			precio=precioComida;
		} else if (servicio == 3) {
			precio=precioLimpieza+precioComida;
		} else {
			precio=0;
		}
		return precio;
	
	}
	public int comprobarDia(int n) {
		return lista[n].getNumDias();
	}
	public double calcularPrecio(double servicio,double minibar, int numDias) {
		double total;
		total= (servicio+minibar)*numDias;
		return total;
	}
	public void mostrarPrecio(double precio) {
		System.out.printf("El gasto de los extras son: %.2f€",precio);
		
	}public int comprobarTipo(int n) {
		return lista[n].getTipoHabitacion();
	}
	
	public void mostrarFactura(int n,double precio,double gastosExtras, double gastosHabitacion) {
		System.out.println("-----------------------------------------------------------");
		System.out.printf("Gastos de los extras: %.2f\n",gastosExtras);
		System.out.printf("\nGastos por la duración de la estancia: %.2f\n",gastosHabitacion);
		System.out.printf("\nLa factura total de la habitación %d es de %.2f€\n",n,precio);
		System.out.println("-----------------------------------------------------------");

	}
}
