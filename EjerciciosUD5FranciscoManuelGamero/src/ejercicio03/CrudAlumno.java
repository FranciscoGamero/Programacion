package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {

	private Set<Alumno> lista;

	public CrudAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}
	
	public void agregarAlumno(Alumno a) {
		lista.add(a);
	}
	
	public Alumno buscarPorCodigo(int cod) {
		for (Alumno alumn : lista) {
			if(alumn.getCodAlumno()==cod) {
				return alumn;
			}
		}
		return null;
	} //Es mas comodo el V1
	public Alumno buscarPorCodigoV2(int cod) {
		Alumno aux=null;
		boolean encontrado=false;
		Iterator <Alumno> it = lista.iterator();
		while(it.hasNext() && !encontrado) {
			aux = it.next();
			if(aux.getCodAlumno()==cod) {
				encontrado=true;
			}
		}
		return aux;
	}
	public void mostrarAlumno(int cod) {
		System.out.println(buscarPorCodigo(cod));
	}
	public void modificarNotaMedia(int cod,double nuevaNota) {
		buscarPorCodigo(cod).setNotaMedia(nuevaNota);
	}
	public void eliminarAlumno(int cod) {
		lista.remove(buscarPorCodigo(cod));
	}
	
	public void mostrar() {
		Iterator<Alumno> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
