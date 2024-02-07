package ejercicio05;

public class Gerente extends Empleado{

	private int porcenImpuestos;

	public Gerente(String nombre, String apellidos, int numEmpleado, double sueldoBase, int porcenImpuestos) {
		super(nombre, apellidos, numEmpleado, sueldoBase);
		this.porcenImpuestos = porcenImpuestos;
	}

	public int getPorcenImpuestos() {
		return porcenImpuestos;
	}

	public void setPorcenImpuestos(int porcenImpuestos) {
		this.porcenImpuestos = porcenImpuestos;
	}

	@Override
	public double calcularSueldo() {
		double cien=100;
		return super.calcularSueldo()-(super.calcularSueldo()*porcenImpuestos/cien);
	}

	@Override
	public String toString() {
		return "Gerente [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getNumEmpleado()="
				+ getNumEmpleado() + ", getSueldoBase()=" + getSueldoBase() + ", porcenImpuestos=" + porcenImpuestos
				+ "]";
	}
	
	
}
