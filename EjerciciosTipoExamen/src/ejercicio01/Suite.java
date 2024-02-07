package ejercicio01;

public class Suite extends Habitacion {

	private double metrosCuadrados;
	private double gastoServicioHabitacion;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupada, int numOcupantes,
			int id_habitacion, double metrosCuadrados, double gastoServicioHabitacion) {
		super(precioBase, ocupada, nombreCliente, numDiasOcupada, numOcupantes, id_habitacion);
		this.metrosCuadrados = metrosCuadrados;
		this.gastoServicioHabitacion = gastoServicioHabitacion;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getGastoServicioHabitacion() {
		return gastoServicioHabitacion;
	}

	public void setGastoServicioHabitacion(double gastoServicioHabitacion) {
		this.gastoServicioHabitacion = gastoServicioHabitacion;
	}

	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", gastoServicioHabitacion=" + gastoServicioHabitacion
				+ ", getPrecioBase()=" + getPrecioBase() + ", isOcupada()=" + isOcupada() + ", getNombreCliente()="
				+ getNombreCliente() + ", getNumDiasOcupada()=" + getnumDiasOcupada() + ", getNumOcupantes()="
				+ getNumOcupantes() + "]";
	}

	public double calcularPrecio(double descuento, double gastoLimpieza) {
		double cien = 100.0;
		return (super.calcularPrecio(descuento, gastoLimpieza) + gastoServicioHabitacion)
				- ((super.calcularPrecio(descuento, gastoLimpieza)) * descuento / cien);
	}

}
