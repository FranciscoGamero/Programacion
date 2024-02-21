package ejercicio02;

public class TrabajadorHoras extends Trabajador{

	private int numHoras;
	private double precioHora;
	
	public TrabajadorHoras(String nombre, String apellidos, double sueldo, int numHoras, double precioHora) {
		super(nombre, apellidos, sueldo);
		this.numHoras = numHoras;
		this.precioHora = precioHora;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	public double calculoIrpf(double sueldo) {
		double irpf=85,cien=100;
		return (sueldo+(numHoras*precioHora))+(((sueldo+(numHoras*precioHora))*irpf/cien));
	}
	
}
