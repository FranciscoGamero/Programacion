package ejercicio02;

public class Circulo {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
// En los metodos de calcular UNICAMENTE SE CALCULA, no se muestra nada nuncas
	public double calcularAreaCm() {
		double areaCm, dos = 2.0;
		areaCm = Math.PI * Math.pow(radio, dos);
		return areaCm;
	}
	
	public double pasarAMCuadrado(double area) {
		double diez = 10, cuatro = 4;
	
		return area / Math.pow(diez, cuatro);
	}
/*	 Se podria hacer tambien asi para ahorrar código
	public double calcularAreaM() {
		return calcularAreaCm / Math.pow(diez, cuatro);
	}*/
}
