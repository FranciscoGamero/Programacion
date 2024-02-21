package ejercicio01;

public class Revista extends Publicacion {

	private int edicion;

	public Revista(String titulo, String autor, int anio, boolean prestados, int edicion) {
		super(titulo, autor, anio, prestados);
		this.edicion = edicion;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}



	@Override
	public String toString() {
		return "Revista [edicion=" + edicion + ", getEdicion()=" + getEdicion() + ", getTitulo()=" + getTitulo()
				+ ", getAutor()=" + getAutor() + ", getAnio()=" + getAnio() + ", isPrestados()=" + isPrestados() + "]";
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
			if (lista[i] != null && lista[i].getAnio() <= anio) {
				cont++;
			}
		}
		return cont;
	}
	public void avisoRevistas(int cantidad) {
		if(edicion==cantidad) {
			System.out.println("Has publicado "+ cantidad + " revistas");
		}
	}
}
