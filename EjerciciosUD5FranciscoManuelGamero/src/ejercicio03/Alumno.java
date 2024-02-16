package ejercicio03;

public class Alumno {

	private String nombre;
	private String apellidos;
	private double notaMedia;
	private int codAlumno;

	public Alumno(String nombre, String apellidos, double notaMedia, int codAlumno) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
		this.codAlumno = codAlumno;
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

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", notaMedia=" + notaMedia + ", codAlumno="
				+ codAlumno + "]";
	}

}
