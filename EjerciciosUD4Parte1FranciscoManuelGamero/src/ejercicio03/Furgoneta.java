package ejercicio03;

public class Furgoneta extends Vehiculo{

	public Furgoneta(double cilindrada, double potencia, String categoria) {
		super(cilindrada, potencia, categoria);
	}
	
	public double calcularImpuesto(double fijo,double fijoFurgoneta) {
		return fijo+fijoFurgoneta;
	}

	
}
