package ejemploDiapositivas;

public class Alumno {
	
	private String nombre;

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
	

}
