package ejercicios;

public class Furgoneta extends Vehiculo {

	private double longitud;

	public Furgoneta(String matricula, double tiempoEstacionado, double longitud) {
		super(matricula, tiempoEstacionado);
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Furgoneta [longitud=" + longitud + ", getMatricula()=" + getMatricula() + ", getTiempoEstacionado()="
				+ getTiempoEstacionado();
	}

	public double calcularPrecio(double cantidadFija, double sumaFurgoneta) {
		double longitudTope = 4;
		if (longitud > longitudTope) {
			return super.calcularPrecio(cantidadFija, sumaFurgoneta) + (sumaFurgoneta * (longitud - longitudTope));
		} else {
			return super.calcularPrecio(cantidadFija, sumaFurgoneta);
		}
	}

	public void avisoFurgoneta() {
		int tamanioEspecial = 8;
		if (longitud > tamanioEspecial)
			System.out.println("Zona especial");
	}
}
