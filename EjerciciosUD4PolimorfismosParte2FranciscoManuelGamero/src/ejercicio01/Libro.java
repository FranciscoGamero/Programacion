package ejercicio01;

public class Libro extends Publicacion {

	private String isbn;

	public Libro(String titulo, String autor, int anio, boolean prestados, String isbn) {
		super(titulo, autor, anio, prestados);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getAnio()=" + getAnio()
				+ ", isPrestados()=" + isPrestados() + "]";
	}

	@Override
	public int cuentaPrestados(Publicacion[] lista) {
		int cont = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null && lista[i].isPrestados()) {
				cont++;
			}
		}
		return cont;
	}

	@Override
	public int cuentaPublicacionesAnterioresA(Publicacion[] lista, int anio) {
		int cont = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null && lista[i].getAnio() < anio) {
				cont++;
			}
		}
		return cont;
	}
}
