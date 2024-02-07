package ejercicio01;

public class Apartamento extends Habitacion {

	private boolean servicioLimpieza;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupada, int numOcupantes,
			int id_habitacion, boolean servicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, numDiasOcupada, numOcupantes, id_habitacion);
		this.servicioLimpieza = servicioLimpieza;
	}

	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	public double calcularPrecio(double descuento, double gastoLimpieza) {
		if (servicioLimpieza) {
			return super.calcularPrecio(descuento, gastoLimpieza) + gastoLimpieza;
		} else {
			return super.calcularPrecio(descuento, gastoLimpieza);
		}
	}
}
