package ejercicio03clase;

public class Coche extends Vehiculo{

	public Coche(double cilindrada, double caballos, int tipoEmision) {
		super(cilindrada, caballos, tipoEmision);
	}
	public double calcularImpuesto(double porcen){
		double cien=100.0;
		return super.calcularImpuesto(porcen)+(super.calcularImpuesto(porcen)*porcen/cien);
	}
}
