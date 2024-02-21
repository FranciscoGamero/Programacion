package EjercicioEjemplo;

public class ClienteVip extends Cliente{
	
	public ClienteVip(String nombre, String dni, int edad) {
		super(nombre, dni, edad);
		// TODO Auto-generated constructor stub
	}

	private int numInvitaciones;
	private boolean reservado;
}
