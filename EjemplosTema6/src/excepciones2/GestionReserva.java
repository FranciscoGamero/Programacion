package excepciones2;

import java.time.LocalDate;

public class GestionReserva {

	public void generarReserva(LocalDate fechaExterna) throws ReservaPasada{
		
		if(fechaExterna.isBefore(LocalDate.now())){
			throw new ReservaPasada("Hola");
		} else {
			System.out.println("Reserva realizada");
		}
	}
}
