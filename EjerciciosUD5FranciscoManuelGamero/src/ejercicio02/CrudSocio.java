package ejercicio02;

import java.util.List;

public class CrudSocio {

	private List<Socio> listaSocio;

	public CrudSocio(List<Socio> listaSocio) {
		super();
		this.listaSocio = listaSocio;
	}

	public List<Socio> getListaSocio() {
		return listaSocio;
	}

	public void setListaSocio(List<Socio> listaSocio) {
		this.listaSocio = listaSocio;
	}

	public void agregarSocio(Socio s) {
		listaSocio.add(s);
	}

	public Socio buscarSocioPorId(int id) {
		boolean encontrado = false;
		Socio s = null;
		for (int i = 0; i < listaSocio.size() && !encontrado; i++) {
			if (listaSocio.get(i).getId() == id) {
				s = listaSocio.get(i);
				encontrado = true;
			}
		}
		return s;
	}

	public void mostrarSocio(int id) {
		if (!listaSocio.isEmpty()) {
			System.out.println(buscarSocioPorId(id));
		}
	}

	public void modificarCuota(int id, double cuota) {
		if (!listaSocio.isEmpty()) {
			buscarSocioPorId(id).setCuota(cuota);
		}
	}

	public void borrarSocio(Socio socio) {
		if (!listaSocio.isEmpty()) {
			listaSocio.remove(socio);
		}
	}
}
