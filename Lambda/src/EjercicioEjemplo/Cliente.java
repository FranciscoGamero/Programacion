package EjercicioEjemplo;

public class Cliente {

	private String nombre;
	private String dni;
	private int edad;
	private int cantidadBotellas;
	
	/*
	 * El constructor no lleva la cantidad de botellas para que al crearlos esta sea por
	 * defecto 0
	 */
	
	public Cliente(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCantidadBotellas() {
		return cantidadBotellas;
	}

	public void setCantidadBotellas(int cantidadBotellas) {
		this.cantidadBotellas = cantidadBotellas;
	}
	
	
}