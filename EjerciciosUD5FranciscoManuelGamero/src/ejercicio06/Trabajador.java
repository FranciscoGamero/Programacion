package ejercicio06;

public class Trabajador implements Comparable<Trabajador>{

	private String nombre;
	private String dni;
	private int horasTrabajadas;
	private double sueldo;
	public Trabajador(String nombre, String dni, int horasTrabajadas, double sueldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldo=" + sueldo + "]";
	}
	@Override
	public int compareTo(Trabajador t) {
		if (this.horasTrabajadas*this.sueldo < t.getHorasTrabajadas()*t.getSueldo()) { // compara con el que estamos llamando
			return -1;
		} else if (this.horasTrabajadas*this.sueldo > this.horasTrabajadas*this.sueldo) {
			return 1;
		}
		return 0;
	}
	
}
