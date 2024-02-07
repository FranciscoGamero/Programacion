package ejercicio02;

public class Trabajador implements IImpuesto{
	private String nombre;
	private String apellidos;
	private double sueldo;
	

	public Trabajador(String nombre, String apellidos, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldo=" + sueldo + "]";
	}

	@Override
	public double calculoIva(double precio, int iva) {
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		double irpf=85,cien=100;
		return sueldo+(sueldo*irpf/cien);
	}
}
