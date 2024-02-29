package examen;

public class Cancion {
	
	private int id;
	private String titulo;
	private String interprete;
	private int numVecesEscuchada;
	private boolean gratis;
	private double duracion;
	
	public Cancion(int id, String titulo, String interprete, int numVecesEscuchada, boolean gratis, double duracion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.interprete = interprete;
		this.numVecesEscuchada = numVecesEscuchada;
		this.gratis = gratis;
		this.duracion = duracion;
	}
	public Cancion() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public int getNumVecesEscuchada() {
		return numVecesEscuchada;
	}

	public void setNumVecesEscuchada(int numVecesEscuchada) {
		this.numVecesEscuchada = numVecesEscuchada;
	}

	public boolean isGratis() {
		return gratis;
	}

	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", interprete=" + interprete + ", numVecesEscuchada="
				+ numVecesEscuchada + ", gratis=" + gratis + ", duracion=" + duracion + "]";
	}
	
}
