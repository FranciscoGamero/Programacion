package ejemploFecha;

import java.time.LocalDate;
import java.time.Month;

public class Principal {

	public static void main(String[] args) {
		
		LocalDate hoy= LocalDate.now();
		System.out.println(hoy);
		LocalDate ayer= LocalDate.of(2024, 3, 6);
		System.out.println(ayer);
		LocalDate fecha1= LocalDate.of(2005,Month.MAY,29);
		System.out.println(fecha1);
		System.out.println(fecha1.lengthOfYear()+" "+fecha1.lengthOfMonth());
		fecha1.minusYears(2); //fecha.minusDia/Mes/Año(cantidad) para restar
		LocalDate fecha2 = LocalDate.parse("2002-02-11");
		System.out.println(fecha2);
		fecha2.plusYears(1); //fecha.plusDia/Mes/Año(cantidad) para sumar
		System.out.println(fecha2);
		//Para cambiar el formato de una fecha se usa
	}

}
