package ejercicio01;

public class Examenes {
	private String asignatura;
	private String aula;
	private String fecha;
	
	
	public Examenes(String asignatura, String aula, String fecha) {
		super();
		this.asignatura = asignatura;
		this.aula = aula;
		this.fecha = fecha;
	}
	public void mostrarCabecera() {
		System.out.println("Asignatura\t"+asignatura+"\nAula"+"\t\t"+aula+"\nFecha"+"\t\t"+fecha);
	}
	
}
