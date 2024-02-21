package ejercicio03clase;

public class Furgoneta extends Vehiculo{

	private double impuestoFurgoneta;

	public Furgoneta(double cilindrada, double caballos, int tipoEmision, double impuestoFurgoneta) {
		super(cilindrada, caballos, tipoEmision);
		this.impuestoFurgoneta = impuestoFurgoneta;
	}
	public double calcularImpuesto(double porcen) {
		return super.calcularImpuesto(porcen)+impuestoFurgoneta;
	}
	
}
