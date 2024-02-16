package ejercicio04;

public class Contacto {

	private String nombre;
	private int codContacto;
	
	
	public Contacto(String nombre, int codContacto) {
		super();
		this.nombre = nombre;
		this.codContacto = codContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodContacto() {
		return codContacto;
	}

	public void setCodContacto(int codContacto) {
		this.codContacto = codContacto;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", codContacto=" + codContacto + "]";
	}



}
