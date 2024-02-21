package ejercicio02;

public class Carta extends TarjetaDeVisita{
	private String fecha;

	public Carta(String nombreEmpresa, String nombreTrabajador, String fecha) {
		super(nombreEmpresa, nombreTrabajador);
		this.fecha = fecha;
	}
	
	public void mostrarCabecera() {
		super.mostrarCabecera();
		System.out.println("Fecha:\t"+fecha);
	
	}
}
