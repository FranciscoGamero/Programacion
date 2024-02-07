package ejercicio02;

public class TarjetaDeVisita extends Documento{

	private String nombreTrabajador;		

	public TarjetaDeVisita(String nombreEmpresa, String nombreTrabajador) {
		super(nombreEmpresa);
		this.nombreTrabajador = nombreTrabajador;
	}

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}

	public void mostrarCabecera() {
		super.mostrarCabecera();
		System.out.println("Nombre del trabajador:\t"+nombreTrabajador);
	}
}
