package ejemplo_interfaces;

public class Persona implements IDepredador{

	private String Nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		Nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", edad=" + edad + "]";
	}
	@Override
	public void localizar(Animal presa) {
		// TODO Auto-generated method stub
		System.out.println("Persona con prismaticos");
	}
	@Override
	public void cazar(Animal presa) {
		// TODO Auto-generated method stub
		System.out.println("Disparando");
	}
	
	
}
