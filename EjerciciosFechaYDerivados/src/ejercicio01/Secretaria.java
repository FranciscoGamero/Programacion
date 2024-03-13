package ejercicio01;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secretaria {

	private List<Alumno> listaAlumnos;

	public Secretaria(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	public void agregarAlumno(Alumno a) {
		listaAlumnos.add(a);
	}
	
	public void mostrarLista(List<Alumno> listaExterna) {
		listaExterna.forEach(a -> System.out.println(a));
	}
	
	public List<Alumno> filtrarPorEdad(int edad){
		
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getEdad()<=edad)
				.toList();
	}
	
	public List<Alumno> buscarPorLetra(String letra){
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNombre().startsWith(letra.toUpperCase()))
				.toList();
	}
	
	public double contarLista(List<Alumno> listaExterna) {
		return listaExterna.stream()
				.count();
	}
	
	public List<Alumno> buscarPorNota(double nota, String curso){
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNotaMedia()>nota && alumno.getNombreCurso().equalsIgnoreCase(curso))
				.toList();
	}
	
	public void mostrarNAlumnos(int cantidad) {
		mostrarLista(listaAlumnos.stream()
				.limit(cantidad)
				.toList());
	}
	public Optional<Alumno> buscarMasPequenio() {
		Comparator<Alumno> compararEdad = Comparator.comparingInt(Alumno::getEdad);
		return listaAlumnos.stream()
				.min(compararEdad);
	}
	public Optional<Alumno> buscarPrimero() {
		return listaAlumnos.stream()
				.findFirst();
	}
	public List<Alumno> buscarPorLongitudNombre(int longitud){
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNombre().chars()
							.count()>longitud)
				.toList();
	}
	public List<Alumno> buscarPorLetraYLongitud(String letra, int longitud){
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNombre().startsWith(letra.toUpperCase()) && alumno.getNombre().chars()
						.count()<=longitud)
				.toList();
	}
}
