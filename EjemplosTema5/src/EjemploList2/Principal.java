package EjemploList2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Persona p1 = new Persona("Pedro", 18, "12345678J");
		List<Persona> listado = new ArrayList<Persona>();
		CrudPersona c= new CrudPersona(listado);
		listado.add(new Persona("Antonio", 28, "87654321A"));
		
		listado.add(p1);
		listado.add(p1);// Para comprobar que los List si permiten duplicados

		//System.out.println(c.buscarPorDNI("12345678J"));
		//System.out.println(listado.get(c.buscarPorDNIV2("87654321A")));
		c.mostrarListado();
		c.eliminarPersona(c.buscarPorDNI("12345678J"));
		//c.mostrarListado();
		//c.eliminarPersonaV2(c.buscarPorDNIV2("87654321A"));
		//c.mostrarListado();
	}

}
