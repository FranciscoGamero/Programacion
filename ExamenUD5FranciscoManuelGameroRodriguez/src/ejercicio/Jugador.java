package ejercicio;

public class Jugador implements Comparable<Jugador> {

	private String nombre;
	private String posicion;
	private int numCamiseta;
	private int golesAnotados;
	private boolean titular;

	public Jugador(String nombre, String posicion, int numCamiseta, int golesAnotados, boolean titular) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.numCamiseta = numCamiseta;
		this.golesAnotados = golesAnotados;
		this.titular = titular;
	}

	public Jugador() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumCamiseta() {
		return numCamiseta;
	}

	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}

	public int getGolesAnotados() {
		return golesAnotados;
	}

	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numCamiseta=" + numCamiseta
				+ ", golesAnotados=" + golesAnotados + ", titular=" + titular + "]";
	}

	@Override
	public int compareTo(Jugador j) {
		return this.getPosicion().compareTo(j.getPosicion());
	}
}
