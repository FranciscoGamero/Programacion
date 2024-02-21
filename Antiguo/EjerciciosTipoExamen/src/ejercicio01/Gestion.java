package ejercicio01;

public class Gestion {

	private Habitacion[] listaHabitaciones;

	public Gestion(Habitacion[] listaHabitaciones) {
		super();
		this.listaHabitaciones = listaHabitaciones;
	}

	public Habitacion[] getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	
	public Habitacion buscarHabitacionPorId(int id) {
		boolean encontrado=false;
		int i=0;
		while(!encontrado && i<listaHabitaciones.length) {
			if(listaHabitaciones[i]!=null) {
				if(id==listaHabitaciones[i].getId_habitacion()){
					encontrado=true;
				} else {
					i++;
				}
			}
		}
		if(encontrado) {
			return listaHabitaciones[i];
		} else {
			return null;
		}
	}
	public double calcularPrecioCualquierHabitacion(Habitacion h, double descuento, double gastoLimpieza) {
		return h.calcularPrecio(descuento, gastoLimpieza);
	}
	public double calcularRecaudadoHabitacionesOcupadas(double descuento, double gastoLimpieza) {
		double total=0.0;
		for (int i = 0; i < listaHabitaciones.length; i++) {
			if(listaHabitaciones[i]!=null && listaHabitaciones[i].isOcupada()) {
				total+=calcularPrecioCualquierHabitacion(listaHabitaciones[i],descuento,gastoLimpieza);
			}
		}
		return total;
	}
	public void mostrarFactura(Habitacion h, double descuento, double gastoLimpieza) {
		h.toString();
		System.out.printf("El gasto total de la habitacion es: %.2f€\n", 
				calcularPrecioCualquierHabitacion(h,descuento, gastoLimpieza));
	}
	public void mostrarNoOcupadas() {
		for (int i = 0; i < listaHabitaciones.length; i++) {
			if(listaHabitaciones[i]!=null && listaHabitaciones[i].isOcupada()==false) {
				System.out.println(listaHabitaciones[i]);
			}
		}
	}
}
