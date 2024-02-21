package ejercicio03;

public abstract class Vehiculo {

	private double cilindrada;
	private double potencia;
	private String categoria;
	
	public Vehiculo(double cilindrada, double potencia, String categoria) {
		super();
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.categoria = categoria;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencias) {
		this.potencia = potencias;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public abstract double calcularImpuesto(double fijo, double fijoFurgoneta);
	
}
