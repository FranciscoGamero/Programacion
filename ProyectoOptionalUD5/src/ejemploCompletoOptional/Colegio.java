package ejemploCompletoOptional;

import java.util.List;
import java.util.Optional;

public class Colegio {
	
	//Atributos
	private List<Alumno> lista;
	private int numAlumnos;
	
	//Constrcutores
	public Colegio(List<Alumno> lista, int numAlumnos) {
		super();
		this.lista = lista;
		this.numAlumnos = numAlumnos;
	}
	
	//Getters y setters
	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	
	//toString
	public String toString() {
		return "Colegio [lista=" + lista + ", numAlumnos=" + numAlumnos + "]";
	}
	
	
	//Métodos
	/**
	 * Método que busca en la lista de Alumnos si hay algún alumno nulo. Para evitar NullPointerException,
	 * creo el optional que mira si el alumno es nulo o no. Si es nulo, imprime un mensaje indicando que 
	 * el alumno no existe. Si no es nulo, imprime el Alumno
	 * 
	 */
	public void mostrarLista() {
		for (int i = 0; i < lista.size(); i++) {
			Optional<Alumno> opt = Optional.ofNullable(lista.get(i));
			if (opt.isPresent()) {
				System.out.println(lista.get(i));
			}else {
				System.err.println("Este alumno no está disponible.");
			}
		}
	}
	
	/**
	 * Método que busca un alumno pasándole como parámetro el id de este
	 * y va comparando con los distintos alumnos de la lista para que cuando 
	 * coincida el id lo devuelva
	 * 
	 * @param id
	 * @return Optional que puede tener un Alumno dentro si se encuentra en la lista
	 * o por el contrario un Optional vacío
	 */
	public Optional<Alumno> findById(int id) {
		boolean encontrado = false;
		int i = 0;
		Optional<Alumno> opt = Optional.empty();
		
		while(i < lista.size() && !encontrado) {
			opt = Optional.ofNullable(lista.get(i));
			if(opt.isPresent()) {
				if (opt.get().getId()==id) {
					encontrado = true;
				}else {
					i++;
				}		
			}else {
				i++;
			}
		}
		
		if (encontrado) {
			return opt;
		}else {
			opt=Optional.empty();
			return opt;
		}
	}
	
	/**
	 * Método que va de la mano con el find. Si no se ha encontrado el
	 * alumno, muestra un mensaje de que no se ha encontrado mendiante
	 * el uso de un Optional
	 * 
	 * @param opt (Optional que puede tener o no tener un Alumno dentro)
	 */
	public void mostrarMensajeAlumno(Optional<Alumno> opt) {
		if (opt.isEmpty()) {
			System.err.println("Alumno no encontrado, seleccione otro.");
		}else {
			System.out.println(opt);
		}
	}
	
	/**
	 * Método que muestra el nombre de un alumno pasado como parámetro.
	 * Si es nulo, devuelve un mensaje de error
	 * 
	 * @param opt (Optional que puede tener o no tener un Alumno dentro)
	 */
	public void mostrarNombreAlumno(Optional<Alumno> opt) {	
		if (opt.isPresent()) {
			if(opt.get().getNombre() != null) {
				System.out.println(opt.get().getNombre());
			}else {
				System.err.println("No disponible.");
			}		
		}else {
			mostrarMensajeAlumno(opt);
		}
	}
	
	/**
	 * Método que muestra los apellidos de un alumno pasado como parámetro.
	 * Si es nulo, devuelve un mensaje de error
	 * 
	 * @param opt (Optional que puede tener o no tener un Alumno dentro)
	 */
	public void mostrarApellidosAlumno(Optional<Alumno> opt) {	
		if (opt.isPresent()) {
			if(opt.get().getApellidos() != null) {
				System.out.println(opt.get().getApellidos());
			}else {
				System.err.println("No disponible.");
			}		
		}else {
			mostrarMensajeAlumno(opt);
		}
	}
	
	/**
	 * Método que muestra la edad de un alumno pasado como parámetro.
	 * Si es nulo, devuelve un mensaje de error
	 * 
	 * @param opt (Optional que puede tener o no tener un Alumno dentro)
	 */
	public void mostrarEdadAlumno(Optional<Alumno> opt) {	
		if (opt.isPresent()) {
			if(opt.get().getEdad() != 0) {
				System.out.println(opt.get().getEdad());
			}else {
				System.err.println("No disponible.");
			}		
		}else {
			mostrarMensajeAlumno(opt);
		}
	}
	
	/**
	 * Método que muestra el curso de un alumno pasado como parámetro.
	 * Si es nulo, devuelve un mensaje de error
	 * 
	 * @param opt (Optional que puede tener o no tener un Alumno dentro)
	 */
	public void mostrarCursoAlumno(Optional<Alumno> opt) {
		if (opt.isPresent()) {
			if(opt.get().getCurso() != null) {
				System.out.println(opt.get().getCurso());
			}else {
				System.err.println("No disponible.");
			}		
		}else {
			mostrarMensajeAlumno(opt);
		}
	}
	
	/**
	 * Método que sirve, sobre todo, para mostrar el método orElse() de
	 * la clase Optional, cambiando los alumnos nulos por dummys pasados como parámetro
	 * 
	 * @param dummy
	 */
	public void cambiarAlumnoPorDummy(Alumno dummy) {
		
		for (int i = 0; i < lista.size(); i++) {
			Optional<Alumno> opt = Optional.ofNullable(lista.get(i));
			if(opt.isEmpty()) {
				lista.remove(i);
				lista.add(opt.orElse(dummy));
			}
		}
	}
	
	
}
