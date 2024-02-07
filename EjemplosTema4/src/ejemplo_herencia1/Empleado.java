package ejemplo_herencia1;

public class Empleado extends Trabajador {

	private double sueldo;
	private double impuestos;

	public Empleado(String nombre, String puesto, String dni, double sueldo, double impuestos) {
		super(nombre, puesto, dni); // Es una llamada al constructor de la clase Trabajador (La clase madre)
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public Empleado(String dni, double sueldo, double impuestos) {
		super(dni);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public double calcularPago() {
		double cien = 100.0;
		return sueldo - (sueldo * impuestos / cien);
	}

	public double calcularPagoV2() {
		double cien = 100.0;
		double total = 0.0;
		total = super.calcularPagoV2() + sueldo - (sueldo * impuestos / cien);
		return total;
	}
	public double calcularPagoV3(double fijo) /*A la clase hija siempre hay que pasarle como parámetro 
	si se esta reescribiendo el mismo método que el de la madre (tener la misma firma)*/{
		double cien = 100.0;
		double total = 0.0;
		total = super.calcularPagoV3(fijo) + sueldo - (sueldo * impuestos / cien);
		return total;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", getNombre()=" + getNombre()
				+ ", getPuesto()=" + getPuesto() + ", getDni()=" + getDni() + "]";
	}
}
