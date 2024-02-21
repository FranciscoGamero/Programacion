package ejercicio03;

public class Coche extends Vehiculo{

	public Coche(double cilindrada, double potencia, String categoria) {
		super(cilindrada, potencia, categoria);
	}

	public double calcularImpuesto(double fijo, double fijoFurgoneta) {
		double porcen=25,cien=100;
		return fijo+(super.getPotencia()*porcen/cien);
	}

	
}
