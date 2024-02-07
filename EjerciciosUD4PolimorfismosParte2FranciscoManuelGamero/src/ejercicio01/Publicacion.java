package ejercicio01;

public abstract class Publicacion implements IPublicaciones {

	private String titulo;
	private String autor;
	private int anio;
	private boolean prestados;

	public Publicacion(String titulo, String autor, int anio, boolean prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.prestados = prestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isPrestados() {
		return prestados;
	}

	public void setPrestados(boolean prestados) {
		this.prestados = prestados;
	}

	@Override
	public abstract int cuentaPrestados(Publicacion[] lista);

	@Override
	public abstract int cuentaPublicacionesAnterioresA(Publicacion[] lista, int anio);
}
