package ejercicio10;

public class Ticket {
	private String fecha;
	private int numPersonas;
	private double precioUnitario;

	public Ticket(String fecha, int numPersonas) {
		this.fecha = fecha;
		this.numPersonas = numPersonas;
	}

	public Ticket(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Ticket() {
		
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", numPersonas=" + numPersonas + ", precioUnitario="
				+ precioUnitario + "]";
	}

}
