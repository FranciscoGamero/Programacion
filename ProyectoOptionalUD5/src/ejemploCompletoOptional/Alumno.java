package ejemploCompletoOptional;

public class Alumno {
	
	//Atributos
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private String curso;
	
	//Constructores
	public Alumno(int id, String nombre, String apellidos, int edad, String curso) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.curso = curso;
	}
	
	public Alumno() {
		
	}
	
	//Getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//toString
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", curso="
				+ curso + "]";
	}
	
	
	

}
