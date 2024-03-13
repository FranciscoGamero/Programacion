package ejercicio02;

public class Palabra {

	private String palabra;

	public Palabra(String palabra) {
		super();
		this.palabra = palabra;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public String toString() {
		return "Palabra [palabra=" + palabra + "]";
	}
	
	
}
