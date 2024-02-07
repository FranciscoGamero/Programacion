package ejercicio03;

public class Motocicleta extends Vehiculo{

	public Motocicleta(double cilindrada, double potencia, String categoria) {
		super(cilindrada, potencia, categoria);
	}

	@Override
	public double calcularImpuesto(double fijo, double fijoFurgoneta) {
		int cien=100,porcen=60;
		return fijo+(super.getCilindrada()*porcen/cien);
	}

	
}
