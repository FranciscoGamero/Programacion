package ejemploLambda;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje= "Hola";
		int num = 5;
		int num2 = 2, num3=4;
		double dos= 2;
		double lista[] = {1.2,32.2,978.2};
		List<Alumno> listaAlumnos = new ArrayList<>();
		listaAlumnos.add(new Alumno(19,1.65));
		listaAlumnos.add(new Alumno(18, 2.01));
		listaAlumnos.add(new Alumno(23, 1.76));
		listaAlumnos.add(new Alumno(28, 1.58));
		
		
		// CREADAS POR MI CREADAS POR MI CREADAS POR MI CREADAS POR MI CREADAS POR MI CREADAS POR MI
		IBienvenida bienvenida = (loQueRecibe) -> System.out.println(mensaje);
		bienvenida.mostrarBienvenida(mensaje);
		
		
		ISumarDos suma = numRecibido -> numRecibido+2;
		System.out.println(suma.sumarNum(num));
		
		ISumarDosNumeros suma2 = (numero1,numero2) -> numero1+numero2+2;
		System.out.println(suma2.sumarDosNum(num2, num3)+"\n");
		
		// CREADAS POR MI CREADAS POR MI CREADAS POR MI CREADAS POR MI CREADAS POR MI CREADAS POR MI
		
		//Supplier
		Supplier<Double> mitad = () -> Math.random()*100;
		System.out.println(mitad.get()/dos+"\n");
		
		//Consumer
		Consumer<Double> mostrarNumeros = (numerin) -> System.out.println(numerin);
		for (int i = 0; i < lista.length; i++) {
			mostrarNumeros.accept(lista[i]);
		}
		System.out.println("");
		
		//Function
		Function<Alumno,Integer> aMeses = (alumn) -> alumn.getEdad()*12;
		Function<Alumno,Integer> aDecadas = (alumn) -> alumn.getEdad()/10;
		for (Alumno a : listaAlumnos) {
			System.out.println(aMeses.apply(a)+" meses");
		}
		System.out.println("");
		for (Alumno a : listaAlumnos) {
			System.out.println(aDecadas.apply(a)+" decadas");
		}
		
		//BiFunction
		//Un método que hace una multiplicacion para probar
		BiFunction<Integer, Double, Double> multiplicacion = (edadAlumno, alturaAlumno) -> 
			edadAlumno * alturaAlumno;
		for (Alumno a : listaAlumnos) {
			System.out.print(a +" ");
			System.out.printf("%.2f",multiplicacion.apply(a.getEdad(), a.getAltura()));
			System.out.println();
		}
	}

}
