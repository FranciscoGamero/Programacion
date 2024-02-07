package ejercicio01;

public class Sobremesa extends Ordenador{
	private double precioMontaje;

	public Sobremesa(String discoDuro, double frecuenciaProcesador, double precioBase, String marca,double precioMontaje) {
		super(discoDuro, frecuenciaProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	public double calcularPrecioPVP(double porcen) {
		return super.calcularPrecioPVP(porcen)+precioMontaje;
	}
	@Override
	public String toString() {
		return "Sobremesa [precioMontaje=" + precioMontaje + ", getDiscoDuro()=" + getDiscoDuro()
				+ ", getFrecuenciaProcesador()=" + getFrecuenciaProcesador() + ", getPrecioBase()=" + getPrecioBase()
				+ ", getMarca()=" + getMarca() + "]";
	}
	
	
}
