package ejercicio11;

public class Alumno {
	private String nombre;
	private String curso;
	private double notas[];
	private double numSuspensos;
	private double notaMedia;
	
	public Alumno(String nombre, String curso, double[] notas, double numSuspensos, double notaMedia) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notas = notas;
		this.numSuspensos = numSuspensos;
		this.notaMedia = notaMedia;
		
	}
	
	public Alumno(String nombre, String curso) {
		this.nombre = nombre;
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getNumSuspensos() {
		return numSuspensos;
	}

	public void setNumSuspensos(double numSuspensos) {
		this.numSuspensos = numSuspensos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
}
