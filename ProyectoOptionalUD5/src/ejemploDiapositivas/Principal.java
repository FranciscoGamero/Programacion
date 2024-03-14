package ejemploDiapositivas;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ejemplo mostrado en las diapositivas del PowerPoint de la explicación
		 * del uso de Optional. En este paqute no se usa Optional, solo se muestra
		 * un ejemplo de código preventivo con varios if encadenados.
		 * 
		 * Para ver el uso de Optional y sus métodos, ver el paquete ejemploCompletoOptional */
		
		List<Instituto> listaInstitutos = new ArrayList<Instituto>();
		List<Ciclo> listaCiclos = new ArrayList<Ciclo>();	
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		Alumno alumno = new Alumno("Pepe");
		listaAlumnos.add(alumno);
		
		Ciclo ciclo = new Ciclo("DAM", listaAlumnos);
		listaCiclos.add(ciclo);
		
		Instituto instituto = new Instituto("Salesianos Triana", listaCiclos);
		listaInstitutos.add(instituto);
		
		Ciudad ciudad = new Ciudad("Sevilla", listaInstitutos);
		
		Gestion gest = new Gestion(ciudad);
		
		System.out.println("----");
		gest.mostrarNombreAlumno();
		System.out.println("----");

	}

}
