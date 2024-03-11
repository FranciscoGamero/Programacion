package ejemploLambda;

public class Alumno {

	private int edad;
	private double altura;

	public Alumno(int edad, double altura) {
		super();
		this.edad = edad;
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Alumno [edad=" + edad + ", altura=" + altura + "]";
	}
	
	
}
