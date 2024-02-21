package ejercicio03clase;

public class Motocicleta extends Vehiculo{

	public Motocicleta(double cilindrada, double caballos, int tipoEmision) {
		super(cilindrada, caballos, tipoEmision);
	}
	public double calcularImpuesto(double porcen) {
		double cien=100.0;
		return super.calcularImpuesto(porcen)+(super.calcularImpuesto(porcen)*porcen/cien);
	}
}
