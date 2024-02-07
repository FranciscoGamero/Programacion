package ejercicio01;

public class Portatil extends Ordenador{
	private boolean seguroPantalla;
	private double precioSeguro;
	
	public Portatil(String discoDuro, double frecuenciaProcesador, double precioBase, 
			String marca,boolean seguroPantalla, double precioSeguro) {
		
		super(discoDuro, frecuenciaProcesador, precioBase, marca);
		this.seguroPantalla = seguroPantalla;
		this.precioSeguro = precioSeguro;
	}

	public boolean isSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(boolean seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	public double calcularPrecioPVP(double porcen) {
		if(seguroPantalla) {
			return super.calcularPrecioPVP(porcen)+precioSeguro;
		} else {
			return super.calcularPrecioPVP(porcen);
		}
	}
	@Override
	public String toString() {
		return "Portatil [seguroPantalla=" + seguroPantalla + ", precioSeguro=" + precioSeguro + ", getDiscoDuro()="
				+ getDiscoDuro() + ", getFrecuenciaProcesador()=" + getFrecuenciaProcesador() + ", getPrecioBase()="
				+ getPrecioBase() + ", getMarca()=" + getMarca() + "]";
	}
	
	
}
