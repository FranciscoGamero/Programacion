package ejercicio04;

public class Cilindro {
	private double radio;
	private double altura;
	
	

	public Cilindro(double radio, double altura) {
		super();
		this.radio = radio;
		this.altura = altura;
	}
	public double calcularVolumen() {
		double volumen, dos = 2.0;
		volumen = Math.PI * Math.pow(radio, dos)*altura;
		return volumen;
	}
	public void mostrarVolumen(double volumen) {
		System.out.printf("El volumen del cilindro es: %.2f centímetros cúbicos",volumen);
	}
}
