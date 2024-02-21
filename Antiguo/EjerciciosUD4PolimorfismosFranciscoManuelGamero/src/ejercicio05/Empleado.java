package ejercicio05;

public class Empleado {

	private String nombre;
	private String apellidos;
	private int numEmpleado;
	private double sueldoBase;
	
	public Empleado(String nombre, String apellidos, int numEmpleado, double sueldoBase) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numEmpleado = numEmpleado;
		this.sueldoBase = sueldoBase;
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

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", numEmpleado=" + numEmpleado
				+ ", sueldoBase=" + sueldoBase + "]";
	}
	
	public double calcularSueldo() {
		return sueldoBase;
	}
}

