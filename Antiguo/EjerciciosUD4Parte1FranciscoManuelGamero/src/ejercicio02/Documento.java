package ejercicio02;

public class Documento {

	private String nombreEmpresa;
	
	public Documento(String nombreEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public void mostrarCabecera() {
		System.out.println("Nombre de la empresa:\t"+nombreEmpresa);

	}
}
