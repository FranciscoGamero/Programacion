package ejercicio01;

public class Ordenador {
	private String discoDuro;
	private double frecuenciaProcesador;
	private double precioBase;
	private String marca;
	
	public Ordenador(String discoDuro, double frecuenciaProcesador, double precioBase, String marca) {
		super();
		this.discoDuro = discoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public String getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(String discoDuro) {
		this.discoDuro = discoDuro;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double calcularPrecioPVP(double porcen) {
		double cien =100;
		return precioBase+(precioBase*porcen/cien);
	}
	@Override
	public String toString() {
		return "Ordenador [discoDuro=" + discoDuro + ", frecuenciaProcesador=" + frecuenciaProcesador + ", precioBase="
				+ precioBase + ", marca=" + marca + "]";
	}
	
}
