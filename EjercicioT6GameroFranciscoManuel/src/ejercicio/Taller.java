package ejercicio;

public class Taller {

	public void comprobarGarantia(Coche c, int aniosAntiguedad) throws GarantiaPasada{
		if(aniosAntiguedad<=c.getAniosDeGarantia()) {
			System.out.println("El vehículo sigue en garantía");
		} else {
			throw new GarantiaPasada("La garantía ya ha pasado.");
		}
	}
	public void comprobarPrecioArreglo(Coche c) throws PrecioArregloNegativo{
		if(c.getPrecioReparacion()<0) {
			throw new PrecioArregloNegativo("El precio de arreglo introducido es negativo.");
		} 
	}
	public void comprobarMatricula(Coche c) throws MatriculaErronea{
		if(!c.getMatricula().matches("[0-9]{4}[A-Z]{3}")) {
			throw new MatriculaErronea("La matricula del vehículo no cumple el formato español.");
		}
	}
}
