package ejemploDiapositivas;

import java.util.List;

public class Ciclo {
	
	private String nombre;
	private List<Alumno> listado;
	
	public Ciclo(String nombre, List<Alumno> listado) {
		super();
		this.nombre = nombre;
		this.listado = listado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getListado() {
		return listado;
	}

	public void setListado(List<Alumno> listado) {
		this.listado = listado;
	}
	
	
	
	

}
