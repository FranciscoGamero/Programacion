package ejemplo_herencia1;

public class Trabajador {

	private String nombre;
	private String puesto;
	private String dni;
	
	public Trabajador(String nombre, String puesto, String dni) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.dni = dni;
	}

	public Trabajador(String dni) {
		super();
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String apellidos) {
		this.puesto = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double calcularPago() {
		return 0.0;
	}
	/*El calcular pago v2 es nuevo y no es cambiando el de arriba*/
	public double calcularPagoV2() {
		double fijo=1000;
		return fijo;
	}
	public double calcularPagoV3(double fijo) {
		return fijo;
	}
	/*Se pone desde afuera para no crear atributo booleano y tener que hacer los getter and setter y los constructoes*/
	public void darBaja() {
		puesto="baja";
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", dni=" + dni + "]";
	}

	
}
