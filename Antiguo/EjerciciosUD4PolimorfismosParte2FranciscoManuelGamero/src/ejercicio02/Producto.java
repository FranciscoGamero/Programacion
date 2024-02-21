package ejercicio02;

public class Producto implements IImpuesto{
	
	private int codIden;
	private String nombre;
	
	public Producto(int codIden, String nombre) {
		super();
		this.codIden = codIden;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodIden() {
		return codIden;
	}

	public void setCodIden(int codIden) {
		this.codIden = codIden;
	}

	@Override
	public double calculoIva(double precio, int iva) {
		double cien =100;
		return precio+(precio/iva*cien);
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
