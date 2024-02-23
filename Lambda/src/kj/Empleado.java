package kj;

import java.util.function.Predicate;

public class Empleado {

	   public String nombre;
	   public int edad;

	   public Empleado() {
	      // Default constructor
	   }

	   public Empleado(String nombre, int edad) {
	      this.nombre = nombre;
	      this.edad = edad;
	   }

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	//	InterfazFuncional <LoQueRecibe,LoQueDevuelve> 
	//	NombreDeLambda(El que le quieras dar) = LoQueRecibe -> LoQueRealiza																	
}




