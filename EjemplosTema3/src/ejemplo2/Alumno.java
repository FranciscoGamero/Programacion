package ejemplo2;

public class Alumno {

	private String nombre;
	private double notaPro;
	private double notaBD;
	
	public Alumno (String nombre, double notaPro, double notaBD) {
		this.nombre=nombre;
		this.notaPro=notaPro;
		this.notaBD=notaBD;
	}
	public double calcularMedia () {
		double media, dos=2;
		media=(notaPro+notaBD)/dos;
		
		return media; // solo se pone return cuando lo que se devuelve no es void // Si la operacion es pequeña, se puede poner directamente en el return para ahorrar código
		
	}
	public void mostrarMedia (double media) {
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Nota de Programación: "+notaPro);
		System.out.println("Nota de Base de Datos: "+notaBD);
		System.out.println("Nota media: "+media);
	}
}
