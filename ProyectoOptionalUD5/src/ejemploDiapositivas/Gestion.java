package ejemploDiapositivas;

public class Gestion {
	
	private Ciudad ciudad;

	public Gestion(Ciudad ciudad) {
		super();
		this.ciudad = ciudad;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public void mostrarNombreAlumno() {
		if(ciudad.getListadoInstitutos() != null) {
			for ( Instituto i : ciudad.getListadoInstitutos()) {
				if(i != null) {
					if(i.getCiclosImpartidos() != null) {
						for (Ciclo  c : i.getCiclosImpartidos()) {
							if(c != null) {
								if(c.getListado() != null) {
									for (Alumno a : c.getListado()) {
										if (a != null) {
											if (a.getNombre() != null) {
												System.out.println(a.getNombre());
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	
	
	
	
}
