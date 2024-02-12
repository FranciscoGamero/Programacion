package EjemploMap2;

public class Alumno {

	private String nombre;
	private int codAlumno;
	private double notaMedia;

	public Alumno(String nombre, int codAlumno, double notaMedia) {
		super();
		this.nombre = nombre;
		this.codAlumno = codAlumno;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", codAlumno=" + codAlumno + ", notaMedia=" + notaMedia + "]";
	}

}
