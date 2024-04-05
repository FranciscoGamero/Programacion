package ejercicio;

public class Coche {
	private String matricula;
	private String nombreDuenio;
	private double precioReparacion;
	private int aniosDeGarantia;

	public Coche(String matricula, String nombreDuenio, double precioReparacion, int aniosDeGarantia) {
		super();
		this.matricula = matricula;
		this.nombreDuenio = nombreDuenio;
		this.precioReparacion = precioReparacion;
		this.aniosDeGarantia = aniosDeGarantia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombreDuenio() {
		return nombreDuenio;
	}

	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}

	public double getPrecioReparacion() {
		return precioReparacion;
	}

	public void setPrecioReparacion(double precioReparacion) {
		this.precioReparacion = precioReparacion;
	}

	public int getAniosDeGarantia() {
		return aniosDeGarantia;
	}

	public void setAniosDeGarantia(int aniosDeGarantia) {
		this.aniosDeGarantia = aniosDeGarantia;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", nombreDuenio=" + nombreDuenio +"]";
	}

}
