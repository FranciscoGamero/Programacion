package excepciones2;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		GestionReserva ges= new GestionReserva();
		//Excepcion donde si reservas el dia de ayer no te deje
		LocalDate fecha;
		try {
			System.out.println("Inserte la fecha");
			aux=sc.nextLine();
			fecha= LocalDate.parse(aux);
			ges.generarReserva(fecha);
			
		}catch(RuntimeException e) {
			System.out.println("No ha insertado una fecha");
		}catch(ReservaPasada rp) {
			rp.getMessage();
		}
		//"2002-02-11"
	}

}
