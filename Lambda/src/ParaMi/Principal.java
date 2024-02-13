package ParaMi;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas= new ArrayList();
		
		CrudPersona c= new CrudPersona(listaPersonas);
		
		listaPersonas.add(new Persona(16,"Cristian"));
		listaPersonas.add(new Persona(25,"Zuri"));
		listaPersonas.add(new Persona(14,"Jon"));
		listaPersonas.add(new Persona(21,"Ana"));
		
		c.mostrarMenores();
	}

}
