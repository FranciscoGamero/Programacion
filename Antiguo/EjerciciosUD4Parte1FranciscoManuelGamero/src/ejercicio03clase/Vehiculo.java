package ejercicio03clase;

public class Vehiculo {

	private double cilindrada;
	private double caballos;
	private int tipoEmision;

	public Vehiculo(double cilindrada, double caballos, int tipoEmision) {
		super();
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.tipoEmision = tipoEmision;
	}

	public double calcularImpuesto(double porcen) {
		double impuesto = 0;
		switch (tipoEmision) {
		case 1:
			impuesto = 10;
			return impuesto;
		case 2:
			impuesto = 20;
			return impuesto;
		case 3:
			impuesto = 30;
			return impuesto;
		case 4:
			impuesto = 40;
			return impuesto;
		default:
			System.out.println("Opción no válida");
			break;
		}
		return impuesto;
	}
}
