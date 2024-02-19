package ejercicio05;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	public Persona(String nombre, String apellidos, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
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
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad + "]";
	}

	public int compareTo(Persona p) { // Le pasamos un corredor y lo
		if (this.edad < p.getEdad()) { // compara con el que estamos llamando
			return -1;
		} else if (this.edad > p.getEdad()) {
			return 1;
		}
		return 0;
	}
}
