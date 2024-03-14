package ejemploDiapositivas;

import java.util.List;

public class Instituto {
	
	private String nombre;
	private List<Ciclo> ciclosImpartidos;
	
	public Instituto(String nombre, List<Ciclo> ciclosImpartidos) {
		super();
		this.nombre = nombre;
		this.ciclosImpartidos = ciclosImpartidos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Ciclo> getCiclosImpartidos() {
		return ciclosImpartidos;
	}
	public void setCiclosImpartidos(List<Ciclo> ciclosImpartidos) {
		this.ciclosImpartidos = ciclosImpartidos;
	}
	
	

}
