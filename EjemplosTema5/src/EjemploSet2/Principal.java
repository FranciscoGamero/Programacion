package EjemploSet2;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Persona> lista = new HashSet<Persona>();

		lista.add(new Persona("Ángel",34,"123a"));
		lista.add(new Persona("Rafa",37,"123b"));
		lista.add(new Persona("Miguel",67,"123c"));
		
		System.out.println(lista);
		//lista.remove();
	}

}
