package ejercicio05;

public class Vendedor extends Empleado{

	private double cantVentas;
	private double incentivo;
	
	public Vendedor(String nombre, String apellidos, int numEmpleado, double sueldoBase, double cantVentas,
			double incentivo) {
		super(nombre, apellidos, numEmpleado, sueldoBase);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	public double getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(double cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public double calcularSueldo() {
		double cien=100;
		return super.calcularSueldo()+(cantVentas*incentivo/cien);
	}

	@Override
	public String toString() {
		return "Vendedor [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getNumEmpleado()="
				+ getNumEmpleado() + ", getSueldoBase()=" + getSueldoBase() + ", cantVentas=" + cantVentas
				+ ", incentivo=" + incentivo + "]";
	}
	public void felicitarVenta(double objetivo) {
		if (cantVentas>objetivo) {
		System.out.println("Felicidades!! Has logrado con el objetivo");
		}
	}
}
