package ejercicios;

public class Vehiculo implements IAparcamiento {

	private String matricula;
	private double tiempoEstacionado;

	public Vehiculo(String matricula, double tiempoEstacionado) {
		super();
		this.matricula = matricula;
		this.tiempoEstacionado = tiempoEstacionado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getTiempoEstacionado() {
		return tiempoEstacionado;
	}

	public void setTiempoEstacionado(double tiempoEstacionado) {
		this.tiempoEstacionado = tiempoEstacionado;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tiempoEstacionado=" + tiempoEstacionado + "]";
	}

	@Override
	public double calcularPrecio(double cantidadFija, double sumaFurgoneta) {
		return cantidadFija * tiempoEstacionado;
	}

}
