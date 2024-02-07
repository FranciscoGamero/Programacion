package ejercicio01;

public class Nota {

	private String titulo;
	private String cuerpo;
	private int id;

	public Nota(String titulo, String cuerpo, int id) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nota [titulo=" + titulo + ", cuerpo=" + cuerpo + ", id=" + id + "]";
	}

}
