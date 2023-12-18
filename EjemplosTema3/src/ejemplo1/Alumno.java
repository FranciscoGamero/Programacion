package ejemplo1;

public class Alumno {

	// Lo primero que se ponen son los atributos
	// NO SE LE PONEN VALORES A LOS ATRIBUTOS y siempre se ponen private
	private String nombre;
	private int edad;
	private double notaMedia;
	
	//Constructores (para crear un objeto con valores iniciales)
	//Lo que hay dentro del parentesis se le llama "Parametros" O "Argumentos"
	//Se pone en el mismo orden de arriba
	
	public Alumno (String nombre, int edad, double notaMedia) {
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;

	}
	public Alumno (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public Alumno () {
		
	}

	//Métodos, siempre se ponen en infinitivo

	//primer metodo para imprimir
	
	// Dentro del parentesis van los parametros que necesita
	public void mostrarDatos (String calle) {
	//Lo que está entre el nombre del método y el public es el tipo de dato que se obtiene con el método, sino se obtiene nada se usa "void"
		System.out.println("Los datos del alumno son: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota Media: "+notaMedia);
		System.out.println("Calle: "+calle);
	}
}
