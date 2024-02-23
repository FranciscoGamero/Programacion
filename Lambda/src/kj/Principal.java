package kj;

import java.util.function.Supplier;

public class Principal {

	   public static void main(String[] args) {
		   		//Llama al constructor de Empleado vacío
		      Supplier<Empleado> empleadoSupplier =  Empleado::new;
		      	//Le da a empleado ese empleado vacio creado en "empleadoSupplier"
		      Empleado empleado = empleadoSupplier.get();

		      // Pone un nombre y edad por defecto
		      empleado.nombre = "John Doe";
		      empleado.edad = 30;

		      System.out.println(empleado);
		   }

}
