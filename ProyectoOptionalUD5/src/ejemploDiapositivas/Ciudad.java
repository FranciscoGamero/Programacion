package ejemploDiapositivas;

import java.util.List;

public class Ciudad {
	
	private String nombre;
	private List<Instituto> listadoInstitutos;
	
	public Ciudad(String nombre, List<Instituto> listadoInstitutos) {
		super();
		this.nombre = nombre;
		this.listadoInstitutos = listadoInstitutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Instituto> getListadoInstitutos() {
		return listadoInstitutos;
	}

	public void setListadoInstitutos(List<Instituto> listadoInstitutos) {
		this.listadoInstitutos = listadoInstitutos;
	}
	
	
	
	

}
