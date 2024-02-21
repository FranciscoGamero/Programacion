package ejercicios;

public class Moto extends Vehiculo {

	private double centimetrosCubicos;

	public Moto(String matricula, double tiempoEstacionado, double centimetrosCubicos) {
		super(matricula, tiempoEstacionado);
		this.centimetrosCubicos = centimetrosCubicos;
	}

	public double getCentimetrosCubicos() {
		return centimetrosCubicos;
	}

	public void setCentimetrosCubicos(double centimetrosCubicos) {
		this.centimetrosCubicos = centimetrosCubicos;
	}

	@Override
	public String toString() {
		return "Moto [centimetrosCubicos=" + centimetrosCubicos + ", getMatricula()=" + getMatricula()
				+ ", getTiempoEstacionado()=" + getTiempoEstacionado() + "]";
	}

	public double calcularPrecio(double cantidadFija, double sumaFurgoneta) {
		double topeCentimetrosCubicos = 250.0, dos = 2.0;
		if (centimetrosCubicos < topeCentimetrosCubicos) {
			return super.calcularPrecio(cantidadFija, sumaFurgoneta) / dos;
		} else {
			return super.calcularPrecio(cantidadFija, sumaFurgoneta);
		}
	}
}
