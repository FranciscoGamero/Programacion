package ejercicio06;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Trabajador> lista = new ArrayList<>();
		
		lista.add(new Trabajador("Candi","123456789p",22,10));
		lista.add(new Trabajador("Pedro","987654321ñ",15,14.2));
		lista.add(new Trabajador("Tomas","13592563h",26,8.2));
		lista.add(new Trabajador("Marco","92648125a",40,1));
		lista.add(new Trabajador("Dario","01783566m",19,7.3));
	}

}
